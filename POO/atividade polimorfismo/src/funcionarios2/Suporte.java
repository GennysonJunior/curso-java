package funcionarios2;

public class Suporte extends Funcionario {
    @Override
    public double calcularSalarioFinal() {
        return super.calcularSalarioFinal() + 200.0;
    }
}
