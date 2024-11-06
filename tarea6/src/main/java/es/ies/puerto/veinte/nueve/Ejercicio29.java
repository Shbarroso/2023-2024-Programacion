package es.ies.puerto.veinte.nueve;

import es.ies.puerto.diez.siete.Libro;

public class Ejercicio29 {
    static Estanteria estanteria;
    static Libro libro;
    static Libro libro2;
    static Libro libro3;

    public static void main(String[] args) {
        libro = new Libro("H","H",2);
        libro2 = new Libro("A","A",2);
        libro3 = new Libro("K","K",2);
        estanteria = new Estanteria("H");
        estanteria.addLibro(libro);
        estanteria.addLibro(libro2);
        estanteria.addLibro(libro3);
        System.out.println(estanteria);
        estanteria.ordenarLibro();
        System.out.println(estanteria);
    }
}
