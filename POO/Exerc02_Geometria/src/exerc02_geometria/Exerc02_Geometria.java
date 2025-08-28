package exerc02_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc02_Geometria {

    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        // Nome: Gennyson Augusto Kauati Veiga Junior
        // Matrícula: 04028708

        // TODO 4 apague as linhas de acesso direto aos atributos
        ///////// sabemos que este tipo de acesso é prejudical para o projeto, porque ... (complete)
        /*
         * este tipo de acesso não é muito seguro, tendo em vista, que o usuario/programador pode simplesmente
         * mudar o valor da variavel sem que passe por uma verificação.
        */
        // TODO 5 através do set, atribua valor 14.5 para o atributo cateto1
        tr1.cateto1(14.5);
        // TODO 6 através do set, atribua valor 48.1 para o atributo cateto2
        tr1.cateto2(48.1);
        // TODO 7 através do set, atribua valor 51.2 para o atributo hipotenusa
        tr1.hipotenusa(51.2);
        // TODO 8 através do set, atribua valor 12.3 para o atributo alturaHipotenusa
        tr1.auturaHipotenusa(12.3);
        
        // TODO 9 comente: as atribuições deram certo? Por quê?
        /*
         * sim, porque, as atribuições foram feita com metodos publicos que acessaram atributos default (que não podem
         * ser acessadas em classes de outros pacotes).
        */
        // TODO 10 crie aqui uma variável double de nome areaTr1
        double areaTr1;
        // TODO 11 através do objeto tr1, acesse o método calcArea() da classe TrianguloRetangulo
        areaTr1 = tr1.calcArea(); 
        ////////// e armazene o valor de retorno do método na variável areaTr1
        // TODO 12 imprima o valor da área da seguinte forma: "Área do triângulo tr1: <VALOR>"
        System.out.println("Àrea do triangulo tr1: " + areaTr1);
        // TODO 13 comente: por que está dando erro?
        /*
         * porque, o método "calcArea" não foi criado na classe "TrianguloRetangulo".
        */
        // TODO 14 comente: o que pode ser feito para resolver este erro?
        /*
         * criar o método "calcArea" como "public".
        */
        
        
        // TODO 16 crie aqui uma variável double de nome perimetroTr1
        double perimetroTr1;
        // TODO 17 através do objeto tr1, acesse o método calcPerimetro() da classe TrianguloRetangulo
        // tr1.calcPerimetro(); 
        ////////// e armazene o valor de retorno do método na variável perimetroTr1
        perimetroTr1 = tr1.calcPerimetro();
        // TODO 18 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo tr1: <VALOR>"
        System.out.println("Perimetro do triangulo: " + perimetroTr1);
        // TODO 19 comente: por que está dando erro?
        /*
         * porque, o método "calcPerimetro" não foi criado na classe "TrianguloRetangulo".
        */
        // TODO 20 comente: o que pode ser feito para resolver este erro?
        /*
         * criar o método "calcPerimetro" como public.
        */
        
        // TODO 21 crie um outro objeto através do construtor, passando um valor inválido
        TrianguloRetangulo tr2 = new TrianguloRetangulo();
        tr2.cateto1("3");
        tr2.cateto2("4");
        tr2.hipotenusa("5");
        tr2.auturaHipotenusa("3.5");
        // TODO 22 através do objeto da tarefa anterior, chame os métodos calcArea() e calcPerimetro()
        // TODO 23 imprima os valores dos cálculos
        System.out.println("Área do triangulo tr2: " + tr2.calcArea());
        System.out.println("Perimetro do triangulo tr2: " + tr2.calcPerimetro());
        
        // TODO 24 comente: o que acontece? o que fazer para consertar este problema?
        /*
         * o erro foi causado pela entrada de valores do tipo "String", porem, a função esperava valor do
         * tipo "double". Para consertar o erro, podemos adicionar funçoes "set" com "sobrecarga" esperando entradas
         * com tipos diferentes e implementando uma menssagens de erro para o usuario/programador ou simplesmente convertendo
         * o tipo da variavel para realizar a operação, como por exemplo: o usuario/programador entra com um valor "flout" em
         * uma função "set" que está esperando "double", para evitar erros, existe outra função de mesmo nome que está esperando
         * um "flout" como entrada e a função pode realizar a converção dos tipos, realizar o calculo e retornar o resultado
         * como "flout".
        */
        
    }
    
}
