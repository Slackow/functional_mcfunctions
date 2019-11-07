package com.function.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface McFunction {
    Pattern pattern = Pattern.compile("function\\s*\\(\\s*([a-z][-_a-z\\d:/]*)?\\s*(\\d+[tsd]?)?$");

    List<Lambda> getLambdas();

    void addLambda(Lambda lambda);

    File getDirectory();

    String getNamespace();

    default void parse() {
        List<String> lines = getLines();
        Lambda currentLambda = null;
        List<Lambda> lambdas = getLambdas();
        int balance = 0;
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            Matcher matcher = pattern.matcher(line);
            if (currentLambda==null) {
                if (matcher.find()) {
                    String nameSpace;
                    String group1 = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group1==null) {
                        nameSpace = getNamespace() + "_" + (lambdas.size() + 1);
                    } else {
                        nameSpace = matcher.group(1);
                    }
                    currentLambda = new Lambda(this, nameSpace);
                    addLambda(currentLambda);
                    System.out.println(line);
                    System.out.println(matcher);
                    line = line.substring(0, matcher.start()) + "function " + nameSpace + (group2==null?"":" " + group2);
                    System.out.println(line);
                    lines.set(i, line);
                }
            } else {
                if (matcher.find()) {
                    balance++;
                    currentLambda.addLine(line);
                } else {
                    if (line.equals(")")) {
                        if (balance > 0) {
                            balance--;
                            currentLambda.addLine(line);
                        } else {
                            currentLambda.parse();
                            currentLambda = null;
                        }
                    } else {
                        currentLambda.addLine(line);
                    }
                }
                lines.remove(i);
                i--;
            }
        }
        lines.add(0, "#Generated with https://github.com/cowslayer7890/mcfunction_lambdas");
    }



    List<String> getLines();

    default Path getFileLocation() {
        String spot = getNamespace().replace(":", "/functions/") + ".mcfunction";
        return Paths.get(getDirectory().getAbsolutePath(), "data", spot);
    }

    default void save() {
        Path path = getFileLocation();
        //noinspection ResultOfMethodCallIgnored
        path.getParent().toFile().mkdirs();
        try {
            Files.write(path, getLines());
        } catch (IOException e) {
            e.printStackTrace();
        }
        getLambdas().forEach(McFunction::save);
        CompileStuff.allTouched.add(this);
    }
}
