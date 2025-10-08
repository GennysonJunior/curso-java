package calculadoraSimples;
import javax.swing.JOptionPane;

public class Calculadora {
    private double num1;
    private double num2;

    public void setNum1() {
        this.num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um nùmero:"));
    }

    public void setNum2() {
        this.num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número:"));
    }

    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public String calcular() {
        String[] opcoes = {"+", "-", "*", "/"};

        int escolha = JOptionPane.showOptionDialog(null,
            "Escolha uma das opções abaixo:",
            "Calculadora",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        String res = "";
        switch (escolha) {
            case 0:
                res = "Resposta da soma: " + (this.num1 + this.num2);
                break;
            case 1:
                res = "Resposta da subtração: " + (this.num1 - this.num2);
                break;
            case 2:
                res = "Resposta da multiplicação: " + (this.num1 * this.num2);
                break;
            case 3:
                if (this.num2 == 0) {
                    throw new ArithmeticException("Divisão por zero!");
                }
                res = "Resposta da divisão: " + (this.num1 / this.num2);
        }

        JOptionPane.showMessageDialog(null, res);
        return res;
    }
}
