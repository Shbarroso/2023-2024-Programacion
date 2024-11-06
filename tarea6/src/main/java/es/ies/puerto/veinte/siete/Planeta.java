package es.ies.puerto.veinte.siete;

public class Planeta {
    private String nombre;
    private float masa;
    private float radio;
    private static final float G = 6.67430e-11f;


    public Planeta() {
    }

    public Planeta(String nombre, float masa, float radio) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMasa() {
        return masa;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularGavedad(){
        return (G *masa)/(radio * radio);
    }
}
