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
        //textField.setText(new File("testfiles").getAbsolutePath());
    }

    @FXML
    public void onCompile() {
        System.out.println("what's up");
        String textFieldText = textField.getText();
        System.out.println(textFieldText);

        splitPane.setDividerPosition(0, 0.5);
        splitPane2.setDividerPosition(0, 0.5);

        if (Paths.get(textFieldText, "data").toFile().isDirectory()) {
            if (Paths.get(textFieldText, "datapacks").toFile().isDirectory()) {
                feedbackLabel.setText("Invalid Path, please select a datapack as the directory (not the world folder)");
                feedbackLabel.setTextFill(Color.RED);
                feedbackLabel.setVisible(true);
                return;
            }

            CompileStuff.compile(new File(textFieldText));

            Map<String, Path> allTouched = CompileStuff.allTouched;

            Map<String, Path> allUntouched = CompileStuff.allUntouched;


            filesGeneratedListView.setItems(FXCollections.observableList(new ArrayList<>(allTouched.keySet())));
            filesNotGeneratedListView.setItems(FXCollections.observableList(new ArrayList<>(allUntouched.keySet())));

            feedbackLabel.setText("Compiled " + allTouched.size() + " functions at " + LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm:ss")));
            feedbackLabel.setTextFill(Color.GREEN);
        } else {
            feedbackLabel.setText("Invalid Path, please select a datapack as the directory (not the data folder)");
            feedbackLabel.setTextFill(Color.RED);
            feedbackLabel.setVisible(true);
            return;
        }
        feedbackLabel.setVisible(true);
        deleteAllButton.setDisable(filesNotGeneratedListView.getItems().size() <= 0);
    }

    @FXML
    public void onDeleteAll() {
        CompileStuff.allUntouched.forEach((key, value) -> {
            try {
                Files.deleteIfExists(value);
                File dir = value.toFile().getParentFile();
                while (dir.delete()) {
                    dir = dir.getParentFile();
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

        File value = Paths.get(textField.getText()).toFile();
        if (value.exists()) {
            directoryChooser.setInitialDirectory(value);
        }
        File file = directoryChooser.showDialog(null);
        if (file != null) {
            textField.setText(file.getAbsolutePath());
        }
    }
}
