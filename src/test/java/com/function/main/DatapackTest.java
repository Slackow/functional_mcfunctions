package com.function.main;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class DatapackTest {

    @Test
    public void pathToNamespace() {
        Path datapackPath = Paths.get("pack");
        Path path = Paths.get("pack/data/main/functions/test\\should-_work.function");
        assertEquals(Datapack.pathToNamespace(datapackPath, path), "main:test/should-_work");
        path = Paths.get("pack/data/main/functions/test/should-_work.mcfunction");
        assertEquals(Datapack.pathToNamespace(datapackPath, path), "main:test/should-_work");
    }

    @Test
    public void parse() {
        Path datapackPath = Paths.get("testfiles");
        Datapack datapack = new Datapack(datapackPath, CompileStuff.getAllFilesInDataPack(datapackPath, ".function").collect(Collectors.toList()));

    }

    @Test
    public void save() {

    }

    @Test
    public void namespaceToPath() {
        String namespace = "main:test/should-_work";
        Path datapackPath = Paths.get("pack");
        assertEquals(Datapack.namespaceToPath(datapackPath, namespace), Paths.get("pack/data/main/functions/test/should-_work.mcfunction"));


    }
}