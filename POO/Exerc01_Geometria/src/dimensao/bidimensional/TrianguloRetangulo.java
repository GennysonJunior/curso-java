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
        return cateto1*cateto2/2.0;
    }

    double perimetro() {
        return cateto1+cateto2+hipotenusa;
    }
    
}
