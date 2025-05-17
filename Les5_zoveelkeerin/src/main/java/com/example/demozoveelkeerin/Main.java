package com.example.demozoveelkeerin;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.util.Pair;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("zoveelkeerin.fxml"));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 344, 429));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
