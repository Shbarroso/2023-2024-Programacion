package es.ies.puerto.tres;

import java.util.Objects;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private float velocidad;

    public Coche() {
    }

    public Coche(String marca, String modelo, int anio, float velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        if (velocidad > 0){
            this.velocidad = velocidad;
        }else {
            System.out.println("La velocidad no puede ser negativa");
        }
    }

    public void acelerar(float incremento){
        if (incremento > 0){
            this.velocidad += incremento;
            System.out.println("El coche a acelerado: "+incremento);
        }else {
            System.out.println("Tiene que ser positivo el incremento");
        }
    }
    public void frenar(float decrementar){
        if (decrementar > 0){
            this.velocidad -= decrementar;
            System.out.println("El coche a frenado a: "+decrementar);
        }else {
            System.out.println("Tiene que ser positivo el decremento");
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", velocidad=" + velocidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return anio == coche.anio && Float.compare(velocidad, coche.velocidad) == 0
                && Objects.equals(marca, coche.marca)
                && Objects.equals(modelo, coche.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anio, velocidad);
    }
}
