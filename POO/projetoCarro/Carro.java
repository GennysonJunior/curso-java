public class Carro {
  String marca;
  String modelo;
  int ano;

  void info() {
    System.out.println("Marca: " + marca);
    System.out.println("modelo: " + modelo);
    System.out.println("Ano: " + ano);
  }

  void ligar() {
    System.out.println("Ligando...");
  }
}
