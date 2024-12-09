package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio13 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(sumarElementos(enteros));
    }

    static int sumarElementos(List<Integer> lista){
        int suma = 0;
        for (Integer numero:lista) {
            suma += numero;
        }
        return suma;
    }
}