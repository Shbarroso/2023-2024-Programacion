package es.ies.puerto.veinte.cuatro;

import java.util.Objects;

public class Animal {
    private String nombre;
    private String especie;


    public Animal() {
    }

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", especie='" + getEspecie() + "'" +
            "}";
    }



     public boolean equals(Animal animal) {
        if (this.nombre.equals(animal.nombre) && this.especie.equals(animal.especie)){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, especie);

    }
}
