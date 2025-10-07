import calculadoraSimples.Calculadora;
import pedidos.Pedido;
import turma.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        1) Cite quatro exemplos diferentes que podem ser considerados
        como agregação ou composição (dois de cada).
        
        gaveta    --> guarda roupa (agregação)
        roda      --> carro (agregação)
        cachorro  --> animal (composição)
        professor --> funcionário (composição)

        2) O que acontece se uma classe for programada como final? E se
        um atributo for “setado” como final?

        Uma classe como final é uma classe que não pode ser herdada por
        outra classe, ou seja, a classe final e a classe filha de todas
        as outras classes da árvore de herança (é as folhas da árvore).
        Um atributo final é um atributo que o seu valor não pode ser
        modificado, ou seja, é uma constante.

        3) Qual a vantagem de programar um método estático?

        A vantagem é que pode-se usar o método sem que a classe seja
        instanciada, só pode ser criado métodos estatico se estes não
        dependerem de atributos da classe.

        4) Pesquise e cite mais dois métodos que fazem parte da classe
        Object.

        clone(): Cria e retorna uma cópia exata deste objeto.
        finalize(): Chamado pelo garbage collector antes que um objeto
        seja coletado, permitindo a execução de tarefas de limpeza,
        mas não deve ser usado indiscriminadamente.
        */
        

        //5) Calculadora Simples com Dialogs
        System.out.println("\nQuestão 5)");
        Calculadora c = new Calculadora();

        c.setNum1();
        c.setNum2();
        try {
            System.out.println(c.calcular());
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e);
        }

        //6) Crie a classe Professor com os atributos: nome e a classe Turma (com os atributos codigo e um Professor).
        System.out.println("\nQuestão 6)");
        Turma t = new Turma(0, "Samara");
        System.out.println(t.resumo());

        //7) Você deve criar um sistema simples para calcular o valor total de um pedido.
        System.out.println("\nQuestão 7)");
        Pedido p = new Pedido();

        p.adicionarItem("Teclado", 2, 150.0);
        p.adicionarItem("Mouse", 1, 80.0);

        System.out.println("Valor total: " + p.valorTotal());
    }
}
