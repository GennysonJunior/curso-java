public class App {
    public static void main(String[] args) throws Exception {
        Livro L1 = new Livro("01", "diario de um banana", "não sei");
        Livro L2 = new Livro("02", "harry potter", "não lembro");

        System.out.println("---------------------------------------------------------");
        System.out.println("TiTulo: "+L1.getTitulo());
        System.out.println("Emprestado: "+(L1.isDisponivel() ? "não" : "sim"));
        System.out.println("---------------------------------------------------------");
        System.out.println("TiTulo: "+L2.getTitulo());
        System.out.println("Emprestado: "+(L2.isDisponivel() ? "não" : "sim")+"\n");

        L1.emprestar();

        System.out.println("\n---------------------------------------------------------");
        System.out.println("TiTulo: "+L1.getTitulo());
        System.out.println("Emprestado: "+(L1.isDisponivel() ? "não" : "sim"));
        System.out.println("---------------------------------------------------------");
        System.out.println("TiTulo: "+L2.getTitulo());
        System.out.println("Emprestado: "+(L2.isDisponivel() ? "não" : "sim"));

        L1.emprestar();
        L1.devolver();

        System.out.println("\n---------------------------------------------------------");
        System.out.println("TiTulo: "+L1.getTitulo());
        System.out.println("Emprestado: "+(L1.isDisponivel() ? "não" : "sim"));
        System.out.println("---------------------------------------------------------");
        System.out.println("TiTulo: "+L2.getTitulo());
        System.out.println("Emprestado: "+(L2.isDisponivel() ? "não" : "sim"));
    }
}
