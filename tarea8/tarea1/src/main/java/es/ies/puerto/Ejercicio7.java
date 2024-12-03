package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("m");
        palabras.add("h");
        palabras.add("h");
        palabras.add("s");
        palabras.add("m");
        palabras.add("d");
        System.out.println(palabras);
        List<String> sinDuplicados = eliminarDuplicados(palabras);

        System.out.println(sinDuplicados);
    }

    public static List<String> eliminarDuplicados(List<String> lista) {
        List<String> eliminar = new ArrayList<>();
        for (String elemento : lista) {
            if (!eliminar.contains(elemento)) {
                eliminar.add(elemento);
            }
        }
        return eliminar;
    }

}