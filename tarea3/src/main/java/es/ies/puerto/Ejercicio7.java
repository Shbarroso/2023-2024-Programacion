package es.ies.puerto;

import java.util.Scanner;

/**
 * Frodo viaja estándoando a Mordor. Si la distancia es alrededor de 1.000 kilómetros, descansar. Si es menor, continuar.
 * Escribe un programa que le podi la distancia a Mordor y diga si Frodo necesita descansar o no.
 * @author Shbarroso
 */

public class Ejercicio7 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce la distancia caminada a Mordor: ");
        float distancia = scanner.nextFloat();

        if (distancia >= 1000) {
            System.out.println("Frodo puede descansar");
        }else {
            System.out.println("Frodo sigue caminando");
        }
        scanner.close();
    }

}
