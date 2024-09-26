package es.ies.puerto;

import java.util.Scanner;

/**
 * Goku está en una batalla. Si su nivel de poder es de de 9000, 
 * está en "Modo Super Saiyan". Si no, está en "Modo normal".
 * Escribe un programa que reciba el nivel de poder de Goku y determine en qué modo está
 * @author Shbarroso
 */

public class Ejercicio5 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce el nivel de poder de Goku: ");
        int numero = scanner.nextInt();

        if (numero >= 9000) {
            System.out.println("Goku esta en modo super saiyan");
        } else{
            System.out.println("Goku esta en modo normal");
        }
        scanner.close();
    }

}
