package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio1 {
public static void main(String[] args) {
    System.out.println(crearListaConsecutiva(3, 5));
    }

    static List<Integer> crearListaConsecutiva(int inicio, int cantidad){
        List<Integer> lista= new ArrayList<>();

        for(int i = 0; i < cantidad; i++){
            lista.add(i + inicio);
        }
        return lista;
    }
}