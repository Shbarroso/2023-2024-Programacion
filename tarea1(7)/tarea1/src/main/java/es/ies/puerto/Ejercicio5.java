package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: contains
 *
 * Verifica si el nombre "Ana" está presente en el ArrayList.
 * Imprime un mensaje indicando si el elemento está o no en la lista.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> abecedario = new ArrayList<>(Arrays.asList(
        "Ana", "B", "C", "D", "E", "F", "G"
        ));
        
        System.out.println("¿Esta el nombre Ana en el ArrayList?"+abecedario.contains("Ana"));
    }
}