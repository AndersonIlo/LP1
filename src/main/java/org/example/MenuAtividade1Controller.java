package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuAtividade1Controller {

    @FXML
    private Button vai_aluguel;

    @FXML
    private Button vai_camelo;

    @FXML
    private Button vai_desconto;

    @FXML
    private Button vai_login;

    @FXML
    private Button vai_multiplo;

    @FXML
    private Button vai_temperatura;

    @FXML
    private Button vai_viagem;

    @FXML
    private Button volta_menu1;

    @FXML
    void ir_multiplo(ActionEvent event) throws IOException {
        App.setRoot("multiplo");
    }

    @FXML
    void ir_login(ActionEvent event) throws IOException {
        App.setRoot("login");
    }

    @FXML
    void ir_desconto(ActionEvent event) throws IOException {
        App.setRoot("desconto");
    }

    @FXML
    void ir_temperatura(ActionEvent event) throws IOException {
        App.setRoot("temperatura");
    }

    @FXML
    void ir_camelo(ActionEvent event) throws IOException {
        App.setRoot("camelos");
    }

    @FXML
    void ir_viagem(ActionEvent event) throws IOException {
        App.setRoot("viagem");
    }

    @FXML
    void ir_aluguel(ActionEvent event) throws IOException {
        App.setRoot("aluguel");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("tela_inicial");
    }
}
