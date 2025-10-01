package pessoa2;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    
    public void setValorCredito(double valor) {
        this.valorCredito = valor;
    }

    public void setValorDivida(double valor) {
        this.valorDivida = valor;
    }

    public double getValorCredito() {
        return this.valorCredito;
    }

    public double getValorDivida() {
        return this.valorDivida;
    }

    public double obterSaldo() {
        return getValorCredito() - getValorDivida();
    }
}
