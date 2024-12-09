package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(encontrarDuplicados(enteros));
    }
    static List<Integer> encontrarDuplicados(List<Integer> lista) {
        List<Integer> lista1 = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            int numero = lista.get(i);
            if (!lista1.contains(numero)) {
                for (int j = i + 1; j < lista.size(); j++) {
                    if (numero == lista.get(j)) {
                        lista1.add(numero);
                        break;
                    }
                }
            }
        }
        return lista1;
    }
}