package es.ies.puerto;

import javax.print.DocFlavor.STRING;

/**
 * Dado el nombre de un Pokémon (como "Pikachu"), crea un programa que 
 * convierta el nombre en mayúsculas, minúsculas, y que también imprima 
 * la longitud del nombre.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String nommbre = "Pikachu";
        int tamanio = nommbre.length();
        String minuscula = nommbre.toLowerCase();
        String mayuscula = nommbre.toUpperCase();
        System.out.println(tamanio);
        System.out.println(minuscula);
        System.out.println(mayuscula);
    }
}