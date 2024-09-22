package org.example;

import java.util.Scanner;

/** Crea un programa que solicita al usuario dos números enteros.
 * El programa debe sumar y reiniciar ambos números, y mostrar los resultados.
 * @author Shbarroso
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();

        int suma;
        suma = numero1 + numero2;

        System.out.println("El resultado de la suma es: "+suma);
        scanner.close();
    }
}
