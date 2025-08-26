public class Aluno {
  String nome;
  int matricula;
  double notaAv1;
  double notaAv2;

  void mostrarDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Matricula: " + matricula);
    System.out.println("Nota Av1: " + notaAv1);
    System.out.println("Nota Av2: " + notaAv2);
  }

  double media() {
    return (notaAv1 + notaAv2) / 2;
  }

  void verificaAprovacao() {
    if (media() >= 7) {
      System.out.println("Aprovado!");
    } else if (media() < 7 && media() > 4) {
      System.out.println("Prova Final!");
    } else if (media() <= 4) {
      System.out.println("Reprovado!");
    }
  }
}
