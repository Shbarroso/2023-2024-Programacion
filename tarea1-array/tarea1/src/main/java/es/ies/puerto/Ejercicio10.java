package es.ies.puerto;
/**
 * Dada una lista de personajes en una batalla (separados por comas),
 * imprime cuántos personajes hay en la batalla usando split().
 * @author Shbrroso
 * @version 1.0.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String entrada = "Goku, Vegeta, Broly, Freezer";
        String[] personajes = entrada.split(",");

        int cantidadPersonajes = personajes.length;
        System.out.println(cantidadPersonajes);
    }
}