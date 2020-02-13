package com.function.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.nio.file.Paths;

public class CompileUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Paths.get("src/main/resources/fxml/CompileUI.fxml").toUri().toURL());
        primaryStage.setTitle("Epic Mcfunction compiler");
        primaryStage.getIcons().add(new Image("file:images/icon.ico"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
