package es.ies.puerto;

import java.util.Scanner;

/**
 * Si la velocidad de la Millennium Falcon es mayor de 1000, se activan los motores
 * hiperespaciales. Si es mayor de 500 pero menor o igual a 1000, la nave está a máxima
 * velocidad. Si es menor o igual a 500, la nave está en velocidad normal.
 * Escribe un programa que reciba la velocidad de la Millennium Falcon y determine el
 * estado de los motores.
 * @author Shbarroso
 */
public class Ejercicio11 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introcuce la velocidad: ");
        int velocidad = scanner.nextInt();

        if (velocidad > 500 && velocidad <= 1000) {
            System.out.println("La nave esta a maxima velocidad.");
        } else if (velocidad > 1000) {
            System.out.println("Se activan los motores hiprespaciales.");
        } else if (velocidad <= 500) {
            System.out.println("La nave esta a velocidad normal.");
        }
        scanner.close();
    }
}
