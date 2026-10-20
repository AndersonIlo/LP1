package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViagemController {

    @FXML
    private Button bt_calcular;

    @FXML
    private TextField txt_distancia;

    @FXML
    private TextField txt_preco;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    @FXML
    void calcular(ActionEvent event) {
        try {
            double distancia = Double.parseDouble(txt_distancia.getText().trim().replace(",", "."));
            double preco = Double.parseDouble(txt_preco.getText().trim().replace(",", "."));
            txt_resultado.setText(Viagem.calcular(distancia, preco));
        } catch (NumberFormatException e) {
            txt_resultado.setText("Preencha a distância e o preço com números. Ex: 600 e 5,89");
        }
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade1");
    }
}
