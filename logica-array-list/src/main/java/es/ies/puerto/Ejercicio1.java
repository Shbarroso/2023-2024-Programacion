package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio1 {
    static List<Integer> replaceList = new ArrayList<>(Arrays.asList(10, 5, 7, 3, 8));
    static int newValue = 20;

    public static void main(String[] args) {
        List<Integer> lista1 = replaceMinimum(replaceList, newValue);
        System.out.println(lista1);
    }
    public static List<Integer> replaceMinimum(List<Integer> list, int newValue) {
        if (list == null || list.isEmpty()){
            return list;
        }

        int condicion = 0;
        for (int i = 1; i< list.size(); i++){
                if (list.get(i) < list.get(condicion)){
                    condicion = i;
                }
        }
        list.set(condicion, newValue);
        return list;
    }
}