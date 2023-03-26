package com.assami.javafxlearn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LearnController {
    @FXML
    private Label titleLable;

    public void buttonTitle(ActionEvent actionEvent) {
        titleLable.setText("CLICKED");
    }
}
