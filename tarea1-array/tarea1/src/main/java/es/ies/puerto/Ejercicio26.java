package es.ies.puerto;
/**
 * Compara el poder de pelea de Goku (9000) con el de
 * Vegeta (8500) usando el método Integer.compare().
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        int poderGoku = 9000;
        int poderVegeta = 8500;
        int comparar = Integer.compare(poderGoku,poderVegeta);
        System.out.println(comparar);
    }
}