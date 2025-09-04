import modelo.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria C1 = new ContaBancaria(1, 1000.0);
        ContaBancaria C2 = new ContaBancaria(2, 2000.0);

        System.out.println("------------------------------------------------");
        System.out.println("Numero da conta: "+C1.getNumeroConta());
        System.out.println("Saldo: "+C1.getSaldo());
        System.out.println("------------------------------------------------");
        System.out.println("Numero da conta: "+C2.getNumeroConta());
        System.out.println("Saldo: "+C2.getSaldo()+"\n");

        C1.depositar(500.0);
        C2.sacar(1000.0);

        System.out.println("\n------------------------------------------------");
        System.out.println("Numero da conta: "+C1.getNumeroConta());
        System.out.println("Saldo: "+C1.getSaldo());
        System.out.println("------------------------------------------------");
        System.out.println("Numero da conta: "+C2.getNumeroConta());
        System.out.println("Saldo: "+C2.getSaldo()+"\n");

        C2.sacar(2000.0);

        System.out.println("\n------------------------------------------------");
        System.out.println("Numero da conta: "+C1.getNumeroConta());
        System.out.println("Saldo: "+C1.getSaldo());
        System.out.println("------------------------------------------------");
        System.out.println("Numero da conta: "+C2.getNumeroConta());
        System.out.println("Saldo: "+C2.getSaldo()+"\n");
    }
}
