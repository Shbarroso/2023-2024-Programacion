package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: removeIf
 *
 * Usa el método removeIf para eliminar todos los nombres del ArrayList que tengan más de 5 caracteres.
 * Imprime la lista resultante.

 * @authorShbarroso
 * @version 1.0.0
 */

public class Ejercicio13 {
public static void main(String[] args) {
     List<String> abecedario = new ArrayList<>(Arrays.asList(
        "Alejanro", "Barbaroja", "Comandante", "Daniel", "Elefante", "Fabi", "Gogo"
        ));
        abecedario.removeIf((i) -> i.length() > 5 );
        System.out.println(abecedario);
    }
}