package es.ies.puerto;

public class Circulo {
    private  float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        setRadio(radio);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }

    public float area(){
        double area = Math.PI * Math.pow(radio,2);
        return (float) area;
    }
    public void perimetro(){
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro: "+perimetro);
    }
    @Override
    public String toString() {
        return "Radio: " + radio;
    }
}
