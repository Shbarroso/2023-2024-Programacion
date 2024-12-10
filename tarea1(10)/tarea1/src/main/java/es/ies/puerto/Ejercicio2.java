package es.ies.puerto;

import java.util.Vector;
/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio2 {
    static Vector<Integer> enteros = new Vector<>();
    public static void main(String[] args) {
        System.out.println(obtenerModificar(enteros));
    }
/**
 * Metodo para obtener y modificar elementos
 * @param enteros
 * @return
 */
    static Vector obtenerModificar(Vector<Integer> enteros) {
        enteros = new Vector<>(10);
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        System.out.println("Antes: "+enteros.get(2));
        enteros.set(2, 10);
        return enteros;
    }
}