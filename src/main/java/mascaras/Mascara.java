package mascaras;

public class Mascara {

    private String origem;
    private String material;
    private String cor;

    public Mascara(String origem, String material, String cor) {
        this.origem = origem;
        this.material = material;
        this.cor = cor;
    }

    public String pintar(String novaCor) {
        cor = novaCor;
        return "Máscara de " + origem + " pintada de " + cor + ".";
    }

    public String catalogar(String codigo) {
        return "Máscara de " + origem + " catalogada no acervo com o código " + codigo + ".";
    }

    public String exibirDados() {
        return "Máscara | Origem: " + origem + " | Material: " + material + " | Cor: " + cor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
