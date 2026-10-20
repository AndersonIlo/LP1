package loja;

public class Loja {

    private String nome;
    private String cidade;
    private int estoque;

    public Loja(String nome, String cidade, int estoque) {
        this.nome = nome;
        this.cidade = cidade;
        this.estoque = estoque;
    }

    public String receberProdutos(int quantidade) {
        estoque = estoque + quantidade;
        return nome + " recebeu " + quantidade + " peças.";
    }

    public String vender(Roupa roupa) {
        if (estoque > 0) {
            estoque--;
            return String.format("Venda: %s por R$ %.2f", roupa.getTipo(), roupa.getPreco());
        } else {
            return "Sem estoque para vender.";
        }
    }

    public String exibirInformacoes() {
        return "Loja " + nome + " - " + cidade + " | Estoque: " + estoque + " peças";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
