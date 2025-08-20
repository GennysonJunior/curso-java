public class Main {
  public static void main(String[] args) {
    Carro c1 = new Carro();
    Carro c2 = new Carro();

    c1.marca = "Toyota";
    c1.modelo = "Corola";
    c1.ano = 2015;

    c1.info();
    c1.ligar();

    System.out.println("\n");
    c2.marca = "Volkswagen";
    c2.modelo = "Virtus";
    c2.ano = 2025;

    c2.info();
    c2.ligar();
  }
}
