package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio15 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(rotarLista(enteros, 2));
    }

    static List<Integer> rotarLista(List<Integer> lista, int posiciones){
        if (lista == null || lista.isEmpty()) {
            return lista;
        }
        if (posiciones < 1) {
            return lista;
        }
        List<Integer> lista1 = lista.subList(0, posiciones);
        List<Integer> lista2 = lista.subList(posiciones, lista.size());
        lista2.addAll(lista1);
        return lista2;
    }
}