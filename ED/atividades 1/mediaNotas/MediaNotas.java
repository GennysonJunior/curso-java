import java.util.Random;

public class MediaNotas {
  static Random rd = new Random();
  static double notas[] = new double[4];

  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      notas[i] = rd.nextInt(11);
    }

    double media = 0;
    for (int i = 0; i < 4; i++) {
      media += notas[i];
    }
    media /= 4;

    System.out.println("Notas:");
    for (int i = 0; i < 4; i++) {
      System.out.println("  -- " + (i + 1) + "° nota: " + notas[i]);
    }
    System.out.println("\nMedia aritimética: " + media);
  }
}
