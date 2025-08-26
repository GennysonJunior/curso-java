public class ContaBancaria {

  private int numeroConta;
  private double saldo;

  public ContaBancaria(int numeroConta, double saldo) {
    this.numeroConta = numeroConta;
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    if (this.saldo >= valor && valor < 0) {
      this.saldo -= valor;
    } else {
      System.err.println("valor invalido!");
    }
  }

  public double getSaldo() {
    return this.saldo;
  }
}
