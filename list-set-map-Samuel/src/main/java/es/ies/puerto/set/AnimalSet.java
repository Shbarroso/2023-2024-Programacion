package es.ies.puerto.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.ies.puerto.*;

public class AnimalSet {
    private Set<Animal> animales;

    public AnimalSet() {
        this.animales = new HashSet<>();
    }

    public boolean agregar(Animal animal) {
        if (!animales.contains(animal)) {
            return animales.add(animal);
        } else {
            return false;
        }
    }

    public Set<Animal> listarAnimales() {
        return new HashSet<>(animales);
    }

    public Animal buscar(String identificador) {
        Animal animalBuscado = new Animal(identificador);
        int posicion = animales.indexOf(animalBuscado);
        if (posicion < 0) {
            return null;
        } else {
            return animales.get(posicion);
        }
    }

    public boolean actualizar(String identificador, Animal nuevoAnimal) {
        Animal animalBuscar = new Animal(identificador);
        int posicion = animales.indexOf(animalBuscar);
        if (posicion < 0) {
            return false;
        }
        animales.set(posicion, nuevoAnimal);
        return true;
    }

    public boolean eliminar(String identificador) {
        Animal animalEliminar = new Animal(identificador);
        return animales.remove(animalEliminar);
    }

}
