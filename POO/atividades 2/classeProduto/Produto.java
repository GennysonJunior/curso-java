public class Produto {
  private String nome;
  private double preco = 0.0;

  public String getNome() {
    return this.nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    if (preco > 0) {
      this.preco = preco;
    } else {
      System.err.println("Valor invalido!");
    }
  }
}
