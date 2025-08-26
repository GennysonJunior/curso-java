public class ClassePessoa {
  private String nome;
  private int idade;
  private Endereco endereco;

  public ClassePessoa(String nome, int idade, String rua, int numero) {
    this.nome = nome;
    this.idade = idade;
    this.endereco = new Endereco(rua, numero);
  }

  public String getNome() {
    return this.nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public String getEndereco() {
    return "" + this.endereco.getRua() + ", " + this.endereco.getNumero();
  }

  public void mostrarDados() {
    System.out.println(
        "Dados:\n  Nome: "
            + this.getNome()
            + "\n  Idade: "
            + this.getIdade()
            + "\n  Endereço: "
            + this.getEndereco());
  }
}
