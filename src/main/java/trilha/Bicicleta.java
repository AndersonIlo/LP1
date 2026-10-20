package trilha;

public class Bicicleta {

    private String marca;
    private String cor;
    private int marchaAtual;

    public Bicicleta(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.marchaAtual = 1;
    }

    public String trocarMarcha(int novaMarcha) {
        if (novaMarcha >= 1 && novaMarcha <= 21) {
            marchaAtual = novaMarcha;
            return "Bicicleta " + marca + " na marcha " + marchaAtual;
        } else {
            return "Marcha inválida (1 a 21).";
        }
    }

    public String frear() {
        marchaAtual = 1;
        return "Bicicleta " + marca + " freou e voltou para a marcha 1.";
    }

    public String exibirDados() {
        return "Bicicleta " + marca + " | Cor: " + cor + " | Marcha: " + marchaAtual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }
}
