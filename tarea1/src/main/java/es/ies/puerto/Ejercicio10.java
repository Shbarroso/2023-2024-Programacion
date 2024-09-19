package es.ies.puerto;

import java.util.Scanner;

/**
 * Crea una variable de tipo byte para almacenar un número del 0 al 127. 
 * Asigna un valor y muéstralo por pantalla.
 * @author Shbarroso
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor");
        byte numero;
        numero = sc.nextByte();
        System.out.println("El valor es: "+ numero);
        sc.close();
    }
}