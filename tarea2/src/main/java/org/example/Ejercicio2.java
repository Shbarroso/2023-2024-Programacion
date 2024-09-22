package org.example;

import java.util.Scanner;

/** Crea un programa que pida al usuario la radio
 * de un círculo y calcula su área.
 * @author Shbarroso
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del circulo: ");

        double radio = scanner.nextDouble();
        double area = Math.PI * ((radio) * 2);

        System.out.println("La area del circulo es: "+area);
        scanner.close();
    }
}
