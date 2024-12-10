package es.ies.puerto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio5 {
    static Vector<Integer> enteros= new Vector<>();
    public static void main(String[] args) {
        System.out.println(ordenarElementos(enteros));
    }
/**
 * Metodo para ordeanr elementos.
 * @param enteros
 * @return
 */
    static Vector ordenarElementos(Vector<Integer> enteros){
        enteros = new Vector<>(Arrays.asList(10, 5, 8, 3, 2, 9, 1, 6, 4, 7));
        Collections.sort(enteros);
        return enteros;
    }
}