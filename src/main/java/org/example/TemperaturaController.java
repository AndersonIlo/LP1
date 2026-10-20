package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TemperaturaController {

    @FXML
    private Button bt_calcular;

    @FXML
    private TextField txt_jan;

    @FXML
    private TextField txt_fev;

    @FXML
    private TextField txt_mar;

    @FXML
    private TextField txt_abr;

    @FXML
    private TextField txt_mai;

    @FXML
    private TextField txt_jun;

    @FXML
    private TextField txt_jul;

    @FXML
    private TextField txt_ago;

    @FXML
    private TextField txt_set;

    @FXML
    private TextField txt_out;

    @FXML
    private TextField txt_nov;

    @FXML
    private TextField txt_dez;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    @FXML
    void calcular(ActionEvent event) {
        TextField[] campos = {txt_jan, txt_fev, txt_mar, txt_abr, txt_mai, txt_jun,
                txt_jul, txt_ago, txt_set, txt_out, txt_nov, txt_dez};
        double[] temperaturas = new double[campos.length];

        for (int i = 0; i < campos.length; i++) {
            String texto = campos[i].getText().trim().replace(",", ".");
            if (texto.isEmpty()) {
                txt_resultado.setText("Preencha a temperatura de " + Temperatura.MESES[i] + ".");
                return;
            }
            try {
                temperaturas[i] = Double.parseDouble(texto);
            } catch (NumberFormatException e) {
                txt_resultado.setText("Valor inválido em " + Temperatura.MESES[i] + ". Ex: 21,5");
                return;
            }
        }

        txt_resultado.setText(Temperatura.avaliarAno(temperaturas));
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade1");
    }
}
