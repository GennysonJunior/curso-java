package pedidos;

public class ItemPedido {
    private String nome;
    private int qtd;
    private double precoUni;

    public ItemPedido(String nome, int qtd, double precoUni) {
        setNome(nome);
        setPrecoUni(precoUni);
        setQtd(qtd);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setPrecoUni(double valor) {
        this.precoUni = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQtd() {
        return this.qtd;
    }

    public double getPrecoUni() {
        return this.precoUni;
    }

    public double subtotal() {
        return this.precoUni * (double)this.qtd;
    }
}
