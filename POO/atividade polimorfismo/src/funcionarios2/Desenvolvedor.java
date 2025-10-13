package funcionarios2;

public class Desenvolvedor extends Funcionario {
    @Override
    public double calcularSalarioFinal() {
        return super.calcularSalarioFinal() * 1.1;
    }
}
