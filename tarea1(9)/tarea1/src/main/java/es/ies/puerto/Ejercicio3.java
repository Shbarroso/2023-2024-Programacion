package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 3));
    public static void main(String[] args) {
        System.out.println(duplicarElementos(enteros));
    }

    static List<Integer> duplicarElementos(List<Integer> lista){
        List<Integer> dupilicado = new ArrayList<>();
        if (lista == null || lista.isEmpty()) {
            return lista;
        }
        /**
         * Opcion 1
         */
        for (Integer numero : lista) {
            dupilicado.add(numero*2);
        }
        /**
         * Opcion 2
         */
        for (int i = 0; i< lista.size(); i++){
            lista.set(i, lista.get(i)*2);
        }
        return dupilicado;
    }
}