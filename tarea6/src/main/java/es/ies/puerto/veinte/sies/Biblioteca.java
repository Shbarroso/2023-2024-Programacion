package es.ies.puerto.veinte.sies;

import es.ies.puerto.diez.siete.Libro;

public class Biblioteca {
    private String nombre;
    private int numLibros;
    private Libro[] libros;

    public Biblioteca() {
        numLibros = 0;
        libros = new Libro[5];
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        numLibros = 0;
        libros = new Libro[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLibros() {
        return numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public boolean addLibro(Libro libro){
        if (libro == null){
            return  false;
        }
        if (numLibros >= libros.length){
            return false;
        }
        libros[numLibros] = libro;
        numLibros++;
        return  true;
    }
    public  boolean  deleteLibro(Libro libro){
        if (libro == null) {
            return false;
        }
        if (numLibros == 0)  {
            return false;
        }
        for (int i = 0; i < libros.length; i++) {
            if (libro.equals(libros[i])) {
                libros[i] = null;
                numLibros--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numLibros; i++){
            mensaje += libros[i];
        }
        return mensaje;
    }
}
