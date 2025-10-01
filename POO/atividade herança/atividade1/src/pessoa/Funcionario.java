package pessoa;
public class Funcionario extends Pessoa {
    String setor;
    boolean trabalhando;

    void mudarTrabalho(String novoSetor) {
        this.setor = novoSetor;
    }
}
