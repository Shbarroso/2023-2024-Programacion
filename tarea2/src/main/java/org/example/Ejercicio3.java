package org.example;

import java.util.Scanner;

/** Escribe un programa que convierta una temperatura
 * en grados Celsius a Fahrenheit.
 * @author Shbarroso
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradoC;
        double gradoF;
        System.out.print("Introduce los gradosC:");
        gradoC = sc.nextDouble();
        gradoF = (gradoC * 9/5) +32;
        System.out.println("Los grados Celsius a Fahrenheit es: "+gradoF);
        sc.close();

    }
}
