public class Main {
  public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria();
    ContaBancaria conta2 = new ContaBancaria();

    conta1.titular = "Gennyson Junior";
    conta1.numeroConta = "1";
    conta1.saldo = 5000.0;

    conta1.depositar(500.0);
    conta1.sacar(3000.0);
    conta1.consultaSaldo();

    System.out.println("\n");
    conta2.titular = "Luiz Neto";
    conta2.numeroConta = "2";
    conta2.saldo = 500.0;

    conta2.depositar(2.0);
    conta2.sacar(1000.0);
    conta2.consultaSaldo();
  }
}
