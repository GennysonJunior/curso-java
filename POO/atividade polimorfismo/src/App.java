import funcionarios.*;
import funcionarios2.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //1. Polimorfismo (Sobrecarga de Métodos) 
        System.out.println("Soma 5 + 10 = " + calculadora.Calculadora.somar(5, 10));
        System.out.println("Soma 5 + 4 + 2 = " + calculadora.Calculadora.somar(5, 4, 2));
        System.out.println("Soma 5.0 + 4.0 = " + calculadora.Calculadora.somar(5.0, 4.0));

        System.out.println();
        //2. Polimorfismo Dinâmico (Sobrescrita de Métodos)
        ArrayList<funcionarios.Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Gennyson", "999.999.999-99"));
        funcionarios.add(new Programador("Luiz", "888.888.888-88"));

        for (funcionarios.Funcionario f : funcionarios) System.out.println("Salario de " + f.getNome() + ": R$" + f.calcularSalario());

        System.out.println();
        //3. Polimorfismo com Herança e Método Abstrato 
        funcionarios2.Funcionario desenvolvedor = new Desenvolvedor();
        funcionarios2.Funcionario suporte = new Suporte();

        System.out.println("Salario final do desenvolvedor: " + Math.floor(desenvolvedor.calcularSalarioFinal()));
        System.out.println("Salario final do suporte: " + suporte.calcularSalarioFinal());
    }
}
