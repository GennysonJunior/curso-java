package funcionarios;

public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        setCpf(cpf);
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double calcularSalario() {
        return 1500.0;
    }
}
