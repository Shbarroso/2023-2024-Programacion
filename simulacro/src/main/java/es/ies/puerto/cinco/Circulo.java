package es.ies.puerto.cinco;

public class Circulo {
    private  float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return this.radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return" Radio:" + getRadio();
    }

    public float area(){
        double area = Math.PI * Math.pow(radio, 2);
        return (float) area;
    }
    public float perimetro(){
        double perimetro = 2 * Math.PI * radio;
        return (float) perimetro;
    }

}
