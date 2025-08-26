public class Main {
  public static void main(String[] args) {

    ContaBancaria cb = new ContaBancaria(1, 1000);

    System.out.println("Meu saldo: " + cb.getSaldo());
    cb.depositar(500);
    System.out.println("Meu saldo: " + cb.getSaldo());
    cb.sacar(700);
    System.out.println("meu saldo: " + cb.getSaldo());
  }
}
