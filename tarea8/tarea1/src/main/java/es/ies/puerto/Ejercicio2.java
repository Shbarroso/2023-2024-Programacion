package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Manzana", "Banana", "Cereza"));

        String[] nuevosElementos = {"Durazno", "Banana", "Uva", "Manzana", "Kiwi"};

        for (String nuevo : nuevosElementos) {
            if (!list1.contains(nuevo)) {
                list1.add(nuevo);
            }
        }
        System.out.println("Lista antes de ordenar: " + list1);
        ordenar(list1);
        System.out.println("Lista después de ordenar: " + list1);
    }
    public static void ordenar(List<String> list){
        if (list!=null) {
            Collections.sort(list);
        }
    }
}