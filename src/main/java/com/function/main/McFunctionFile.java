package com.function.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;

public class McFunctionFile implements McFunction {
    private final String namespace;
    private List<Lambda> lambdas = new ArrayList<>();
    private List<String> lines;
    private File directory;


    public McFunctionFile(File location, File directory) {
        this.directory = directory;
        String absolutePath = location.getAbsolutePath();
        this.namespace = absolutePath.substring(
                directory.getAbsolutePath().length() + 6,
                absolutePath.length() - 9
        ).replace("\\functions\\", ":");
        try {
            lines = Files.readAllLines(location.toPath());
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
        lambdas.add(lambda);
    }

    @Override
    public File getDirectory() {
        return directory;
    }

    @Override
    public void parse() {
        lines = lines.stream().map(String::trim).collect(Collectors.toList());

        List<List<String>> loop = new ArrayList<>();
        List<String> loopLines = new ArrayList<>();

        List<Character> block = new ArrayList<>();
        McFunctionFile.State state = McFunctionFile.State.NOT_IN_LOOP;
        StringBuilder string = new StringBuilder();
        int balance = 0;
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            switch (state) {
                case NOT_IN_LOOP:
                    if (line.startsWith("[")) {
                        state = State.IN_START_LOOP;
                        block.add(']');
                        loop.add(new ArrayList<>());
                    } else {
                        break;
                    }
                case IN_START_LOOP:
                    for (int j = 0; j < line.length(); j++) {
                        char charAt = line.charAt(j);

                        if ((block.size() > 0 && charAt == block.get(block.size() - 1)) && j != 0 && line.charAt(j - 1) != '\\') {
                            char c = block.remove(block.size() - 1);
                            if (c == ')') {
                                string.delete(0, string.length());
                                loop.add(new ArrayList<>());
                            } else if (c == '\'') {
                                loop.get(loop.size() - 1).add(string.toString());
                            }
                        } else if (charAt == '\'') {
                            string.delete(0, string.length());
                            block.add('\'');
                        } else if (charAt == '(') {
                            block.add(')');
                        } else if (block.get(0) == ')' && block.size() == 1) {
                            state = State.IN_LOOP;
                            loop.clear();
                        } else {
                            string.append(charAt);
                        }
                    }
                    lines.remove(i);
                    i--;
                    if (state != State.IN_LOOP) {
                        break;
                    }
                case IN_LOOP:
                    loopLines.add(line);
                    lines.remove(i);
                    i--;
                    if (line.endsWith("(")) {
                        balance++;
                    }
                    if (")".equals(line)) {
                        if (balance > 0) {
                            balance--;
                        } else {
                            state = State.NOT_IN_LOOP;
                            for (List<String> col : loop) {
                                int x = 1;
                                List<String> toAddLines = new ArrayList<>();
                                for (String s : col) {
                                    for (String loopLine : loopLines) {
                                        toAddLines.add(loopLine.replace("{" + x + "}", s));
                                    }
                                    x++;
                                }
                                lines.remove(i);
                                lines.addAll(toAddLines);
                                i += toAddLines.size() - 1;
                            }
                        }
                    }
                    break;
            }
        } // end of looping loop
        McFunction.super.parse();
    }

    @Override
    public List<String> getLines() {
        return lines;
    }

    //TODO add namespace
    public String getNamespace() {
        return namespace;
    }

    @Override
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

    enum State {
        IN_LOOP, NOT_IN_LOOP, IN_START_LOOP
    }
}
