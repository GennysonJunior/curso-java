public class App {
    public static void main(String[] args) throws Exception {
        Produto P1 = new Produto(1, "caneta", 5.0, 50);
        Produto P2 = new Produto(2, "borracha", 3.0, 50);

        System.out.println("----------------------------------------------");
        System.out.println("Produto 1: "+P1.getDescricao());
        System.out.println("Preço: "+P1.getPreco());
        System.out.println("Estoque: "+P1.getEstoque());
        System.out.println("----------------------------------------------");
        System.out.println("Produto 2: "+P2.getDescricao());
        System.out.println("Preço: "+P2.getPreco());
        System.out.println("Estoque: "+P2.getEstoque()+"\n");

        P1.aumentarEstoque(100);
        P2.diminuirEstoque(100);

        System.out.println("\n----------------------------------------------");
        System.out.println("Produto 1: "+P1.getDescricao());
        System.out.println("Preço: "+P1.getPreco());
        System.out.println("Estoque: "+P1.getEstoque());
        System.out.println("----------------------------------------------");
        System.out.println("Produto 2: "+P2.getDescricao());
        System.out.println("Preço: "+P2.getPreco());
        System.out.println("Estoque: "+P2.getEstoque());
    }
}
