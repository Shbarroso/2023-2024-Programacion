package org.example;

import java.util.Scanner;

/**
 * Crea un programa que convierta una distancia en millas a kilómetros.
 * @author Shbarroso
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las milla: ");
        int milla = scanner.nextInt();

        final double km = 1.60934d;

        double conertidor = milla * km;
        System.out.println(milla+ " millas convertidas a km son: "+conertidor+"km");
        scanner.close();

    }
}
