package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        List<Integer> numbers = generarNumero(20, 90, 110);
        System.out.println("Lista original: " + numbers);

        eliminarNumero(numbers);

        if (!numbers.isEmpty()) {
            System.out.println("Lista después de eliminar números inválidos: " + numbers);
        } else {
            System.out.println("La lista está vacía después de eliminar números inválidos.");
        }
    }

    public static List<Integer> generarNumero(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {

            int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
            list.add(randomNumber);
        }
        return list;
    }

    public static void eliminarNumero(List<Integer> list) {
        list.removeIf(number -> number < 0 || number > 100);
    }
}