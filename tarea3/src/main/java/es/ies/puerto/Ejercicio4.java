package es.ies.puerto;

import java.util.Scanner;

/**
 * Si eres un Sith o un Jedi, puedes usar la Fuerza. Si no, eres un simple mortal.
 * Crea un programa que pregunte al usuario si es Sith o Jedi y le diga si puede usar la Fuerza o no.
 * @author Shbarroso
 */

public class Ejercicio4 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce tu clase: ");

        String clase = scanner.nextLine();
        clase = clase.toLowerCase();

        String nombre1 = "sith";
        String nombre2 = "jedi";

        if (clase.equals(nombre1) || clase.equals(nombre2)) {
            System.out.println("Puedes usar la fuerza");
        }else {
            System.out.println("No puedes usar la fuerza");
        }

    }
}
