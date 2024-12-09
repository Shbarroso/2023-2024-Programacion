package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio9 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(eliminarSi(enteros, 25));
    }

    static List<Integer> eliminarSi(List<Integer> lista, int limite){
        lista.removeIf(num -> num > limite);
        return lista;
    }
}