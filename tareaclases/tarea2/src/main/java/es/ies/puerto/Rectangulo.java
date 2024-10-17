package es.ies.puerto;

public class Rectangulo {
    private int base;
    private int altura;


    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return"Base: " + getBase() +
            ", altura: " + getAltura();
    }

    public int calcularArea(){
        return base*altura;
    }

    public int calcularPerimetro(){
        return 2*(base+altura);
    }

}
