package es.ies.puerto.cuatro;

import java.util.Objects;

public class Rectangulo {
    private  float ancho;
    private  float alto;

    public Rectangulo() {
    }

    public Rectangulo(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    public void area(){
        float area = ancho * alto;
        System.out.println("El area es: "+area);
    }
    public void perimetro(){
        float perimetro = 2*(ancho + alto);
        System.out.println("El perimetro es: "+perimetro);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Float.compare(ancho, that.ancho) == 0
                && Float.compare(alto, that.alto) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancho, alto);
    }
}
