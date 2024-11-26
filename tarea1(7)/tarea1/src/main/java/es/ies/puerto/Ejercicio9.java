package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Métodos a utilizar: Collections.sort
 * 
 * Ordena el ArrayList en orden alfabético utilizando el método Collections.sort.
 * Imprime la lista ordenada.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));
        abecedario.add("N");
        abecedario.add("M");

        Collections.sort(abecedario);

        for(String abe : abecedario) {
            System.out.println(abe);
        }
    }
}