package es.ies.puerto;

import java.util.ArrayList;

/**
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio24 {
public static void main(String[] args) {
    ArrayList<String> nombre1 = new ArrayList<>();
    nombre1.add("Manuel");
    nombre1.add("Ken Kaneky");
    nombre1.add("Glotona");

    ArrayList<String> nombre2 = new ArrayList<>();
    nombre2.add("Ayato");
    nombre2.add("Glotona");
    nombre2.add("Yashiro");

    nombre1.retainAll(nombre2);
    System.out.println(nombre1);
    System.out.println(nombre2);
    }
}