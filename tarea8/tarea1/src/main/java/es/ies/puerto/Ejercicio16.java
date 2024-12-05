package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio16 {
public static void main(String[] args) {
    List<Integer> lista1 = crearLista(20);
    List<Integer> lista2 = crearLista(25);
    System.out.println(lista1);
    System.out.println(lista2);
    List<Integer> numerosComunes = numerosComunes(lista1, lista2);
    System.out.println(numerosComunes);
    List<Integer> numerosUnicos = numerosUnicos(lista1, lista2);
    System.out.println(numerosUnicos);
    }
    public static List<Integer> crearLista(int cantidad) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            lista.add(i);
        }
        return lista;
    }

    public static List<Integer> numerosComunes(List<Integer> lista1, List<Integer> lista2){
        List<Integer> numerosComunes = new ArrayList<>(lista1);
        numerosComunes.retainAll(lista2);
        return numerosComunes;
    }
    public static List<Integer> numerosUnicos(List<Integer> lista1, List<Integer> lista2){
        List<Integer> numerosUnicos = new ArrayList<>(lista1);
        numerosUnicos.addAll(lista2);
        List<Integer> comunes = numerosComunes(lista1, lista2);
        numerosUnicos.removeAll(comunes);
        return numerosUnicos;
    }
}
