package es.ies.puerto;

import java.util.Scanner;
import java.util.Vector;
/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio1 {
    static Vector<String> vector = new Vector<>();

    public static void main(String[] args) {
        System.out.println(crear(vector));
    }

    static Vector crear(Vector<String> vector) {
        vector = new Vector<>(10);
        vector.add("Manzana");
        vector.add("Banana");
        vector.add("Cereza");
        vector.add("Mango");
        vector.add("Uva");
        System.out.println(vector.capacity());
        return vector;
    }
}