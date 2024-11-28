package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio23 {
public static void main(String[] args) {
    List<String> nombres = new ArrayList<>(Arrays.asList(
            "Nira", "Eduardo", "Hector", "Daniel", "Marcos", "Fran", "Samuel"
    ));

    System.out.println(nombres.hashCode());
    }
}