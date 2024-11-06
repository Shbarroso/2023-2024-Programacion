package es.ies.puerto.veinte.ocho;

import java.util.Objects;

public class Ciudad {
    private String nombre;
    private String pais;
    private float poblacion;

    public Ciudad() {
    }

    public Ciudad(String nombre, String pais, float poblacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public float getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(float poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ciudad ciudad = (Ciudad) o;
        return this.poblacion == ciudad.poblacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais, poblacion);
    }
}
