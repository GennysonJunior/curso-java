package dimensao.bidimensional;

public class TrianguloRetangulo {
    double cateto1;
    double cateto2;
    double hipotenusa;
    double auturaHipotenusa;
    
    public double cateto1() {
        return this.cateto1;
    }

    public void cateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double cateto2() {
        return this.cateto2;
    }

    public void cateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    public double hipotenusa() {
        return this.hipotenusa;
    }

    public void hipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double auturaHipotenusa() {
        return this.auturaHipotenusa;
    }

    public void auturaHipotenusa(double auturaHipotenusa) {
        this.auturaHipotenusa = auturaHipotenusa;
    }

    public double calcArea() {
        return this.cateto1*this.cateto2/2.0;
    }

    public double calcArea(double cateto1, double cateto2) {
        return cateto1*cateto2/2.0;
    }

    public double calcPerimetro() {
        return this.cateto1+this.cateto2+this.hipotenusa;
    }

    public double calcPerimetro(double x, double y, double z) {
        return x+y+z;
    }
}