package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CamelosController {

    @FXML
    private Button bt_dividir;

    @FXML
    private TextField txt_camelos;

    @FXML
    private TextField txt_div1;

    @FXML
    private TextField txt_div2;

    @FXML
    private TextField txt_div3;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    @FXML
    void dividir(ActionEvent event) {
        try {
            int camelos = Integer.parseInt(txt_camelos.getText().trim());
            int div1 = Integer.parseInt(txt_div1.getText().trim());
            int div2 = Integer.parseInt(txt_div2.getText().trim());
            int div3 = Integer.parseInt(txt_div3.getText().trim());

            if (div1 <= 0 || div2 <= 0 || div3 <= 0) {
                txt_resultado.setText("Os divisores devem ser maiores que zero.");
                return;
            }

            txt_resultado.setText(Camelos.dividir(camelos, div1, div2, div3));
        } catch (NumberFormatException e) {
            txt_resultado.setText("Preencha os 4 campos com números inteiros.\nEx: 35 camelos, divisores 2, 3 e 9.");
        }
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade1");
    }
}
