package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(contarMayores(enteros, 25));
    }
    static int contarMayores(List<Integer> lista, int limite){
        int contador = 0;

        for (int numero : lista) {
            if (numero > limite) {
                contador++;
            }
        }
        return contador;
    }
}