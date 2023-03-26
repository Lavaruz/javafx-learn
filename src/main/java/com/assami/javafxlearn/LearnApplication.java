package com.assami.javafxlearn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LearnApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader view = new FXMLLoader(LearnApplication.class.getResource("learn-view.fxml"));
        Scene scene = new Scene(view.load(), 400,400);
        stage.setTitle("my learning");
        stage.setScene(scene);
        stage.show();
    }
}
