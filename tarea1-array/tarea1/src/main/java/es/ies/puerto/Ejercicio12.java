package es.ies.puerto;
/**
 * Dada la transformación Saiyan en nivel 9000, convierte
 * este número a hexadecimal y binario usando métodos de Integer.
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        int nivel = 9000;
        String hexadecimal = Integer.toHexString(nivel);
        String binario = Integer.toBinaryString(nivel);

        System.out.print("Hexadecimal: "+hexadecimal);
        System.out.println();
        System.out.print("Binario: "+binario);
    }
}