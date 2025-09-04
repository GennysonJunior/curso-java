import java.util.Random;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;
    
    Funcionario() {
        Random rd = new Random();
        int m = rd.nextInt(101);
        this.nome = "Funcionario-" + m;
        this.matricula = m;
        this.salario = 0.0;
    }

    Funcionario(String nome, int matricula, double salario) {
        setNome(nome);
        setMatricula(matricula);
        setSalario(salario);
    }

    public void setSalario(double salario) {
        if (salario > 1412.0) {
            this.salario += salario;
        } else {
            System.out.println("O valor minimo a ser depositado: R$" + 1412.0);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }
}