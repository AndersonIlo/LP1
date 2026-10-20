package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import loja.Loja;
import loja.Manequim;
import loja.Roupa;

import java.io.IOException;

public class LojaController {

    @FXML
    private Button bt_desconto;

    @FXML
    private Button bt_despir;

    @FXML
    private Button bt_exibir;

    @FXML
    private Button bt_receber;

    @FXML
    private Button bt_vender;

    @FXML
    private Button bt_vestir;

    @FXML
    private TextField txt_desconto;

    @FXML
    private TextField txt_preco;

    @FXML
    private TextField txt_quantidade;

    @FXML
    private TextField txt_tamanho;

    @FXML
    private TextField txt_tipo;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    private final Loja loja = new Loja("Dorinho's", "São José dos Campos", 50);
    private final Manequim manequim = new Manequim("masculino", 1.85);
    private Roupa roupa;

    private boolean criarRoupa() {
        String tipo = txt_tipo.getText().trim();
        String tamanho = txt_tamanho.getText().trim();
        if (tipo.isEmpty() || tamanho.isEmpty()) {
            mostrar("Preencha o tipo e o tamanho da roupa.");
            return false;
        }
        try {
            double preco = Double.parseDouble(txt_preco.getText().trim().replace(",", "."));
            roupa = new Roupa(tipo, tamanho, preco);
            return true;
        } catch (NumberFormatException e) {
            mostrar("Preço inválido. Ex: 129,90");
            return false;
        }
    }

    @FXML
    void vestir(ActionEvent event) {
        if (criarRoupa()) {
            mostrar(manequim.vestir(roupa));
        }
    }

    @FXML
    void despir(ActionEvent event) {
        mostrar(manequim.despir());
    }

    @FXML
    void aplicarDesconto(ActionEvent event) {
        if (roupa == null && !criarRoupa()) {
            return;
        }
        try {
            double percentual = Double.parseDouble(txt_desconto.getText().trim().replace(",", "."));
            roupa.aplicarDesconto(percentual);
            mostrar("Desconto de " + percentual + "% aplicado: " + roupa.exibirEtiqueta());
        } catch (NumberFormatException e) {
            mostrar("Desconto inválido. Ex: 10");
        }
    }

    @FXML
    void vender(ActionEvent event) {
        if (roupa == null && !criarRoupa()) {
            return;
        }
        mostrar(loja.vender(roupa));
    }

    @FXML
    void receber(ActionEvent event) {
        try {
            int quantidade = Integer.parseInt(txt_quantidade.getText().trim());
            mostrar(loja.receberProdutos(quantidade));
        } catch (NumberFormatException e) {
            mostrar("Quantidade inválida. Ex: 20");
        }
    }

    @FXML
    void exibir(ActionEvent event) {
        mostrar(loja.exibirInformacoes());
        mostrar(manequim.exibir());
        if (roupa != null) {
            mostrar("Roupa atual: " + roupa.exibirEtiqueta());
        }
    }

    private void mostrar(String texto) {
        txt_resultado.appendText(texto + "\n");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade2");
    }
}
