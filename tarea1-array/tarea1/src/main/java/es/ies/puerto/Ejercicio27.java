package es.ies.puerto;
/**
 * Dado el conteo de Midiclorianos de un Jedi, como 12500,
 * convierte este número a hexadecimal y binario usando
 * métodos de Integer.
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio27 {
    public static void main(String[] args) {
        int miclorianosJedi= 12500;
        String hexadecimal = Integer.toHexString(miclorianosJedi);
        String binario = Integer.toBinaryString(miclorianosJedi);
        System.out.println("Hexadecimal: "+hexadecimal);
        System.out.println("Binario: "+binario);
    }
}