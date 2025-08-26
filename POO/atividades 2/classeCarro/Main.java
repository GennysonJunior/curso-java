public class Main {
  public static void main(String[] args) {

    Carro carro = new Carro();

    carro.setMarca("Toyota");
    carro.setAno(2025);

    System.out.println("Carro:\n  Marca: " + carro.getMarca() + ", Ano: " + carro.getAno());
  }
}
