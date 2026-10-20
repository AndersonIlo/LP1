package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mascaras.Exposicao;
import mascaras.Mascara;
import mascaras.Painel;

import java.io.IOException;
import java.util.ArrayList;

public class MascarasController {

    @FXML
    private Button bt_catalogar;

    @FXML
    private Button bt_exibir;

    @FXML
    private Button bt_pendurar;

    @FXML
    private Button bt_pintar;

    @FXML
    private Button bt_retirar;

    @FXML
    private Button bt_visitante;

    @FXML
    private TextField txt_codigo;

    @FXML
    private TextField txt_cor;

    @FXML
    private TextField txt_material;

    @FXML
    private TextField txt_origem;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    private final Painel painel = new Painel("palha", 5);
    private final Exposicao exposicao = new Exposicao("Arte Africana", "Museu Afro Brasil");

    @FXML
    void initialize() {
        mostrar(exposicao.abrir());
    }

    private Mascara ultimaMascara() {
        ArrayList<Mascara> mascaras = painel.getMascaras();
        if (mascaras.isEmpty()) {
            mostrar("O painel está vazio. Pendure uma máscara primeiro.");
            return null;
        }
        return mascaras.get(mascaras.size() - 1);
    }

    @FXML
    void pendurar(ActionEvent event) {
        String origem = txt_origem.getText().trim();
        String material = txt_material.getText().trim();
        String cor = txt_cor.getText().trim();
        if (origem.isEmpty() || material.isEmpty() || cor.isEmpty()) {
            mostrar("Preencha origem, material e cor da máscara.");
            return;
        }
        mostrar(painel.pendurar(new Mascara(origem, material, cor)));
    }

    @FXML
    void retirar(ActionEvent event) {
        Mascara mascara = ultimaMascara();
        if (mascara != null) {
            mostrar(painel.retirar(mascara));
        }
    }

    @FXML
    void pintar(ActionEvent event) {
        String cor = txt_cor.getText().trim();
        if (cor.isEmpty()) {
            mostrar("Digite a nova cor.");
            return;
        }
        Mascara mascara = ultimaMascara();
        if (mascara != null) {
            mostrar(mascara.pintar(cor));
        }
    }

    @FXML
    void catalogar(ActionEvent event) {
        String codigo = txt_codigo.getText().trim();
        if (codigo.isEmpty()) {
            mostrar("Digite o código da peça. Ex: AFR-001");
            return;
        }
        Mascara mascara = ultimaMascara();
        if (mascara != null) {
            mostrar(mascara.catalogar(codigo));
        }
    }

    @FXML
    void registrarVisitante(ActionEvent event) {
        exposicao.registrarVisitante();
        mostrar("Visitante registrado. Total: " + exposicao.getVisitantes());
    }

    @FXML
    void exibir(ActionEvent event) {
        mostrar(exposicao.exibirDados());
        mostrar(painel.exibirDados());
    }

    private void mostrar(String texto) {
        txt_resultado.appendText(texto + "\n");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade2");
    }
}
