package turma;

public class Turma {
    private int cod;
    private Professor prof;

    public Turma(int cod) {
        setCod(cod);
    }

    public Turma(int cod, String nomeProf) {
        setCod(cod);
        setProf(nomeProf);
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setProf(String nome) {
        this.prof = new Professor(nome);
    }

    public int getCod() {
        return this.cod;
    }

    public Professor getProf() {
        return this.prof;
    }

    public String resumo() {
        return "Codigo: " + getCod() + "\nProfessor: " + this.prof.getNome();
    }
}
