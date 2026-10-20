package loja;

public class Roupa {

    private String tipo;
    private String tamanho;
    private double preco;

    public Roupa(String tipo, String tamanho, double preco) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
    }

    public void ajustarTamanho(String novoTamanho) {
        tamanho = novoTamanho;
    }

    public String exibirEtiqueta() {
        return String.format("%s | Tamanho %s | R$ %.2f", tipo, tamanho, preco);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
