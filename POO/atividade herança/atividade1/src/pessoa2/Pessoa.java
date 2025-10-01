package pessoa2;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        setEndereco(endereco);
        setNome(nome);
        setTelefone(telefone);
    }

    public Pessoa(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }

    public Pessoa(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
