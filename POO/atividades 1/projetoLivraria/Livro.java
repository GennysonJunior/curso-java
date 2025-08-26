public class Livro {
  String titulo;
  int numeroPaginas;
  String anoPublicacao;
  double preco;

  void cadastrar() {
    System.out.println("Cadastrando no banco de dados...");
  }

  double calcFrete(String cep) {
    double valorFrete = 12.00;
    System.out.println("Calculando frete para o CEP " + cep);
    return valorFrete;
  }

  void vender() {
    System.out.printf("Vendendo livro por R$%.2f", preco);
  }

  String trocar() {
    return "Livro trocado!";
  }
}
