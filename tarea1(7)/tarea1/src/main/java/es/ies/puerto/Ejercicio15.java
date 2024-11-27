package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: clone
 *
 * Crea una copia exacta del ArrayList utilizando el método clone.
 * Imprime la lista clonada.

 * @authorShbarroso
 * @version 1.0.0
 */

public class Ejercicio15 {
public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<String>();
    nombres.add("samuel");
    nombres.add("Nadja");
    nombres.add("Ariadna");
    ArrayList nombres2 = (ArrayList) nombres.clone();
    System.out.println(nombres2);

        
    }
}