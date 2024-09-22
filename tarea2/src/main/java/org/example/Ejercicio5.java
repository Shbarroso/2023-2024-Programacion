package org.example;

import java.util.Scanner;

/** Escribe un programa que pida al usuario tres
 * números de tipo floaty calcule el promedio de los tres.
 * @author Shbarroso
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        float numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo numero: ");
        float numero2 = scanner.nextInt();
        System.out.print("Introduce el tercer numero: ");
        float numero3 = scanner.nextInt();

        float promedio = (numero1 + numero2 +numero3)/3;
        System.out.println("El promedio de "+numero1+ ", " +numero2+
                " y "+numero3+ " es: " +promedio);
        scanner.close();
    }
}
