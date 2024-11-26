package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @authorShbarroso
 * @version 1.0.0
 */

public class Ejercicio17 {
public static void main(String[] args) {
    List<String> nombres = new ArrayList<>(Arrays.asList(
        "Alejanro", "Barbaroja", "Comandante", "Daniel", "Elefante", "Fabi", "Gogo"
        ));
        nombres.replaceAll(nombre -> "Sin Nombre");
        System.out.println(nombres);
    }
}