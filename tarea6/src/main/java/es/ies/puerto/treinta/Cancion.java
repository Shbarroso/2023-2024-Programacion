package es.ies.puerto.treinta;

import java.util.Objects;

public class Cancion {
    private String nombre;
    private String artistas;

    public Cancion() {
    }

    public Cancion(String nombre, String artistas) {
        this.nombre = nombre;
        this.artistas = artistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", artistas='" + artistas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(nombre, cancion.nombre) && Objects.equals(artistas, cancion.artistas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, artistas);
    }
}
