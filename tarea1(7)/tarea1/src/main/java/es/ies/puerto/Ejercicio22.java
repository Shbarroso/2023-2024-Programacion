package es.ies.puerto;

import java.util.ArrayList;

/**
 * @authorShbarroso
 * @version 1.0.0
 */

public class Ejercicio22 {
public static void main(String[] args) {
    ArrayList<String> nombre1 = new ArrayList<>();
    nombre1.add("Samuel");
    nombre1.add("Eduardo");
    nombre1.add("Daniel");

    ArrayList<String> nombre2 = new ArrayList<>();
    nombre2.add("Samuel");
    nombre2.add("Eduardo");
    nombre2.add("Daniel");

    System.out.println("¿Son iguales las listas nombre1 y nombre2?"
            +nombre1.equals(nombre2));
    }
}