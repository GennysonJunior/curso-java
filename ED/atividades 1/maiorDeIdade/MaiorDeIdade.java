import java.util.Random;

public class MaiorDeIdade {
  static int idades[] = new int[10];
  static Random rd = new Random();

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      idades[i] = rd.nextInt(80);
    }

    System.out.println("Todas as idades: ");
    for (int i = 0; i < 10; i++) {
      System.out.println("  -- " + (i + 1) + "° idade: " + idades[i] + " anos");
    }

    System.out.println("\nIdades maiores que 18: ");
    for (int i = 0; i < 10; i++) {
      if (idades[i] >= 18) {
        System.out.println("  -- " + (i + 1) + "° idede: " + idades[i] + " anos");
      }
    }
  }
}
