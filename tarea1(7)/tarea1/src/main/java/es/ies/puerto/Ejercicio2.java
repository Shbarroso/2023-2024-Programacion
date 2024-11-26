package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: get
 *
 * Usa el ArrayList creado en el ejercicio 1.
 * Obtén el tercer elemento de la lista utilizando el método get.
 * Imprime el elemento obtenido.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        
        System.out.println(abecedario.get(3));
    }
}