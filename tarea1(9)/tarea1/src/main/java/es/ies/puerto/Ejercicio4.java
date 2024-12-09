package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 3));
    public static void main(String[] args) {
        System.out.println(eliminarElemento(enteros, 2));
        System.out.println(enteros);
    }
    static boolean eliminarElemento(List<Integer> lista, int valor){
        if (lista == null || lista.isEmpty()) {
            return false;
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == valor) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }
}