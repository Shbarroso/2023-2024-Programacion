package es.ies.puerto.treinta.dos;

import java.util.Objects;

public class Paciente {
    private String id;
    private String nombre;

    public Paciente() {
    }

    public Paciente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Paciente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(id, paciente.id) && Objects.equals(nombre, paciente.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}
