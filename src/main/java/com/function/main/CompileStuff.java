package com.function.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CompileStuff {

    public static final List<McFunction> allTouched = new ArrayList<>();
    public static void main(String[] args) {
        File dir = new File("testfiles");

        Path data = Paths.get(dir.getAbsolutePath(), "data");
        File[] files = data.toFile().listFiles();
        if (files == null) {
            System.out.println("nothing found under " + data);
            return;
        }
        for (File file : files) {
            if (!file.isDirectory()) {
                continue;
            }
            Path functionsPath = Paths.get(file.getAbsolutePath(), "functions");
            try {
                Files.walk(functionsPath)
                        .filter(path -> path.toFile().getName().endsWith(".function"))
                        .map(path -> new McFunctionFile(path.toFile(), dir))
                        .peek(McFunctionFile::parse)
                        .forEach(McFunctionFile::save);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(data);
        System.out.println("Worked in");
        allTouched.stream().map(McFunction::getFileLocation).forEach(System.out::println);
    }
}
