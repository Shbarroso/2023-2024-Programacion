package org.example;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario su peso (en kg) y su altura
 * (en metros), y luego calcule su Índice de Masa Corporal (IMC).
 * @author Shbarroso
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu peso: ");
        float peso = scanner.nextFloat();

        System.out.print("Introduce tu altura: ");
        float altura = scanner.nextFloat();

        double imc = peso / (altura * altura);
        System.out.println("Tu indice de IMC es: "+imc);
        scanner.close();
    }
}
