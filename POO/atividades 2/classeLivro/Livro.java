public class Livro {
  private String titulo;
  private String autor;
  private boolean disponivel = true;

  public Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String isDisponivel() {
    if (this.disponivel) {
      return "sim";
    }
    return "não";
  }

  public void emprestar() {
    this.disponivel = false;
  }

  public void devolver() {
    this.disponivel = true;
  }
}
