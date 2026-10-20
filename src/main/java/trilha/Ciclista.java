package trilha;

public class Ciclista {

    private String nome;
    private int energia;
    private Bicicleta bicicleta;

    public Ciclista(String nome, Bicicleta bicicleta) {
        this.nome = nome;
        this.bicicleta = bicicleta;
        this.energia = 100;
    }

    public String pedalar(Trilha trilha) {
        int gasto = (int) (trilha.getExtensaoKm() * 5);
        energia = Math.max(0, energia - gasto);
        return nome + " pedalou " + trilha.getExtensaoKm() + " km na " + trilha.getNome()
                + ". Energia: " + energia + "%";
    }

    public String descansar() {
        energia = 100;
        return nome + " descansou. Energia: " + energia + "%";
    }

    public String exibirDados() {
        return "Ciclista " + nome + " | Energia: " + energia + "% | " + bicicleta.exibirDados();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }
}
