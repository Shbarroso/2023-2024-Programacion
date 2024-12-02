package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio1 {
    public static void crearLista(List<Integer> list) {
       if (list.isEmpty()){
           for (int i = 1; i <= 10; i++){
               list.add(i);
           }
       }
    }
    public static void eliminarLista(List<Integer> list){
        list.removeIf(numero -> numero < 5);
    }
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        crearLista(lista1);
        System.out.println(lista1);
        eliminarLista(lista1);
        System.out.println(lista1);
    }
}