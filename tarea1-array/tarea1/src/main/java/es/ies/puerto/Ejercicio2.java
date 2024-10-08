package es.ies.puerto;
/**
 * Dado un nombre de mago como entrada, crea un programa que imprima un 
 * saludo personalizado en formato: "¡Bienvenido, [nombre del mago], a Hogwarts!"
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre = "Harry";
        String saludo = "¡Bienvenido, "+nombre+", a Hogwarts!";

        System.out.println(saludo);
    }
}