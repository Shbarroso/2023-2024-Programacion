package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio8 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(4, 1, 3, 2));
    public static void main(String[] args) {
        System.out.println(invertirLista(enteros));
    }

    static List<Integer> invertirLista(List<Integer> lista){
        Collections.reverse(lista);
        return lista;
    }
}