package es.ies.puerto;

import java.util.Scanner;

/**
 * Eres un guerrero de nivel 5. Si obtienes más de 50 puntos de 
 * experiencia, subes a nivel 6. Si no, te quedas en nivel 5.
 * @author Shbarroso
 */

public class Ejercicio2 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Introoduce los puntos de experiencia: ");
        int experiencia = scanner.nextInt();

        if (experiencia < 50) {
            System.out.println("Experiencia insuficiente. No subes de nivel");
        } else{
            System.out.println("Experiencia suficiente. Subes de nivel.");
        }
        
        scanner.close();
    }
}
