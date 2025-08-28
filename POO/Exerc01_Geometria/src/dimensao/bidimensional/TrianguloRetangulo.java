package dimensao.bidimensional;

public class TrianguloRetangulo {
    double cateto1;
    double cateto2;
    double hipotenusa;
    // float alturaHipotenusa;

    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
    }

    double area() {
        return this.cateto1*this.cateto2/2.0;
    }

    double area(double cateto1, double cateto2) {
        return cateto1*cateto2/2.0;
    }

    double perimetro() {
        return this.cateto1+this.cateto2+this.hipotenusa;
    }

    double perimetro(double x, double y, double z) {
        return x+y+z;
    }
    
}
