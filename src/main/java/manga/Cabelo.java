package manga;

public class Cabelo {

    private String estilo;
    private String comprimento;
    private String cor;

    public Cabelo(String estilo, String comprimento, String cor) {
        this.estilo = estilo;
        this.comprimento = comprimento;
        this.cor = cor;
    }

    public String cortar() {
        if (comprimento.equals("longo")) {
            comprimento = "médio";
        } else {
            comprimento = "curto";
        }
        return "Cabelo cortado. Agora está " + comprimento + ".";
    }

    public String pentear(String novoEstilo) {
        estilo = novoEstilo;
        return "Cabelo penteado no estilo " + estilo + ".";
    }

    public String descrever() {
        return "cabelo " + estilo + ", " + comprimento + ", " + cor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
