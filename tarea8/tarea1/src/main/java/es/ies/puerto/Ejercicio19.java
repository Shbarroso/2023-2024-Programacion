package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio19 {
public static void main(String[] args) {
   List<Integer> lista1 = crearLista(10);
   System.out.println("Lista original: " + lista1.size());
   rotar(lista1, 5);
   System.out.println("Lista rotada: "+lista1);
   
}
     public static List<Integer> crearLista(int cantidad) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            lista.add(i);
        }
        return lista;
    }
    public static void rotar(List<Integer> lista, int x){
        int size = lista.size();
        if (size == 0) return;
        x = x % size;
        List<Integer> sublista = lista.subList(0, x);
        lista.addAll(sublista);
    }
}