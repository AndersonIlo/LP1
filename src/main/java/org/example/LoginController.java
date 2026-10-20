package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button bt_entrar;

    @FXML
    private Label lbl_resultado;

    @FXML
    private PasswordField txt_senha;

    @FXML
    private TextField txt_usuario;

    @FXML
    private Button volta_menu;

    @FXML
    void entrar(ActionEvent event) {
        lbl_resultado.setText(Login.verificar(txt_usuario.getText(), txt_senha.getText()));
        txt_senha.clear();
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade1");
    }
}
