public class Livraria {
  public static void main(String[] args) {
    Livro obj1 = new Livro();
    obj1.titulo = "Harry Potter e a Pedra Filosofal";
    obj1.numeroPaginas = 304;
    obj1.anoPublicacao = "1997";
    obj1.preco = 25.90;

    System.out.println("Título: " + obj1.titulo);
    System.out.println("Número de páginas: " + obj1.numeroPaginas);
    System.out.println("Ano de Publicação: " + obj1.anoPublicacao);
    System.out.println("Preço: " + obj1.preco);
    obj1.cadastrar();
    double frete = obj1.calcFrete("66097-055");
    System.out.printf("Frete R$ %.2f", frete);

    // Exercicio 1:
    Livro obj2 = new Livro();
    Livro obj3 = new Livro();

    obj2.titulo = "Banquete. Apologia de Socrates";
    obj2.numeroPaginas = 124;
    obj2.anoPublicacao = "371 A.C";
    obj2.preco = 30.00;

    System.out.println("\n");
    System.out.println("Título: " + obj2.titulo);
    System.out.println("Número de páginas: " + obj2.numeroPaginas);
    System.out.println("Ano de Publicação: " + obj2.anoPublicacao);
    System.out.println("Preço: " + obj2.preco);
    obj2.cadastrar();
    double frete2 = obj1.calcFrete("66097-055");
    System.out.printf("Frete R$ %.2f", frete2);

    obj3.titulo = "Crítica da Razão Pura";
    obj3.numeroPaginas = 624;
    obj3.anoPublicacao = "1781";
    obj3.preco = 100.00;

    System.out.println("\n");
    System.out.println("Título: " + obj3.titulo);
    System.out.println("Número de páginas: " + obj3.numeroPaginas);
    System.out.println("Ano de Publicação: " + obj3.anoPublicacao);
    System.out.println("Preço: " + obj3.preco);
    obj3.cadastrar();
    double frete3 = obj1.calcFrete("66097-055");
    System.out.printf("Frete R$ %.2f", frete3);
    System.out.println("\n");

    // Exercicio 2:
    Cliente cli1 = new Cliente();
    cli1.nome = "Gennyson Junior";
    cli1.numeroDeLivros = 5;

    System.out.println("Nome do Cliente 1: " + cli1.nome);
    cli1.pegarLivros();
    for (int i = 0; i < cli1.numeroDeLivros; i++) {
      System.out.println("    " + cli1.livros[i].titulo);
    }

    cli1.devolverLivro(3);
    System.out.println("Depois de devolver o livro 3:");
    for (int i = 0; i < cli1.numeroDeLivros; i++) {
      System.out.println("    " + cli1.livros[i].titulo);
    }
  }
}
