package pessoa;
public class Aluno extends Pessoa {
    int matr;
    String curso;

    void cancelarMatr() {
        this.matr = 0;
    }
}
