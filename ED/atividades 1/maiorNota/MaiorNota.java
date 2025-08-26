import java.util.Scanner;

public class MaiorNota {
  static double notas[] = new double[10];
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print("Digitre a " + (i + 1) + "° nota: ");
      notas[i] = sc.nextDouble();
    }

    double maiorNota = 0;
    for (int i = 0; i < 10; i++) {
      if (notas[i] > maiorNota) {
        maiorNota = notas[i];
      }
    }

    System.out.println("\nA maior nota è: " + maiorNota);
  }
}
