package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: remove
 *
 * Elimina el cuarto elemento del ArrayList utilizando el método remove.
 * Imprime la lista para confirmar que el elemento fue eliminado correctamente.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        abecedario.remove(3);
        System.out.println(abecedario);
    }
}