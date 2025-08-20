public class Cliente {
  String nome;
  int numeroDeLivros;
  Livro livros[];

  void pegarLivros() {
    livros = new Livro[numeroDeLivros];
    for (int i = 0; i < numeroDeLivros; i++) {
      livros[i] = new Livro();
      livros[i].titulo = "Livro Generioco " + i;
      livros[i].numeroPaginas = 100 + i;
      livros[i].anoPublicacao = 1990 + i + "";
      livros[i].preco = 30.00 + (double) i;
    }
  }

  void devolverLivro(int num) {
    Livro novoLivros[] = new Livro[numeroDeLivros - 1];
    int index = -1;
    for (int i = 0; i < numeroDeLivros; i++) {
      if (Integer.parseInt("" + livros[i].titulo.charAt(livros[i].titulo.length() - 1)) == num) {
        index = i;
      }
    }

    int j = 0;
    for (int i = 0; i < numeroDeLivros; i++) {
      if (i != index) {
        novoLivros[j++] = livros[i];
      }
    }

    livros = novoLivros;
    numeroDeLivros--;
  }
}
