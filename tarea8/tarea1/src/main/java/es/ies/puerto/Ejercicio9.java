package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        agregar(lista1, 4);
        agregar(lista2, 4);
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println("¿Son iguales las lista1 y 2?"+ lista1.equals(lista2));
        eliminar(lista2);
        System.out.println(lista1);
        System.out.println(lista2);

    }

    public static boolean agregar(List<Integer> list, int cantidad){
        if (list == null) {
            return false;
        }
        return list.add(cantidad);
    }

    public static List<Integer> eliminar (List<Integer> list) {
        if (list != null) {
            list.removeIf(numero -> numero % 2 == 0);
        }
        return list;
    }
}