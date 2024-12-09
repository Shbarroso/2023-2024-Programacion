package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio16 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(intercambiar(enteros, 0, 2));
    }

    static List<Integer> intercambiar(List<Integer> lista, int indice1, int indice2){
        Integer temp = lista.get(indice1);
        lista.set(indice1, lista.get(indice2));
        lista.set(indice2, temp);

        return lista;
    }
}