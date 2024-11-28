package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio21 {
public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();
    nombres.add("Alejanro");
    nombres.add("Samuel");
    nombres.add("Eduardo");
    nombres.add("Hector");

    nombres.clear();
    System.out.println(nombres);
    }
}