package manga;

public class Rosto {

    private String formato;
    private String tamanhoOlhos;
    private String expressao;

    public Rosto(String formato, String tamanhoOlhos) {
        this.formato = formato;
        this.tamanhoOlhos = tamanhoOlhos;
        this.expressao = "neutra";
    }

    public String mudarExpressao(String novaExpressao) {
        expressao = novaExpressao;
        return "Expressão alterada para " + expressao + ".";
    }

    public String sorrir() {
        return mudarExpressao("sorridente");
    }

    public String descrever() {
        return "rosto " + formato + ", olhos " + tamanhoOlhos + ", expressão " + expressao;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTamanhoOlhos() {
        return tamanhoOlhos;
    }

    public void setTamanhoOlhos(String tamanhoOlhos) {
        this.tamanhoOlhos = tamanhoOlhos;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }
}
