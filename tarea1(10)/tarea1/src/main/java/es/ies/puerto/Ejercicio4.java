package es.ies.puerto;

import java.util.Arrays;
import java.util.Vector;
/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio4 {
    Vector<Integer> enteros = new Vector<>();
    public static void main(String[] args) {
        
    }
/**
 * Metodo para copiar elementos pares
 * @param enteros
 * @return
 */
    static Vector copiarElementosPares(Vector<Integer> enteros){
        enteros = new Vector<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Vector<Integer> pares = new Vector<>(enteros);
        return null;
    }
}