package com.function.main;

import java.util.ArrayList;
import java.util.List;

public class Lambda implements McFunction {
    private List<Lambda> lambdas = new ArrayList<>();
    private List<String> lines;
    @Override
    public List<Lambda> getLambdas() {
        return lambdas;
    }

    @Override
    public void addLambda(Lambda lambda) {
        lambdas.add(lambda);
    }

    @Override
    public String getDirectory() {
        return null;
    }

    @Override
    public void parse() {

    }

    @Override
    public void save() {

    }
    public void addLine(String line) {
        lines.add(line);
    }
}
