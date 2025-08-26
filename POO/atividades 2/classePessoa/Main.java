public class Main {
  public static void main(String[] args) {

    ClassePessoa p1 = new ClassePessoa("Gennyson", 25, "casa 1", 300);
    ClassePessoa p2 = new ClassePessoa("Luiz", 22, "casa 2", 301);

    p1.mostrarDados();
    System.out.println("\n");
    p2.mostrarDados();
  }
}
