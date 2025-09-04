import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        01 - Qual das seguintes afirmações sobre arrays em Java está correta?
            
            a) Arrays em Java podem conter elementos de tipos de dados diferentes.
            
            b) É possível redimensionar um array em tempo de execução.
            
            c) O índice de um array em Java começa em 1.
            
            d) Arrays em Java são sempre de tamanho fixo. (correto)
            
            e) Não é possível passar um array como argumento para um método em Java.
        
        02 - Um dos exemplos de estrutura de dados é a lista encadeada simples. Com relação a esse
        tipo de lista, é correto afirmar:
            
            a) Possui a característica de que o último elemento da lista possui um ponteiro para o
            primeiro elemento da lista.
            
            b) É necessário definir o seu tamanho no momento da sua criação, pois se trata de uma
            estrutura de dados estática.
            
            c) Quando essa estrutura é utilizada, os elementos da lista sempre estarão armazenados
            sequencialmente na memória física.
            
            d) Na inserção de um novo elemento, é necessário realizar a atualização dos ponteiros dos
            elementos envolvidos, não sendo necessário realizar o deslocamento físico dos
            elementos. (correto)
            
            e) Na recuperação de qualquer elemento da lista, não é necessário percorrer os outros
            elementos. Dessa forma, o elemento buscado é acessado diretamente na posição onde se
            encontra.

        03 – Uma empresa de comércio eletrônico precisa armazenar o catálogo de produtos em
        um array para facilitar a busca pelo código do produto. Qual a principal vantagem de
        usar array nesse caso?
            
            a) A inserção de novos produtos no início da estrutura é mais rápida.
            
            b) O consumo de memória é sempre menor que em qualquer outra estrutura.
            
            c) O acesso direto a qualquer produto pelo índice é rápido e eficiente. (correto)
            
            d) A remoção de produtos é mais eficiente que em listas encadeadas.
            
            e) Arrays se adaptam automaticamente ao crescimento do número de produtos.
        
        04 – Durante a Black Friday, o sistema precisa cadastrar milhares de novos produtos rapidamente.
        Usar listas simplesmente encadeadas pode ser mais adequado que arrays porque:
            
            a) O acesso ao produto por posição é mais rápido.
            
            b) Não há necessidade de redimensionar a estrutura ao adicionar elementos. (correto)
            
            c) O consumo de memória é fixo, independente da quantidade de produtos.
            
            d) Os elementos podem ser acessados diretamente pelo índice.
            
            e) A ordem de inserção dos produtos é automaticamente classificada.

        05 – Um sistema de banco deseja controlar a fila de operações realizadas por clientes. Se for
        utilizada uma lista simplesmente encadeada, qual operação é mais eficiente em comparação com
        arrays?
            
            a) Acesso ao cliente na posição 10 da fila.
            
            b) Inserção de um cliente no final da fila. (correto)
            
            c) Remoção do cliente do meio da fila.
            
            d) Inserção de um cliente no início da fila.
            
            e) Busca por um cliente específico na fila.

        06 – Considere o cadastro de 10 milhões de usuários em um aplicativo. Comparando arrays e
        listas simplesmente encadeadas, qual afirmação está correta?
            
            a) Arrays sempre gastam menos memória, pois não armazenam ponteiros.
            
            b) Listas gastam menos memória porque não possuem tamanho fixo.
            
            c) Arrays podem desperdiçar memória quando são superdimensionados. (correto)
            
            d) Listas não têm desperdício de memória, pois cada nó é totalmente ocupado por dados.
            
            e) Arrays não precisam de redimensionamento quando chegam ao limite de capacidade.

        07 – Um professor deseja armazenar as notas de uma turma em ordem fixa, pois cada aluno
        ocupa uma posição determinada na lista de chamada. Qual estrutura é mais adequada?
            
            a) Lista simplesmente encadeada, pois permite acesso rápido por índice.
                
            b) Array, pois cada aluno pode ser acessado diretamente pela sua posição. (correto)
                
            c) Lista simplesmente encadeada, pois cresce dinamicamente sem desperdício.
                
            d) Array, pois facilita inserções e remoções no início.
                
            e) Lista simplesmente encadeada, pois não precisa armazenar ponteiros.

        08 – O que é impresso?

            public class Q1 {
                public static void main(String[] args) {
                    int[] v = {4, 7, 9, 2};
                    int i = 1;
                    v[i + 2] = v[i] + v[0];
                    System.out.println(v[3] + ", " + v[2]);
                }
            }

            Resposta: 11, 9

        09 – Na ciência da computação, ponteiros são fundamentais em algumas linguagens de
        programação e estruturas de dados. Sobre o conceito de ponteiros, assinale a alternativa correta:

            a) Ponteiro é uma variável especial que armazena diretamente o valor de um dado, como
            um int ou double.
            
            b) Ponteiro é uma variável que armazena o endereço de memória de outro dado ou objeto. (correto)
            
            c) Ponteiro é o mesmo que um array, pois ambos permitem acesso sequencial a vários
            elementos.
            
            d) Ponteiro é utilizado apenas em linguagens orientadas a objetos como Java.
            
            e) Ponteiro é sempre mais seguro do que variáveis comuns, pois evita erros de acesso a
            memória.

        11 - Qual dos trechos de código abaixo insere corretamente um elemento no final de
        uma LinkedList em Java, considerando a declaração:
            
                LinkedList<String> nomes = new LinkedList<>();

            a) nomes.addLast("Maria"); (correto)
            
            b) nomes.add(0,"Maria");
            
            c) nomes.insertLast("Maria");
            
            d) nomes.push("Maria");
            
            e) nomes.addFirst("Maria");

        12 – Qual a diferença entre alocação estática e alocação dinâmica de memória?

            resposta: Alocação estática é a memória reservada em tempo de compilação e alocação dinâmica é
            a memória reservada em tempo de execução, conforme a necessidade.
        
        13 - Considere que você deseja criar um array com as notas de 5 disciplinas em Java e atribuir o
        valor 9 à quarta posição do array. Qual trecho de código realiza essa operação corretamente?
            
            a) int[] notas = new int[5];
               notas[4] = 9;
            
            b) int[] notas = new int[5]; (correto)
               notas[3] = 9;
            
            c) int[] notas = {9, 0, 0, 0, 0};
            
            d) int[] notas = new int[5];
               notas.add(3, 9);
            
            e) int[] notas = new int[5];
               notas.add(3, 9);
        */
    }
}
