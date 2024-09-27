package es.ies.puerto;

import java.util.Scanner;

/**
 *  Si la energía del traje de Iron Man es mayor al 70%, puede volar. Si es mayor al 30%
 *  pero menor o igual al 70%, puede caminar. Si es menor o igual al 30%, está en modo crítico.
 * Crea un programa que determine el estado de Iron Man según su nivel de energía.
 * @author Shbarroso
 */
public class Ejercicio13 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce la energia del traje: ");
        int energia = scanner.nextInt();

        if (energia > 30 && energia <= 70){
            System.out.println("Iron Man puede caminar.");
        } else if (energia > 70) {
            System.out.println("Iron Man puede volar.");
        } else if (energia <= 30) {
            System.out.println("El traje esta en modo critico");
        }
        scanner.close();
    }
}
