import java.util.Scanner;

public class ValoresPares {
  static Scanner sc = new Scanner(System.in);
  static int numeros[] = new int[10];

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o " + (i + 1) + "° número: ");
      numeros[i] = sc.nextInt();
    }

    System.out.println("\nValores pares:");
    for (int i = 0; i < 10; i++) {
      if (numeros[i] % 2 == 0) {
        System.out.println("  -- " + numeros[i]);
      }
    }
  }
}
