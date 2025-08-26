public class Main {
  public static void main(String[] args) {

    Produto pd1 = new Produto();
    Produto pd2 = new Produto();
    Produto pd3 = new Produto();

    pd1.setNome("azeite");
    pd1.setPreco(50.0);
    System.out.println(
        "produto: "
            + pd1.getNome()
            + ", preço: "
            + (pd1.getPreco() != 0.0 ? pd1.getPreco() : "sem preço"));

    pd2.setNome("picanha");
    pd2.setPreco(90.0);
    System.out.println(
        "produto: "
            + pd2.getNome()
            + ", preço: "
            + (pd2.getPreco() != 0.0 ? pd2.getPreco() : "sem preço"));

    pd3.setNome("sal");
    pd3.setPreco(-3.0);
    System.out.println(
        "produto: "
            + pd3.getNome()
            + ", preço: "
            + (pd3.getPreco() != 0.0 ? pd3.getPreco() : "sem preço"));
  }
}
