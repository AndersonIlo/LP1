package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MultiploController {

    @FXML
    private Button bt_verificar;

    @FXML
    private Label lbl_resultado;

    @FXML
    private TextField txt_num1;

    @FXML
    private TextField txt_num2;

    @FXML
    private Button volta_menu3;

    @FXML
    void verificar(ActionEvent event) {
        try {
            int num1 = Integer.parseInt(txt_num1.getText().trim());
            int num2 = Integer.parseInt(txt_num2.getText().trim());
            lbl_resultado.setText(Multiplo.verificar(num1, num2));
        } catch (NumberFormatException e) {
            lbl_resultado.setText("Digite dois números inteiros.");
        }
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade1");
    }
}
