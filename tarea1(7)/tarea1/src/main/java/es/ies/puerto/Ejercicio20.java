package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio20 {
public static void main(String[] args) {
    List<String> nombres = new ArrayList<>(Arrays.asList(
            "Alejanro", "Barbaroja", "Comandante", "Daniel", "Elefante", "Fabi", "Gogo"
    ));
    nombres.add("Samuel");
    nombres.add("Ariadna");
    nombres.add("Nira");
    System.out.println(nombres);
    }
}