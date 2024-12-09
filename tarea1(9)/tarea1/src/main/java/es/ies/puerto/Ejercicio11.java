package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio11 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
    public static void main(String[] args) {
        System.out.println(enteros);
        System.out.println(copiarLista(enteros));
    }

    static List<Integer> copiarLista(List<Integer> lista){
        return new ArrayList<>(lista);
    }
}