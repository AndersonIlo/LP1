package loja;

public class Manequim {

    private String tipo;
    private double altura;
    private Roupa roupaAtual;

    public Manequim(String tipo, double altura) {
        this.tipo = tipo;
        this.altura = altura;
        this.roupaAtual = null;
    }

    public String vestir(Roupa roupa) {
        roupaAtual = roupa;
        return "Manequim " + tipo + " vestiu: " + roupa.getTipo();
    }

    public String despir() {
        roupaAtual = null;
        return "Manequim " + tipo + " está sem roupa.";
    }

    public String exibir() {
        String texto = "Manequim " + tipo + " (" + altura + " m) - ";
        if (roupaAtual == null) {
            return texto + "sem roupa";
        } else {
            return texto + roupaAtual.exibirEtiqueta();
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Roupa getRoupaAtual() {
        return roupaAtual;
    }

    public void setRoupaAtual(Roupa roupaAtual) {
        this.roupaAtual = roupaAtual;
    }
}
