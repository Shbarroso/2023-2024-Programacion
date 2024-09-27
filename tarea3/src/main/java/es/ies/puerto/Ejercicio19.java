package es.ies.puerto;

import java.util.Scanner;

/**
 * Si tienes más de 500 minerales y más de 300 gas, puedes construir un coloso. Si no tiene suficientes recursos, se construyes un marine.
 * Crea un programa que determina qué unidad puede construir en StarCraft según los recursos.
 * @author Shbarroso
 */
public class Ejercicio19 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce los minerales: ");
        int minerales = scanner.nextInt();

        System.out.print("Introduce los gas: ");
        int gas = scanner.nextInt();

        if (minerales > 500 && gas > 300) {
            System.out.println("Pedes contruir un coloso.");
        } else{
            System.out.println("Se contruye un marine");
        }
        scanner.close();
    }
}
