package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio13 {
public static void main(String[] args) {
    List<Integer>lista1 = crearLista(30);
    System.out.println(lista1);
    List<Integer> pares = new ArrayList<>();
    List<Integer> impares = new ArrayList<>();
    separarParesImpares(lista1, pares, impares);
    lista1.addAll(impares);
    lista1.addAll(pares);
    System.out.println(lista1);
    }
    public static List<Integer> crearLista(int cantidad) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            lista.add(i);
        }
        return lista;
    }
    public static void separarParesImpares(List<Integer> lista, List<Integer> pares, List<Integer> impares) {
        for (Integer numeros : lista) {
            if (numeros % 2 == 0) {
                pares.add(numeros);
            }else{
                impares.add(numeros);
            }
        }

    }
}