package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AluguelController {

    @FXML
    private Button bt_calcular;

    @FXML
    private TextField txt_dias;

    @FXML
    private TextField txt_km;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    @FXML
    void calcular(ActionEvent event) {
        try {
            int dias = Integer.parseInt(txt_dias.getText().trim());
            double km = Double.parseDouble(txt_km.getText().trim().replace(",", "."));
            txt_resultado.setText(AluguelCarro.calcular(dias, km));
        } catch (NumberFormatException e) {
            txt_resultado.setText("Preencha os dias (número inteiro) e os km. Ex: 3 e 450");
        }
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade1");
    }
}
