package com.function.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CompileStuff {

    static final Map<String, Path> allTouched = new HashMap<>();
    static final Map<String, Path> allUntouched = new HashMap<>();

    public static void main(String[] args) {
        File dir = new File("testfiles");
        compile(dir);
    }

    public static void compile(File dir) {
        allTouched.clear();
        allUntouched.clear();
        getAllFilesInDataPack(dir, ".function")
                .peek(System.out::println)
                .map(path -> new McFunction(path, dir.toPath()))
                .forEach(mcFunction -> {
                    mcFunction.parse();
                    allTouched.putAll(mcFunction.save());
                });
        getAllFilesInDataPack(dir, ".mcfunction")
                .filter(o -> !allTouched.containsValue(o))
                .filter(path -> {
                    try {
                        return Files.lines(path).findFirst().orElse("").startsWith("#Generated with");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return false;
                })
                .forEach(value -> {
                    Path data = Paths.get(dir.toString(), "data");
                    Path path1 = data.toAbsolutePath();
                    Path pathRelative = path1.relativize(value);
                    //System.out.println(pathRelative);
                    String item = pathRelative.toString().replaceFirst("\\\\functions\\\\", ":");
                    allUntouched.put(item, value);
                });

    }

    private static Stream<Path> getAllFilesInDataPack(File dir, String extension) {
        Path data = Paths.get(dir.getAbsolutePath(), "data");
        File[] files = data.toFile().listFiles();
        if (files == null) {
            System.out.println("nothing found under " + data);
            return Stream.empty();
        }

        Stream<Path> stream = Stream.empty();
        for (File file : files) {
            if (file.isDirectory()) { // optimally, the data folder should only have directories, but this is to be safe
                Path functionsPath = Paths.get(file.getAbsolutePath(), "functions");
                if (!functionsPath.toFile().isDirectory()) {
                    continue;
                }
                try {
                    stream = Stream.concat(stream, Files.walk(functionsPath)
                            .filter(path -> path.toFile().getName().endsWith(extension)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stream;
    }
}
