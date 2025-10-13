package funcionarios2;

abstract public class Funcionario {
    private double salarioBase = 1500;

    public double calcularSalarioFinal() {
        return this.salarioBase;
    }
}
