package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: size, get
 *
 * Usa un bucle for para recorrer el ArrayList.
 * Imprime cada elemento en una línea diferente accediendo a ellos con el método get.
 * Realiza el mismo ejercicio utilizando el método toString de listacreada, y compara las diferencias.

 * @authorShbarroso
 * @version 1.0.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> abecedario = new ArrayList<>(Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G"
        ));

        for(int i = 0; i < abecedario.size(); i++) {
            System.out.println(abecedario.get(i));
        }
        System.out.println(abecedario.toString());
    }
}