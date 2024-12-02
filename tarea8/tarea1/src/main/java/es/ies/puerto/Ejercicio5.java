package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> lista = generarLista(20);
        System.out.println( lista);
        System.out.println("Tamaño lista: "+lista.size());
        lista.removeIf(numero -> numero%3 == 0);
        System.out.println(lista);
    }
    static List<Integer> generarLista(int cantidad){
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < cantidad; i++){
            lista.add(i+1);
        }
        return lista;
    }
}