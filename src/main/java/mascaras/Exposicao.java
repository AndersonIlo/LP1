package mascaras;

public class Exposicao {

    private String nome;
    private String local;
    private int visitantes;

    public Exposicao(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.visitantes = 0;
    }

    public String abrir() {
        return "Exposição \"" + nome + "\" aberta em " + local + ".";
    }

    public void registrarVisitante() {
        visitantes++;
    }

    public String exibirDados() {
        return "Exposição \"" + nome + "\" | Local: " + local + " | Visitantes: " + visitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(int visitantes) {
        this.visitantes = visitantes;
    }
}
