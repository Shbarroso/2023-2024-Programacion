package es.ies.puerto.veinte.nueve;

import es.ies.puerto.diez.siete.Libro;

import java.util.Arrays;

public class Estanteria {
    private String nombre;
    private int numLibro;
    private Libro[] libros;

    public Estanteria() {
        numLibro = 0;
        libros = new Libro[5];
    }

    public Estanteria(String nombre) {
        this.nombre = nombre;
        numLibro = 0;
        libros = new Libro[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLibro() {
        return numLibro;
    }

    public void setNumLibro(int numLibro) {
        this.numLibro = numLibro;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public boolean addLibro(Libro libro){
        if (libro == null){
            return false;
        }
        if (numLibro >= libros.length){
            return false;
        }
        libros[numLibro] = libro;
        numLibro++;
        return true;
    }

    public void ordenarLibro() {
        for (int i = 0; i < numLibro - 1; i++) {
            for (int j = 0; j < numLibro - i - 1; j++) {
                if (libros[j].getTitulo().compareToIgnoreCase(libros[j + 1].getTitulo()) > 0) {
                    Libro temporal = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temporal;
                }
            }
        }
    }

    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;
        for (int i = 0; i < numLibro; i++){
            mensaje += libros[i];
        }
        return mensaje;
    }
}
