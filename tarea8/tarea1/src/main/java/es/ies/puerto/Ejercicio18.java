package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio18 {
static List<String> nombres = new ArrayList<>(Arrays.asList(
    "Lues", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
));
static List<String> nombres2 = new ArrayList<>(Arrays.asList(
    "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
));

public static void main(String[] args) {
    List<String> solucion = nombres;
    solucion.removeAll(nombres2);
    System.out.println(nombres);
    }
}