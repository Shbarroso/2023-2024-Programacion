package org.example;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números enteros al usuario
 * y determine cuál de ellos es mayor, o si son iguales.
 * @author Shbarroso
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("Es mayor");
        } else if (numero1 == numero2) {
            System.out.println("Son iguales");
        }else {
            System.out.println("Es menor");
        }
        scanner.close();
    }
}
