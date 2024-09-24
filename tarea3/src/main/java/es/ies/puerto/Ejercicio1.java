package es.ies.puerto;

import java.util.Random;
import java.util.Scanner;

/**
 * Eres un héroe en una mazmorra con dos puertas. Si eliges la puerta correcta, 
 * obtienes una espada mágica. Si eliges la incorrecta, caerás en una trampa
 * @author Shbarroso
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int puertaCorrecta = random.nextInt(2) + 1;

        System.out.println("Elige una puerta (1 o 2): ");
        int eleccionUsuario = scanner.nextInt();

        if (eleccionUsuario == puertaCorrecta) {
            System.out.println("¡Has obtenido la espada mágica!");
        } else if (eleccionUsuario == 1 || eleccionUsuario == 2) {
            System.out.println("¡Has caído en la trampa!");
        } else {
            System.out.println("Opción no válida. Elige 1 o 2.");
        }

        scanner.close();
    }
}