package es.ies.puerto;
/**
 * Dada una dirección de Gotham como "Wayne Tower, Gotham City",
 * usa el método split() para separar la torre del nombre de la ciudad.
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        String direccion = "Wayne Tower, Gotham City";
        String[] separar = direccion.split(", ");
        for (String coma : separar){
            System.out.println(coma);
        }
    }
}