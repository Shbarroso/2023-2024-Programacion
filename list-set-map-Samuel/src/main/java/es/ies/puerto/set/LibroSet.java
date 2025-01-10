package es.ies.puerto.set;

import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.Libro;
import es.ies.puerto.Persona;

public class LibroSet {
    Set<Libro> libros;

    public LibroSet() {
        this.libros = new HashSet<>();
    }

    public boolean agregar(Libro libro) {
        if (!libros.contains(libro)) {
            return libros.add(libro);
        } else {
            return false;
        }
    }

    public Set<Libro> listar() {
        return new HashSet<>(libros);
    }

    public Libro buscar(String isbn) {
        Libro libroBuscar = new Libro(isbn);
        int posicion = libros.indexOf(libroBuscar);
        if (posicion < 0) {
            return null;
        } else {
            return libros.get(posicion);
        }
    }

    public boolean actualizar(String isbn, Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getDni().equals(isbn)) {
                libros.set(i, libro);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String isbn) {
        Libro libroEliminar = new Libro(isbn);
        return libros.remove(libroEliminar);
    }

}
