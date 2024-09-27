package es.ies.puerto;

import java.util.Scanner;

/**
 * En una batalla de rol, si el atacante tiene más fuerza que el defensor, 
 * le inflige un daño igual a la diferencia de fuerza. Si no, el defensor 
 * bloquea el ataque. 
 * Crea un programa que reciba las fuerzas de ambos personajes y determine 
 * el daño infligido.
 * @author Shbarroso
 */
public class Ejercicio17 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        System.out.print("Introdusca la fuerza del atacante: ");
        float fuerzaAtacante = scanner.nextFloat();

        System.out.print("Introdusca la defenza del defensor: ");
        float fuerzaDefensor = scanner.nextFloat();

        if (fuerzaAtacante > fuerzaDefensor) {
            float diferenciaFuerza = fuerzaAtacante  - fuerzaDefensor;
            System.out.println("El atacante inflige: " +diferenciaFuerza);
        } else {
            System.out.println("El defensor bloqueo el ataque");
        }
        scanner.close();
    }
}
