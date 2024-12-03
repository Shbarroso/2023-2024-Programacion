package es.ies.puerto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Daniel");
        nombres.add("Samuel");
        nombres.add("Daniel");
        nombres.add("Nadja");
        System.out.println(nombres);
        cambiar(nombres);
        System.out.println(nombres);
    }

    public static List<String> cambiar(List<String> palabras){
        for (int i = 0; i < palabras.size(); i++) {
            if (palabras.get(i).length() > 5) {
                palabras.set(i, "GENÉRICO");
            }
        }
        return palabras;
    }
}