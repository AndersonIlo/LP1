package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DescontoController {

    @FXML
    private Button bt_finalizar;

    @FXML
    private TextField preco_acucar;

    @FXML
    private TextField preco_arroz;

    @FXML
    private TextField preco_cafe;

    @FXML
    private TextField preco_farinha;

    @FXML
    private TextField preco_feijao;

    @FXML
    private TextField preco_fuba;

    @FXML
    private TextField preco_macarrao;

    @FXML
    private TextField preco_molho;

    @FXML
    private TextField preco_oleo;

    @FXML
    private TextField preco_sal;

    @FXML
    private TextField qtd_acucar;

    @FXML
    private TextField qtd_arroz;

    @FXML
    private TextField qtd_cafe;

    @FXML
    private TextField qtd_farinha;

    @FXML
    private TextField qtd_feijao;

    @FXML
    private TextField qtd_fuba;

    @FXML
    private TextField qtd_macarrao;

    @FXML
    private TextField qtd_molho;

    @FXML
    private TextField qtd_oleo;

    @FXML
    private TextField qtd_sal;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private Button volta_menu;

    @FXML
    void finalizar(ActionEvent event) {
        TextField[] camposQtd = {qtd_arroz, qtd_feijao, qtd_oleo, qtd_acucar, qtd_cafe,
                qtd_macarrao, qtd_farinha, qtd_fuba, qtd_molho, qtd_sal};
        TextField[] camposPreco = {preco_arroz, preco_feijao, preco_oleo, preco_acucar, preco_cafe,
                preco_macarrao, preco_farinha, preco_fuba, preco_molho, preco_sal};

        int[] quantidades = new int[camposQtd.length];
        double[] precos = new double[camposPreco.length];

        for (int i = 0; i < camposQtd.length; i++) {
            try {
                quantidades[i] = lerQuantidade(camposQtd[i]);
                precos[i] = lerPreco(camposPreco[i]);
            } catch (NumberFormatException e) {
                txt_resultado.setText("Valor inválido em " + Desconto.ITENS[i] + ".\n"
                        + "Quantidade: número inteiro (ex: 2)\n"
                        + "Preço: número (ex: 5,50)");
                return;
            }
        }

        txt_resultado.setText(Desconto.calcular(quantidades, precos));
    }

    // Campo vazio conta como 0
    private int lerQuantidade(TextField campo) {
        String texto = campo.getText().trim();
        return texto.isEmpty() ? 0 : Integer.parseInt(texto);
    }

    // Aceita vírgula ou ponto (5,50 ou 5.50)
    private double lerPreco(TextField campo) {
        String texto = campo.getText().trim().replace(",", ".");
        return texto.isEmpty() ? 0 : Double.parseDouble(texto);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu_atividade1");
    }
}
