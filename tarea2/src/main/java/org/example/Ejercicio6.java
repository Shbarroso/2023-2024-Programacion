package org.example;

import java.util.Scanner;

/** Escribe un programa que reciba un número entero y determine si es par o impar.
 * @author Shbarroso
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
        scanner.close();

    }
}
