package com.function.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Lambda implements McFunction {
    private List<Lambda> lambdas = new ArrayList<>();
    private File directory;

    private List<String> lines = new ArrayList<>();

    private String namespace;

    public Lambda(McFunction parent, String namespace) {
        directory = parent.getDirectory();
        this.namespace = namespace;
    }

    public List<String> getLines() {
        return lines;
    }

    @Override
    public List<Lambda> getLambdas() {
        return lambdas;
    }

    @Override
    public void addLambda(Lambda lambda) {
        lambdas.add(lambda);
    }

    @Override
    public File getDirectory() {
        return directory;
    }

    @Override
    public String getNamespace() {
        return namespace;
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lines=\n").append(String.join("\n", getLines()));
        sb.append("\nDir=").append(getDirectory());
        sb.append("\nNamespace=").append(getNamespace());
        sb.append("\nLambdas=");
        for (Lambda lambda : lambdas) {
            sb.append(lambda.toString().replace("\n", "\n\t"));
            sb.append('\n');
        }
        return sb.toString();
    }
}
