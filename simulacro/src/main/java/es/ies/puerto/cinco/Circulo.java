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

    public void perimetro(float perimetro){

    }

}
