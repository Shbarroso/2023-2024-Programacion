package es.ies.puerto;

import java.util.*;

public class Ejercicio20 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(barajarLista(enteros));
    }

    static List<Integer> barajarLista(List<Integer> lista){
        Collections.shuffle(lista);
        return lista;
    }
}