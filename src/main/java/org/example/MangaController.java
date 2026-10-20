package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import manga.Cabelo;
import manga.Personagem;
import manga.Rosto;

import java.io.IOException;

public class MangaController {

    @FXML
    private Button bt_apresentar;

    @FXML
    private Button bt_cortar;

    @FXML
    private Button bt_criar;

    @FXML
    private Button bt_desenhar;

    @FXML
    private Button bt_expressao;

    @FXML
    private Button bt_pentear;

    @FXML
    private Button bt_sorrir;

    @FXML
    private TextField txt_comprimento;

    @FXML
    private TextField txt_cor;

    @FXML
    private TextField txt_estilo;

    @FXML
    private TextField txt_expressao;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    private Personagem personagem;

    private boolean temPersonagem() {
        if (personagem == null) {
            mostrar("Crie o personagem primeiro.");
            return false;
        }
        return true;
    }

    @FXML
    void criar(ActionEvent event) {
        String nome = txt_nome.getText().trim();
        String estilo = txt_estilo.getText().trim();
        String comprimento = txt_comprimento.getText().trim().toLowerCase();
        String cor = txt_cor.getText().trim();
        if (nome.isEmpty() || estilo.isEmpty() || comprimento.isEmpty() || cor.isEmpty()) {
            mostrar("Preencha nome, estilo, comprimento e cor do cabelo.");
            return;
        }
        Cabelo cabelo = new Cabelo(estilo, comprimento, cor);
        Rosto rosto = new Rosto("oval", "grandes");
        personagem = new Personagem(nome, rosto, cabelo);
        mostrar("Personagem " + nome + " criado!");
    }

    @FXML
    void apresentar(ActionEvent event) {
        if (temPersonagem()) {
            mostrar(personagem.apresentar());
        }
    }

    @FXML
    void desenhar(ActionEvent event) {
        if (temPersonagem()) {
            mostrar(personagem.desenhar());
        }
    }

    @FXML
    void cortar(ActionEvent event) {
        if (temPersonagem()) {
            mostrar(personagem.getCabelo().cortar());
        }
    }

    @FXML
    void pentear(ActionEvent event) {
        if (!temPersonagem()) {
            return;
        }
        String estilo = txt_estilo.getText().trim();
        if (estilo.isEmpty()) {
            mostrar("Digite o novo estilo do cabelo.");
            return;
        }
        mostrar(personagem.getCabelo().pentear(estilo));
    }

    @FXML
    void mudarExpressao(ActionEvent event) {
        if (!temPersonagem()) {
            return;
        }
        String expressao = txt_expressao.getText().trim();
        if (expressao.isEmpty()) {
            mostrar("Digite a expressão. Ex: surpresa");
            return;
        }
        mostrar(personagem.getRosto().mudarExpressao(expressao));
    }

    @FXML
    void sorrir(ActionEvent event) {
        if (temPersonagem()) {
            mostrar(personagem.getRosto().sorrir());
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
