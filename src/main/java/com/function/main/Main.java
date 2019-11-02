package com.function.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

//    private static String file = System.getenv("APPDATA") + "/.minecraft/saves/Missile Wars for 1.14/" +
//            "datapacks/Missile Wars/data/";
//    private static String[] files = {"mw:loop", "mw:load", "mw:items/give_random_item"};

    private static final Pattern pathPattern = Pattern.compile(".*[/\\\\](.*)[/\\\\]functions[/\\\\](.*)\\.function");
    private static final Pattern functionPathPattern = Pattern.compile("(.+?)( \\d+[tsd]?)");

    private static File dir =
            new File(System.getenv("APPDATA") +
                    "\\.minecraft\\saves\\Missile Wars for 1.14\\datapacks\\Missile Wars\\data\\");

    public static void main(String[] args) {
        File dir;
        boolean examplemode = true;
        //noinspection ConstantConditions
        if (!examplemode)
            dir = new File(Main.dir.getPath());
        else
            dir = new File("testfiles");
        recurOverSub(dir);
    }

    private static void recurOverSub(File dir) {
        File[] filesInDir = dir.listFiles((pathname, name) -> name.endsWith(".function") || pathname.isDirectory());
        assert filesInDir != null;
        if (filesInDir.length > 0) {
            for (File file : filesInDir) {
                if (file.isDirectory()) {
                    recurOverSub(file);
                } else {
                    Matcher matcher = pathPattern.matcher(file.getAbsolutePath());
                    if (matcher.matches()) {
                        System.out.println("bruh");
                        String functionPath = matcher.group(1) + ":" + matcher.group(2);
                        String path = file.getPath();
                        File newFile = new File(path.substring(0, path.lastIndexOf('.')) + ".mcfunction");
                        McFunction mcFunction = new McFunction(newFile, functionPath);
                        try {
                            mcFunction.lines = Files.readAllLines(file.toPath());
                            mcFunction.parse();
                            mcFunction.save();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    private static class McFunction {
        List<String> lines = new ArrayList<>();
        List<McFunction> lambdas = new ArrayList<>();
        File file;
        String functionPath;

        private McFunction(File file, String functionPath) {
            this.file = file;
            this.functionPath = functionPath;
        }

        Path getPath() {
            return file.toPath();
        }

        void addLine(String line) {
            lines.add(line);
        }

        void parse() {
            List<String> newLines = new ArrayList<>();
            McFunction currentLambda = null;
            int balance = 0;
            for (String line : lines) {
                if (currentLambda == null) {
                    if (line.contains("function (")) {
                        String name;
                        int index;
                        String delay = null;
                        if (line.endsWith("function (")) {
                            name = this.functionPath + "/" + (lambdas.size() + 1);
                            index = line.length() - 1;
                        }
                        else {
                            index = line.lastIndexOf("function ( ") + 11;
                            String bruh = line.substring(index);
                            Matcher matcher = functionPathPattern.matcher(bruh);
                            if (matcher.matches()){
                                System.out.println("wow");
                                name = matcher.group(1);
                                delay = matcher.group(2);
                            } else {
                                System.out.println("sucks");
                                name = bruh;
                            }
                        }
                        String path = dir.getPath();
                        currentLambda = new McFunction(new File(path + "/" + name.replace(":", "/functions/")), name);
                        lambdas.add(currentLambda);
                        line = line.substring(0, index) + currentLambda.functionPath;
                        if (delay != null) {
                            line+=delay;
                        }
                    }
                    if (line.endsWith("function $elf")) {
                        line = line.substring(0, line.length() - 4) + functionPath;
                    }
                    line = line.replace("function $", "function " + functionPath + "/");
                    newLines.add(line);
                } else {
                    //when inside a lambda
                    line = line.trim();
                    if (line.contains("function (")) {
                        balance++;
                    }
                    if (line.equals(")")) {
                        if (balance == 0) {
                            currentLambda.parse();
                            currentLambda.save();
                            currentLambda = null;
                        } else {
                            balance--;
                            currentLambda.addLine(line);
                        }
                    } else {
                        currentLambda.addLine(line);
                    }
                }
            }
            lines = newLines;
        }

        void save() {
            try {
                Path path = getPath();
                System.out.println(path);
                Files.createDirectories(path.getParent());
                Files.write(path, lines);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
