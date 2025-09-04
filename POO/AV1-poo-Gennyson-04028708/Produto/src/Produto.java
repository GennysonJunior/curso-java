public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int estoque;

    Produto(int codigo, String descricao, double preco, int estoque) {
        setCodigo(codigo);
        setDescricao(descricao);
        setPreco(preco);
        setEstoque(estoque);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O Preço deve ser maior que zero!");
        }
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            System.out.println("O estoque não poder ser negativo!");
        }
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void aumentarEstoque(int qtd) {
        int qtdAtual = getEstoque();
        setEstoque(qtdAtual+qtd);
    }

    public void diminuirEstoque(int qtd) {
        int qtdAtual = getEstoque();
        setEstoque(qtdAtual-qtd);
    }

}
