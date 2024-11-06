package es.ies.puerto.treinta.uno;

public class Ejercicio31 {
    static Pelicula pelicula;
    static Pelicula pelicula2;

    public static void main(String[] args) {
        pelicula = new Pelicula("G","G",12);
        pelicula2 = new Pelicula("J","J",13);
        System.out.println(pelicula);
        System.out.println(pelicula2);
        System.out.println("¿Son iguales la duracion?"+pelicula.equals(pelicula2));
    }

}
