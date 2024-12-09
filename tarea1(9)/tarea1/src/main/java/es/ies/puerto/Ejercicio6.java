package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio6 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(4, 1, 3, 2));
    public static void main(String[] args) {
        System.out.println(ordenarLista(enteros));
    }

    static List<Integer> ordenarLista(List<Integer> lista){
        Collections.sort(lista);
        return lista;
    }
}