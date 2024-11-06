package es.ies.puerto.treinta.nueve;

import es.ies.puerto.veinte.dos.Articulo;

public class Ejercicio39 {
    static Articulo articulo;
    static Articulo articulo2;
    static Tienda tienda;

    public static void main(String[] args) {
        articulo = new Articulo("h",2,2);
        articulo2 = new Articulo("s",3,3);
        tienda = new Tienda("Hola");

        tienda.addArticulo(articulo);
        tienda.addArticulo(articulo2);
        System.out.println(tienda);
        tienda.deleteArticulo(articulo2);
        System.out.println(tienda);
    }
}
