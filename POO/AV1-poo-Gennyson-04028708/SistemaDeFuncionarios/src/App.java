public class App {
    public static void main(String[] args) throws Exception {
        Funcionario F1 = new Funcionario();
        Funcionario F2 = new Funcionario("Gennyson Junior", 200, 5000.0);
        Funcionario F3 = new Funcionario("Luiz Neto", 300, 3000.0);

        F1.setSalario(200.0);

        System.out.println("Nome: "+F1.getNome());
        System.out.println("Matricula: "+F1.getMatricula());
        System.out.println("Salario: "+F1.getSalario());
    }
}
