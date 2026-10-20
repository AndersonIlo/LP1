package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuAtividade2Controller {

    @FXML
    private Button vai_bike;

    @FXML
    private Button vai_manga;

    @FXML
    private Button vai_mask;

    @FXML
    private Button vai_roupas;

    @FXML
    private Button volta_menu2;

    @FXML
    void ir_roupas(ActionEvent event) throws IOException {
        App.setRoot("loja");
    }

    @FXML
    void ir_bike(ActionEvent event) throws IOException {
        App.setRoot("trilha");
    }

    @FXML
    void ir_mask(ActionEvent event) throws IOException {
        App.setRoot("mascaras");
    }

    @FXML
    void ir_manga(ActionEvent event) throws IOException {
        App.setRoot("manga");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("tela_inicial");
    }
}
