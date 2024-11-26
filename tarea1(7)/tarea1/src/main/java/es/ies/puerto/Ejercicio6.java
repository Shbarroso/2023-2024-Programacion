package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: size
 *
 * Usa el método size para mostrar el número total de elementos en el ArrayList.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        System.out.println(abecedario.size());
    }
}