public class Main {
  static Biblioteca b = new Biblioteca(5);

  public static void main(String[] args) {
    Livro l1 = new Livro("livro 1", "autor 1");
    b.adicionarLivro(l1);

    Livro l2 = new Livro("livro 2", "autor 2");
    b.adicionarLivro(l2);

    Livro l3 = new Livro("livro 3", "autor 3");
    b.adicionarLivro(l3);

    b.mostrarLivros();
    System.out.println("-------------------------------------------------");

    b.emprestarLivro("livro 2");
    System.out.println();
    b.mostrarLivros();
    System.out.println("-------------------------------------------------");

    b.devolverLivro("livro 2");
    System.out.println();
    b.mostrarLivros();
  }
}
