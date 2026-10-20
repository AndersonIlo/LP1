package org.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class TelaInicialController {

    @FXML
    private Button finish_app;

    @FXML
    private Button vai_exe1;

    @FXML
    private Button vai_exe2;

    @FXML
    void ir_exe1(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade1");
    }

    @FXML
    void ir_exe2(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade2");
    }

    @FXML
    void sair(ActionEvent event) {
        Platform.exit();
    }
}
