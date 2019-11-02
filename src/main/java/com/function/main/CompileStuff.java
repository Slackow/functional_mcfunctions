package com.function.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Consumer;

public class CompileStuff {

    public static void main(String[] args) {
        File dir = new File("testfiles");
        if (!dir.isDirectory()) {
            dir = new File(".");
            while (!"data".equals(dir.getName())){
                dir = dir.getParentFile();
            }
        }
        System.out.println(dir);
        try {
            Files.walk(dir.toPath())
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .filter(file -> file.getName().endsWith(".function"))
                    .map(McFunctionFile::new)
                    .forEach(mcFunctionFile -> {
                        mcFunctionFile.parse();
                        mcFunctionFile.save();
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
