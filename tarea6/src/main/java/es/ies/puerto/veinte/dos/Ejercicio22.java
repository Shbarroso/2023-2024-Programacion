package es.ies.puerto.veinte.dos;

public class Ejercicio22 {
    static Articulo articulo;

    public static void main(String[] args) {
        articulo = new Articulo("H",2,2);
        System.out.println(articulo);
        articulo.aumentarStock(4);
        System.out.println(articulo);
        articulo.disminuirStock(2);
        System.out.println(articulo);
    }
}
