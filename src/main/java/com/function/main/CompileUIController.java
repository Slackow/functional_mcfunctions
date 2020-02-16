package com.function.main;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    private void initialize() {
        textField.setText(System.getenv("appdata") + "\\.minecraft\\saves");
        textField.setText(Paths.get("testfiles").toAbsolutePath().toString());
    }

    @FXML
    public void onCompile() throws IOException {
        String textFieldText = textField.getText();
        System.out.println(textFieldText);

        splitPane.setDividerPosition(0, 0.5);
        splitPane2.setDividerPosition(0, 0.5);

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
                            CompileStuff.compile(dir);
                            allTouched.putAll(CompileStuff.allTouched);
                            allUntouched.putAll(CompileStuff.allUntouched);
                        });
            } else {
                CompileStuff.compile(source);
                allTouched = CompileStuff.allTouched;
                allUntouched = CompileStuff.allUntouched;
            }

            filesGeneratedListView.setItems(FXCollections.observableList(new ArrayList<>(allTouched.keySet())));
            filesNotGeneratedListView.setItems(FXCollections.observableList(new ArrayList<>(allUntouched.keySet())));

            feedbackLabel.setText("Compiled " + allTouched.size() + " functions at " + LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm:ss")));
            feedbackLabel.setTextFill(Color.GREEN);
            deleteAllButton.setDisable(filesNotGeneratedListView.getItems().isEmpty());
        } else {
            feedbackLabel.setText("Invalid Path, please select a datapack as the directory (not the data folder)");
            feedbackLabel.setTextFill(Color.RED);
        }
        feedbackLabel.setVisible(true);

    }

    @FXML
    public void onDeleteAll() {
        CompileStuff.allUntouched.forEach((key, value) -> {
            try {
                Files.deleteIfExists(value);
                Path dir = value.getParent();
                while (dir.toFile().delete()) {
                    dir = dir.getParent();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        filesNotGeneratedListView.getItems().clear();
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
