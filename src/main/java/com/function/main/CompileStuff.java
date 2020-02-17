package com.function.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.function.main.Datapack.pathToNamespace;

public class CompileStuff {

    static final Map<String, Path> allTouched = new HashMap<>();
    static final Map<String, Path> allUntouched = new HashMap<>();

    public static Logger LOGGER = Logger.getLogger(CompileStuff.class.getName());

    static {
        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(new Handler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println(record.getLevel() + ": " + record.getMessage());
            }

            @Override
            public void flush() {

            }

            @Override
            public void close() throws SecurityException {

            }
        });
    }

    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("testfiles");
        compile(dir);
    }

    public static void compile(Path dir) throws IOException {
        allTouched.clear();
        allUntouched.clear();
        LOGGER.info("Compiling: " + dir.getFileName());
        List<Path> functions = getAllFilesInDataPack(dir, ".function")
                .collect(Collectors.toList());
        Datapack datapack = new Datapack(dir, functions);
//TODO WORK ON NEW DATAPACK STUFF, LOGGING WINDOW, UNIT TESTS

        datapack.parse();
        allTouched.putAll(datapack.save());

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
                    String item = pathToNamespace(dir, value);
                    allUntouched.put(item, value);
                });

    }

    private static Stream<Path> getAllFilesInDataPack(Path dir, String extension) {
        Path data = dir.resolve("data");
        try {
            return Files.list(data).filter(Files::isDirectory)
                    .map(path -> path.resolve("functions"))
                    .filter(Files::isDirectory)
                    .map(functionPath -> {
                        try {
                            return Files.walk(functionPath).filter(path -> path.toString().endsWith(extension));
                        } catch (IOException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }).flatMap(Function.identity());
        } catch (IOException e) {
            e.printStackTrace();
        }


        return Stream.empty();
    }
}
