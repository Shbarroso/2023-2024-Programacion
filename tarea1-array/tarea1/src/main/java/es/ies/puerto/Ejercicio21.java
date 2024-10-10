package es.ies.puerto;
/**
 * Dado el nombre "Thor Odinson", crea un programa que 
 * imprima solo el apellido usando substring() y indexOf().
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        String nombre = "Thor Odison";
        int index = nombre.indexOf("Odison");
        String apellido = nombre.substring(index, 11);
        System.out.println(apellido);
    }
}