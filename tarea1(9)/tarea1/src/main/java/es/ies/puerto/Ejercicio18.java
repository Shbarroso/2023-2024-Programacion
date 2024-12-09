package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio18 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
    static List<Integer> enteros2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(interseccionListas(enteros, enteros2));
    }

    static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2){
        List<Integer> interseccion = new ArrayList<>();
        for (Integer elemento : lista1) {
            if (lista2.contains(elemento) && !interseccion.contains(elemento)) {
                interseccion.add(elemento);
            }
        }
        return interseccion;
    }
}