package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio17 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(eliminarDuplicados(enteros));
    }
    static List<Integer> eliminarDuplicados(List<Integer> lista){
        List<Integer> lista1 = new ArrayList<>();
        for (Integer elemento : lista) {
            if (!lista1.contains(elemento)) {
                lista1.add(elemento);
            }
        }
        return lista1;
    }
}