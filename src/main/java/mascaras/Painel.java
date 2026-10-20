package mascaras;

import java.util.ArrayList;

public class Painel {

    private String material;
    private int capacidade;
    private ArrayList<Mascara> mascaras;

    public Painel(String material, int capacidade) {
        this.material = material;
        this.capacidade = capacidade;
        this.mascaras = new ArrayList<>();
    }

    public String pendurar(Mascara mascara) {
        if (mascaras.size() < capacidade) {
            mascaras.add(mascara);
            return "Máscara de " + mascara.getOrigem() + " pendurada no painel.";
        } else {
            return "Painel cheio! Capacidade: " + capacidade;
        }
    }

    public String retirar(Mascara mascara) {
        if (mascaras.remove(mascara)) {
            return "Máscara de " + mascara.getOrigem() + " retirada do painel.";
        } else {
            return "Essa máscara não está no painel.";
        }
    }

    public String exibirDados() {
        String texto = "Painel de " + material + " | " + mascaras.size() + "/" + capacidade + " máscaras";
        for (Mascara m : mascaras) {
            texto += "\n  - " + m.exibirDados();
        }
        return texto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Mascara> getMascaras() {
        return mascaras;
    }

    public void setMascaras(ArrayList<Mascara> mascaras) {
        this.mascaras = mascaras;
    }
}
