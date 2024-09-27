package es.ies.puerto;

import java.util.Scanner;

/**
 * Link encuentra tres objetos en una mazmorra: una llave, una bomba y un arco.
 * Si tiene la llave, puede abrir la puerta. Si tiene la bomba, puede destruir la puerta.
 * Si tiene el arco, puede atacar a los enemigos desde lejos.
 * Escribe un programa que determine qué puede hacer Link según el objeto que tenga.
 * @author Shbarroso
 */
public class Ejercicio15 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce el objeto que tiene Link: ");
        String objeto = scanner.nextLine();

        switch (objeto) {
            case "llave":
                System.out.println("Puedes abrir la puerta.");
                break;
            case "bomba":
                System.out.println("Puedes destruir la puerta.");
                break;
            case "arco":
                System.out.println("Puedes atacar a los enemigos desde lejos.");
                break;
            default:
                System.out.println("Objeto inadecuado");
                break;
        }
        scanner.close();
    }
}
