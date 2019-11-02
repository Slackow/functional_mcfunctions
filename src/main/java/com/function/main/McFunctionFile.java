package com.function.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class McFunctionFile implements McFunction{
    private List<Lambda> lambdas = new ArrayList<>();
    private List<String> lines;

    public McFunctionFile(File file) {
        try {
            lines = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Lambda> getLambdas() {
        return lambdas;
    }

    @Override
    public void addLambda(Lambda lambda) {

    }

    @Override
    public String getDirectory() {
        return null;
    }

    @Override
    public void parse() {
        lines = lines.stream().map(String::trim).collect(Collectors.toList());
        Lambda currentLambda = null;
        List<List<String>> loop = null;
        Iterator<String> iterator = lines.iterator();
        int balance = 0;
        while (iterator.hasNext()) {
            String line = iterator.next();
            if (line.startsWith("[")) {
                loop = new ArrayList<>();
                iterator.remove();
            }
        }
    }

    @Override
    public void save() {

    }
}
