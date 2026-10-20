package trilha;

public class Trilha {

    private String nome;
    private double extensaoKm;
    private String terreno;

    public Trilha(String nome, double extensaoKm, String terreno) {
        this.nome = nome;
        this.extensaoKm = extensaoKm;
        this.terreno = terreno;
    }

    public double calcularTempo(double velocidadeKmH) {
        return extensaoKm / velocidadeKmH;
    }

    public String classificarDificuldade() {
        if (extensaoKm < 5) {
            return "Fácil";
        } else if (extensaoKm < 15) {
            return "Moderada";
        } else {
            return "Difícil";
        }
    }

    public String exibirDados() {
        return "Trilha " + nome + " | " + extensaoKm + " km | Terreno: " + terreno
                + " | Dificuldade: " + classificarDificuldade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getExtensaoKm() {
        return extensaoKm;
    }

    public void setExtensaoKm(double extensaoKm) {
        this.extensaoKm = extensaoKm;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }
}
