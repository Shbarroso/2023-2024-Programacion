package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @authorShbarroso
 * @version 1.0.0
 */

public class Ejercicio16 {
public static void main(String[] args) {
    List<String> nombres = new ArrayList<>(Arrays.asList(
        "Alejanro", "Barbaroja", "Comandante", "Daniel", "Elefante", "Fabi", "Gogo"
        ));
        System.out.println("¿Esta vacia la Lista?"+nombres.isEmpty());
    }
}