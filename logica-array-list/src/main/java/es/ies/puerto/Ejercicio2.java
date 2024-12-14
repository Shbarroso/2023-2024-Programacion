package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    static List<Integer> evenList = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

    public static void main(String[] args) {
        boolean lista1 = allEven(evenList);
        System.out.println("¿Todos los numeros en la lista son pares?"+ lista1);
    }

    public static boolean allEven(List<Integer> list) {
        if (list == null || list.isEmpty()){
            return  false;
        }
        for(Integer numero: list){
            if (numero % 2 != 0){
                return false;
            }
        }
        return true;
    }
}