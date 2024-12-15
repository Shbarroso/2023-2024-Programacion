package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio5 {
    static List<Integer> reverseListInput = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

    public static void main(String[] args) {
        System.out.println("Lista de numeros: "+reverseListInput);
        System.out.print("Salida: "+reverseList(reverseListInput));
    }

    public static List<Integer> reverseList(List<Integer> list) {
        if (list == null || list.isEmpty()){
            return list;
        }
        Collections.reverse(list);
        return list;
    }
}
