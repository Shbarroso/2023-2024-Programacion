package es.ies.puerto.diez.tres;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private float notaMatematica;
    private float notaCiencia;
    private float notaProgramacion;

    public Alumno() {
    }

    public Alumno(String nombre, float notaMatematica, float notaCiencia, float notaProgramacion) {
        this.nombre = nombre;
        this.notaMatematica = notaMatematica;
        this.notaCiencia = notaCiencia;
        this.notaProgramacion = notaProgramacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(float notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public float getNotaCiencia() {
        return notaCiencia;
    }

    public void setNotaCiencia(float notaCiencia) {
        this.notaCiencia = notaCiencia;
    }

    public float getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(float notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public double promedio(){
        return (notaCiencia + notaMatematica + notaProgramacion) / 3;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCiencia=" + notaCiencia +
                ", notaProgramacion=" + notaProgramacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Float.compare(notaMatematica, alumno.notaMatematica) == 0 && Float.compare(notaCiencia, alumno.notaCiencia)
                == 0 && Float.compare(notaProgramacion, alumno.notaProgramacion) == 0 && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, notaMatematica, notaCiencia, notaProgramacion);
    }
}
