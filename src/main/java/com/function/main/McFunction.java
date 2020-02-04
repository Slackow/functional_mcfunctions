package com.function.main;

import com.esotericsoftware.minlog.Log;
import com.function.main.controlstuff.FunctionVisitor;
import com.function.main.grammar.FunctionLexer;
import com.function.main.grammar.MainFunctionParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class McFunction {
    private Map<String, List<String>> functionLines = new HashMap<>();

    private Stack<String> nameSpaces = new Stack<>();

    private List<String> lines;
    private Path dirLocation;

    public McFunction(Path path, Path dir) {
        dirLocation = dir;
        Path data = Paths.get(dir.toString(), "data");
        Path path1 = data.toAbsolutePath();
        Path pathRelative = path1.relativize(path);
        //System.out.println(pathRelative);
        String item = pathRelative.toString().replaceFirst("\\\\functions\\\\", ":");
        nameSpaces.push(item.substring(0, item.length() - 9));
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addLine(String namespace, String line) {
        functionLines.computeIfAbsent(namespace, key -> new ArrayList<>());
        functionLines.get(namespace).add(line);
    }

    public void parse() {
        String contents = String.join("\n", lines);
        if (contents.startsWith("/")) {
            contents = "\n" + contents;
            Log.warn("Warning: Errors will be one line off, add a blank line at the beginning to fix.");
        }
        CharStream in = CharStreams.fromString(contents);
        FunctionLexer functionLexer = new FunctionLexer(in);
        TokenStream tokens = new CommonTokenStream(functionLexer);
        MainFunctionParser parser = new MainFunctionParser(tokens);
        new FunctionVisitor(this).visit(parser.program());
    }

    public Map<String, Path> save() {
        Map<String, Path> map = new HashMap<>();
        functionLines.values().removeIf(list -> list.stream().allMatch(str -> str.trim().isEmpty()));
        functionLines.forEach((k, v) -> {
            //System.out.println(k + " Contents:\n\n" + String.join("\n", v));
            v.add(0, "#Generated with https://github.com/cowslayer7890/mcfunction_lambdas");
            try {
                Path path = Paths.get(getDirLocation().toString(), "data", k.replace(":", "\\functions\\") + ".mcfunction");
                //noinspection ResultOfMethodCallIgnored
                path.toFile().getParentFile().mkdirs();
                Files.write(path, v);
                map.put(k, path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        return map;
    }

    public Path getDirLocation() {
        return dirLocation;
    }

    public Stack<String> getNameSpaceStack() {
        return nameSpaces;
    }

    public Set<String> getNamespaces() {
        return functionLines.keySet();
    }
}
