package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio14 {
public static void main(String[] args) {
    List<Integer> lista1 = crearLista(30);
    System.out.println(lista1);
    subListar(lista1, 5, 10);
    System.out.println(lista1);
    }
    public static List<Integer> crearLista(int cantidad) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            lista.add(i);
        }
        return lista;
    }


    public static void subListar(List<Integer> lista, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (lista.get(i) % 3 != 0) {
                lista.set(i, 0);
            }
        }
    }
}