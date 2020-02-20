package com.function.main;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CompileUIController {

    @FXML
    public ListView<String> filesNotGeneratedListView;
    @FXML
    public ListView<String> filesGeneratedListView;
    @FXML
    public Button deleteAllButton;
    @FXML
    public SplitPane splitPane2;
    @FXML
    public SplitPane splitPane;
    @FXML
    private TextField textField;
    @FXML
    private Label feedbackLabel;
    @FXML
    private TextArea logArea;
    @FXML
    private CheckBox showLog;

    @FXML
    private void showLog() {
        if (showLog.isSelected()) {
            splitPane.setDividerPositions(0.5, 0.5);
        } else {
            splitPane.setDividerPositions(0.5, 1);
        }
    }

    @FXML
    private void initialize() {
        textField.setText(System.getenv("appdata") + "\\.minecraft\\saves");
        //textField.setText(Paths.get("testfiles").toAbsolutePath().toString());
        //Because antlr uses System.err.println for smaller errors
        System.setErr(new PrintStream(System.err){
            @Override
            public void println(String s) {
                CompileStuff.LOGGER.severe(s);
            }
        });
        CompileStuff.LOGGER.addHandler(new Handler() {
            @Override
            public void publish(LogRecord record) {
                logArea.setText(logArea.getText() + "\n" + record.getLevel() + ": " + record.getMessage());
            }

            @Override
            public void flush() {

            }

            @Override
            public void close() throws SecurityException {

            }
        });
    }

    @FXML
    public void onCompile() throws IOException {
        String textFieldText = textField.getText();
        CompileStuff.LOGGER.info("Working in: " + textFieldText);
        showLog();
        splitPane2.setDividerPosition(0, 0.5);
        logArea.setText("");
        Path source = Paths.get(textFieldText);

        if (Files.isDirectory(source.resolve("data"))) {
            Map<String, Path> allTouched;
            Map<String, Path> allUntouched;
            Path datapacks = source.resolve("datapacks");
            if (Files.isDirectory(datapacks)) {
                allTouched = new HashMap<>();
                allUntouched = new HashMap<>();
                Files.list(datapacks)
                        .filter(path -> Files.isDirectory(path) && Files.isDirectory(path.resolve("data")))
                        .forEach(dir -> {
                            try {
                                CompileStuff.compile(dir);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            allTouched.putAll(CompileStuff.allTouched);
                            allUntouched.putAll(CompileStuff.allUntouched);
                        });
                allTouched.forEach(CompileStuff.allTouched::putIfAbsent);
                allUntouched.forEach(CompileStuff.allUntouched::putIfAbsent);
            } else {
                CompileStuff.compile(source);
                allTouched = CompileStuff.allTouched;
                allUntouched = CompileStuff.allUntouched;
            }

            filesGeneratedListView.setItems(FXCollections.observableList(new ArrayList<>(allTouched.keySet())).sorted());
            filesNotGeneratedListView.setItems(FXCollections.observableList(new ArrayList<>(allUntouched.keySet())).sorted());

            feedbackLabel.setText("Compiled " + allTouched.size() + " functions at " + currentTime());
            feedbackLabel.setTextFill(Color.GREEN);
            deleteAllButton.setDisable(filesNotGeneratedListView.getItems().isEmpty());
        } else {
            feedbackLabel.setText("Invalid Path, please select a datapack, or world as the directory (not the data folder)");
            feedbackLabel.setTextFill(Color.RED);
        }
        feedbackLabel.setVisible(true);

    }

    public static String currentTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm:ss"));
    }

    @FXML
    public void onDeleteAll() {
        CompileStuff.allUntouched.forEach((key, value) -> {
            try {
                Files.delete(value);
                File dir = value.getParent().toFile();
                while (dir.delete()) {
                    dir = dir.getParentFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        filesNotGeneratedListView.setItems(FXCollections.emptyObservableList());
        deleteAllButton.setDisable(true);
    }

    @FXML
    public void onOpenDirectory() {
        DirectoryChooser directoryChooser = new DirectoryChooser();

        Path value = Paths.get(textField.getText());
        if (Files.isDirectory(value)) {
            directoryChooser.setInitialDirectory(value.toFile());
        }
        File file = directoryChooser.showDialog(null);
        if (file != null) {
            textField.setText(file.getAbsolutePath());
        }
    }
}
