package es.ies.puerto;

import java.util.Scanner;

/**
 * Batman y Superman están peleando. Si la fuerza de Superman es mayor a la de Batman,
 * Superman gana. Si es menor, Batman gana. Si tienen la misma fuerza, es un empate.
 * Escribe un programa que reciba las fuerzas de ambos héroes y determine quién gana.
 * @author Shbarroso
 */

public class Ejercicio12 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Intrdoduce la fuerza de Batman: ");
        int fuerza1 = scanner.nextInt();

        System.out.print("Introduce la fuerza de Superman: ");
        int fuerza2 = scanner.nextInt();

        if (fuerza1 <= fuerza2 && fuerza2 <= fuerza1) {
            System.out.println("Es un empate entre Batman y Superman");
        } else if (fuerza2 > fuerza1) {
            System.out.println("Superman gana.");
        } else if (fuerza1 > fuerza2) {
            System.out.println("Batman gana.");
        }
        scanner.close();
    }
}
