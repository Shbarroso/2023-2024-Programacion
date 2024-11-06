package es.ies.puerto.diez.siete;

public class Ejercicio17 {
    static Libro libro;
    static Libro libro2;

    public static void main(String[] args) {
        libro = new Libro("h","hu",9);
        libro2 = new Libro("g","J",100);
        System.out.println(libro);
        System.out.println(libro2);
        System.out.println("¿Tienen las mismas paginas?"+libro.equals(libro2));
    }

}
