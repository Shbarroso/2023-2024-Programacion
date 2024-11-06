package es.ies.puerto.treinta.cuatro;

import java.util.Objects;

public class Plato {
    private String nombre;
    private int tamanio;
    private String forma;

    public Plato() {
    }

    public Plato(String nombre, int tamanio, String forma) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.forma = forma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", tamanio=" + tamanio +
                ", forma='" + forma + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plato plato = (Plato) o;
        return tamanio == plato.tamanio && Objects.equals(nombre, plato.nombre) && Objects.equals(forma, plato.forma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tamanio, forma);
    }
}
