package modelo;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        setNumeroConta(numeroConta);
        setSaldo(saldo);
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Não é aceito valores negativos!");
        }
    }

    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Você não possui este valor!");
        }
    }
}