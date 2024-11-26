package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: indexOf
 *
 * Busca el índice de un elemento específico en el ArrayList utilizando el método indexOf.
 * Imprime el elemento encontrado.

 * @authorShbarroso
 * @version 1.0.0
 */

public class Ejercicio12 {
public static void main(String[] args) {
     List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        System.out.println(abecedario.indexOf("C"));
    }
}