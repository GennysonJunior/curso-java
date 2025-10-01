import pessoa2.Fornecedor;

public class App {
    public static void main(String[] args) throws Exception {
        Fornecedor f1 = new Fornecedor("Gennyson", "rua1", "9999-9999");

        f1.setValorCredito(1000);
        f1.setValorDivida(200);

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Endereço: " + f1.getEndereco());
        System.out.println("Telefone: " + f1.getTelefone());
        System.out.println("Saldo: " + f1.obterSaldo());

    }
}
