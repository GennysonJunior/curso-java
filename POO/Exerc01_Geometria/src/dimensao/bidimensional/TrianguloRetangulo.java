package dimensao.bidimensional;

public class TrianguloRetangulo {
    float cateto1;
    float cateto2;
    float hipotenusa;
    // float alturaHipotenusa;

    public TrianguloRetangulo(float cateto1, float cateto2, float hipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
    }

    float area() {
        return cateto1*cateto2/2;
    }

    float perimetro() {
        return cateto1+cateto2+hipotenusa;
    }
    
}
