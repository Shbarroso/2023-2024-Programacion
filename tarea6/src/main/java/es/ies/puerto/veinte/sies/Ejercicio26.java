package es.ies.puerto.veinte.sies;

import es.ies.puerto.diez.siete.Libro;

public class Ejercicio26 {
    static Biblioteca biblioteca;
    static Libro libro;
    static  Libro libro2;

    public static void main(String[] args) {
        libro = new Libro("j","g",2);
        libro2 = new Libro("f","s",3);
        biblioteca = new Biblioteca("H");

        biblioteca.addLibro(libro);
        biblioteca.addLibro(libro2);
        System.out.println(biblioteca);
        biblioteca.deleteLibro(libro2);
        System.out.println(biblioteca);
    }
}
