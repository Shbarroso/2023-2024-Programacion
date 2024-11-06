package es.ies.puerto.treinta.ocho;

import java.util.Objects;

public class Jugador {
    private String id;
    private String nombre;
    private String tipo;

    public Jugador() {
    }

    public Jugador(String id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(id, jugador.id) && Objects.equals(nombre, jugador.nombre) && Objects.equals(tipo, jugador.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, tipo);
    }
}
