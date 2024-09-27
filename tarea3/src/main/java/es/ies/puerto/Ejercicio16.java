package es.ies.puerto;

import java.util.Scanner;

/**
 * Si tienes un arma de fuego y munición, puedes luchar contra los zombies.
 * Si tienes un arma cuerpo a cuerpo, puedes defenderte. Si no tienes armas, debes huir.
 * Escribe un programa que determine qué hacer según el tipo de arma y si tienes munición.
 * @author Shbarroso
 */
public class Ejercicio16 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce un arma (fuego, cuerpo a cuerpo, ninguna): ");
        String arma = scanner.nextLine();
        arma = arma.toLowerCase();

        switch (arma) {
            case "fuego":
                System.out.println("¿Cuanta municion? tienes? ");
                int municion = scanner.nextInt();
                if (municion > 0) {
                    System.out.println("Puedes luchar contra los zombies");
                } else {
                    System.out.println("Debes huir");
                }
                break;
            case "cuerpo a cuerpo":
                System.out.println("Puedes defenderte");
                break;
            case "ninguna":
                System.out.println("Debes huir");
                break;
            default:
                System.out.println("Opcion incorrecta.");
                break;
        }
        scanner.close();

    }
}
