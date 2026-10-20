package manga;

public class Personagem {

    private String nome;
    private Rosto rosto;
    private Cabelo cabelo;

    public Personagem(String nome, Rosto rosto, Cabelo cabelo) {
        this.nome = nome;
        this.rosto = rosto;
        this.cabelo = cabelo;
    }

    public String apresentar() {
        return "Olá, eu sou " + nome + "!";
    }

    public String trocarCabelo(Cabelo novoCabelo) {
        cabelo = novoCabelo;
        return nome + " trocou o visual: " + cabelo.descrever() + ".";
    }

    public String desenhar() {
        return "Desenhando " + nome + ": " + rosto.descrever() + "; " + cabelo.descrever() + ".";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Rosto getRosto() {
        return rosto;
    }

    public void setRosto(Rosto rosto) {
        this.rosto = rosto;
    }

    public Cabelo getCabelo() {
        return cabelo;
    }

    public void setCabelo(Cabelo cabelo) {
        this.cabelo = cabelo;
    }
}
