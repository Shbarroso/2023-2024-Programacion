package es.ies.puerto;

import java.util.Scanner;

/**
 * Para hacer la fusión, los guerreros deben tener la misma cantidad de ki. Si los valores de ki no coincidente, la fusión falla.
 * Escribe un programa que reciba los valores de ki de dos guerreros y determine si la fusión es exitosa o falla.
 * @author Shbarroso
 */

public class Ejercicio9 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Introducw los valores de ki1 y ki2: ");
        int ki1 = scanner.nextInt();
        int ki2 = scanner.nextInt();

        if (ki1 == ki2) {
            System.out.println("La fusion a tenido exito");
        } else{
            System.out.println("La fusion no a tenido exito");
        }
        scanner.close();
    }

}
