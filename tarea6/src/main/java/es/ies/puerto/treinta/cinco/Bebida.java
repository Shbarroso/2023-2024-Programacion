package es.ies.puerto.treinta.cinco;

import java.util.Objects;

public class Bebida {
    private String nombre;
    private float precio;
    private float tamanio;

    public Bebida() {
    }

    public Bebida(String nombre, float precio, float tamanio) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tamanio=" + tamanio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bebida bebida = (Bebida) o;
        return tamanio == bebida.tamanio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, tamanio);
    }
}
