package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Métodos a utilizar: Collections.reverse
 *
 * Invierte el orden de los elementos del ArrayList utilizando el método Collections.reverse.
 * Imprime la lista invertida.

 * @authorShbarroso
 * @version 1.0.0
 */

public class Ejercicio11 {
public static void main(String[] args) {
    List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));

        Collections.reverse(abecedario);
        for (String abe : abecedario) {
            System.out.println(abe);
        }
    }
}