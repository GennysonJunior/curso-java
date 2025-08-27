public class Livro {
  private String titulo;
  private String autor;
  private boolean disponivel;

  public Livro(String titulo, String autor, boolean disponivel) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = disponivel;
  }

  public Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = true;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getAutor() {
    return this.autor;
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
