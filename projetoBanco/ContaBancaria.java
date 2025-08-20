public class ContaBancaria {
  String numeroConta;
  String titular;
  double saldo;

  void depositar(double valor) {
    saldo += valor;
  }

  void sacar(double valor) {
    if (saldo >= valor) {
      saldo -= valor;
    } else {
      System.err.println("Você não tem esse valor!");
    }
  }

  void consultaSaldo() {
    System.out.println("Titular: " + titular);
    System.out.println("Saldo: " + saldo);
  }
}
