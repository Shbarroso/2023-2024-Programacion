package org.example;

import java.util.Scanner;

/** Crea un programa que solicita al usuario dos números enteros.
 * El programa debe sumar y restar ambos números, y mostrar los resultados.
 * @author Shbarroso
 */
public class Ejercicio4 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int suma;
        int resta;

        System.out.println("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;

        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        scanner.close();
    }
}
