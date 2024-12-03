package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio11 {
public static void main(String[] args) {
    List<Integer> lista1 = crearLista(30);
    System.out.println(lista1);
    List<List<Integer>> sublistas = dividirSublistas(lista1, 5);
        System.out.println("Sublistas:");
        for (List<Integer> sublista : sublistas) {
            System.out.println(sublista);
        }
    }
    public static List<Integer> crearLista(int cantidad) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            lista.add(i);
        }
        return lista;
    }

    public static List<List<Integer>> dividirSublistas(List<Integer> lista, int tamanio) {
        List<List<Integer>> sublista = new ArrayList<>();
        for (int i = 0; i < lista.size(); i += tamanio) {
            sublista.add(lista.subList(i, Math.min(i + tamanio, lista.size())));

        }
        return sublista;
    }
}