package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import trilha.Bicicleta;
import trilha.Ciclista;
import trilha.Trilha;

import java.io.IOException;

public class TrilhaController {

    @FXML
    private Button bt_descansar;

    @FXML
    private Button bt_exibir;

    @FXML
    private Button bt_frear;

    @FXML
    private Button bt_marcha;

    @FXML
    private Button bt_pedalar;

    @FXML
    private Button bt_tempo;

    @FXML
    private TextField txt_km;

    @FXML
    private TextField txt_marcha;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextField txt_velocidade;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    private final Bicicleta bicicleta = new Bicicleta("Caloi", "vermelha");
    private Ciclista ciclista;
    private Trilha trilha;

    private boolean prepararCiclista() {
        String nome = txt_nome.getText().trim();
        if (nome.isEmpty()) {
            mostrar("Digite o nome do ciclista.");
            return false;
        }
        if (ciclista == null) {
            ciclista = new Ciclista(nome, bicicleta);
        } else {
            ciclista.setNome(nome);
        }
        return true;
    }

    private boolean prepararTrilha() {
        try {
            double km = Double.parseDouble(txt_km.getText().trim().replace(",", "."));
            trilha = new Trilha("Trilha da Mata", km, "terra batida");
            return true;
        } catch (NumberFormatException e) {
            mostrar("Extensão da trilha inválida. Ex: 8");
            return false;
        }
    }

    @FXML
    void pedalar(ActionEvent event) {
        if (prepararCiclista() && prepararTrilha()) {
            mostrar(ciclista.pedalar(trilha));
        }
    }

    @FXML
    void descansar(ActionEvent event) {
        if (prepararCiclista()) {
            mostrar(ciclista.descansar());
        }
    }

    @FXML
    void trocarMarcha(ActionEvent event) {
        try {
            int marcha = Integer.parseInt(txt_marcha.getText().trim());
            mostrar(bicicleta.trocarMarcha(marcha));
        } catch (NumberFormatException e) {
            mostrar("Marcha inválida. Digite um número de 1 a 21.");
        }
    }

    @FXML
    void frear(ActionEvent event) {
        mostrar(bicicleta.frear());
    }

    @FXML
    void calcularTempo(ActionEvent event) {
        if (!prepararTrilha()) {
            return;
        }
        try {
            double velocidade = Double.parseDouble(txt_velocidade.getText().trim().replace(",", "."));
            if (velocidade <= 0) {
                mostrar("A velocidade deve ser maior que zero.");
                return;
            }
            mostrar(String.format("Tempo estimado a %.1f km/h: %.1f h (dificuldade: %s)",
                    velocidade, trilha.calcularTempo(velocidade), trilha.classificarDificuldade()));
        } catch (NumberFormatException e) {
            mostrar("Velocidade inválida. Ex: 16");
        }
    }

    @FXML
    void exibir(ActionEvent event) {
        if (trilha != null) {
            mostrar(trilha.exibirDados());
        }
        if (ciclista != null) {
            mostrar(ciclista.exibirDados());
        } else {
            mostrar(bicicleta.exibirDados());
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
