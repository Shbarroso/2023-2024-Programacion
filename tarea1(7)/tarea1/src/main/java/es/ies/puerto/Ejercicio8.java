package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: forEach
 *
 * Usa el método forEach para recorrer y mostrar todos los elementos del ArrayList.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        abecedario.forEach( (i) -> {System.out.println(i);});
    }
}