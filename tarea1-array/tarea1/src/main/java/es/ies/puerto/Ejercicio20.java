package es.ies.puerto;
/**
 * Dada la frase "Que la fuerza te acompañe", 
 * crea un programa que convierta todas las 
 * letras en mayúsculas.
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio20 {
    public static void main(String[] args) {
        String frase = "Que la fuerza te acompñe";
        String mayuscula = frase.toUpperCase();
        System.out.println(mayuscula);
    }
}