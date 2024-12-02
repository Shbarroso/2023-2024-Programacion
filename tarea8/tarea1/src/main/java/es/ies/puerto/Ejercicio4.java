package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numero = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    List<Integer> numero2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
    numero.addAll(numero2);

    }
}