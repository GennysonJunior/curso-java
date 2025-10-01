package pessoa;
public class Professor extends Pessoa{
    String especialidade;
    double salario;

    void receberAum(double valor) {
        this.salario += valor;
    }
}
