public class Biblioteca {
  private Livro l[];
  private int cont;

  public Biblioteca(int cont) {
    this.cont = cont;
    this.l = new Livro[cont];
  }

  public void adicionarLivro(Livro livro) {
    for (int i = 0; i < this.cont; i++) {
      if (this.l[i] == null) {
        this.l[i] = livro;
        break;
      }
    }
  }

  public void emprestarLivro(String titulo) {

    boolean e = true;
    for (int i = 0; i < this.cont; i++) {
      if (this.l[i] != null) {
        if (this.l[i].isDisponivel().equals("sim") && this.l[i].getTitulo().equals(titulo)) {
          this.l[i].emprestar();
          e = false;
          break;
        }
      }
    }
    if (e) {
      System.out.println("livro indisponivel!");
    } else {
      System.out.println("livro emprestado!");
    }
  }

  public void devolverLivro(String titulo) {

    boolean e = true;
    for (int i = 0; i < this.cont; i++) {
      if (this.l[i] != null) {
        if (this.l[i].isDisponivel().equals("não") && this.l[i].getTitulo().equals(titulo)) {
          this.l[i].devolver();
          e = false;
          break;
        }
      }
    }
    if (e) {
      System.out.println("livro não existente ou já devolvido!");
    } else {
      System.out.println("livro devolvido!");
    }
  }

  public void mostrarLivros() {
    for (int i = 0; i < this.cont; i++) {
      if (this.l[i] != null) {
        System.out.println(
            "Titulo: "
                + this.l[i].getTitulo()
                + "\nDisponivel: "
                + this.l[i].isDisponivel()
                + "\n\n");
      }
    }
  }
}
