package es.ies.puerto;

import java.net.Socket;
import java.util.Scanner;

/**
 * Si tienes más de 18 años, eres aceptado en la Resistencia. Si tienes menos de 18 
 * pero eres hábil con armas, también eres aceptado. Si no, debes esperar.
 * Crea un programa que determina si puedes unirte a la Resistencia.
 * @author Shbarroso
 */
public class Ejercicio18 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad > 18) {
            System.out.println("Te puedes unir a la resistencia.");
        } else {
            System.out.println("¿Sabes usar arma?");
            boolean usarArma = scanner.nextBoolean();
            if (usarArma) {
                System.out.println("Te puedes unir");
            } else {
                System.out.println("Debes esperar");
            }
        }
        scanner.close();
    }
}
