package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: toArray
 *
 * Convierte el ArrayList a un array utilizando el método toArray.
 * Imprime los elementos del array utilizando un bucle for.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
         List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        abecedario.toArray();
        for (String abe : abecedario) {
            System.out.println(abe);
        }
    }
}