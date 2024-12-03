package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(6,7,5,9,10));
        System.out.println(lista1);
        System.out.println(lista2);
        List<Integer> lista3 = union(lista1,lista2);
        System.out.println(lista3);
    }

    public static List<Integer> union(List<Integer> lista1, List<Integer> lista2){
        List<Integer> union = new ArrayList<>(lista1);
        union.addAll(lista2);

        List<Integer> elementos = new ArrayList<>(lista1);
        elementos.retainAll(lista2);

        union.removeAll(elementos);
        return union;
    }
}