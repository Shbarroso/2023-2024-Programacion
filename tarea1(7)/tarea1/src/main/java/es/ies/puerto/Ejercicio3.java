package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: set
 *
 * Cambia el segundo elemento del ArrayList por otro nombre utilizando el método set.
 * Imprime la lista completa para verificar el cambio.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        abecedario.set(1, "L");
        System.out.println(abecedario);
    }
}