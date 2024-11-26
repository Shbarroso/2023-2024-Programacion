package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: add
 *
 * Crea un ArrayList<String> vacío.
 * Añade cinco nombres al ArrayList usando el método add.
 * Imprime la lista completa para verificar los elementos añadidos.
 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio1 {
public static void main(String[] args) {
    List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        abecedario.add("H");
        abecedario.add("I");
        abecedario.add("J");
        System.out.println(abecedario);
    }
}