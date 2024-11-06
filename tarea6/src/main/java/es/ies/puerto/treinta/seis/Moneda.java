package es.ies.puerto.treinta.seis;

import java.util.Objects;

public class Moneda {
    private String nombre;
    private float cantidad;

    public Moneda() {
    }

    public Moneda(String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneda moneda = (Moneda) o;
        return Float.compare(cantidad, moneda.cantidad) == 0 && Objects.equals(nombre, moneda.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantidad);
    }
}
