public class Unama {
  public static void main(String[] args) {
    Aluno al1 = new Aluno();
    Aluno al2 = new Aluno();

    al1.nome = "Gennyson Junior";
    al1.matricula = 40287;
    al1.notaAv1 = 7.0;
    al1.notaAv2 = 8.0;

    al1.mostrarDados();
    System.out.println("");
    System.out.println("Media: " + al1.media());
    System.out.println("");
    al1.verificaAprovacao();

    al2.nome = "Luiz Neto";
    al2.matricula = 16954;
    al2.notaAv1 = 5.0;
    al2.notaAv2 = 1.0;

    System.out.println("\n");
    al2.mostrarDados();
    System.out.println("");
    System.out.println("Media: " + al2.media());
    System.out.println("");
    al2.verificaAprovacao();
  }
}
