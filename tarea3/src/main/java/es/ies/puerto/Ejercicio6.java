package es.ies.puerto;

import java.util.Scanner;

/**
 * Está cazando pokémon. Si el pokémon es de tipo Agua, Fuego o Planta, puedes usar la pokébola. Si es de otro tipo, no.
 * Crea un programa que te diga si puedes atrapar al pokémon o no según su tipo.
 * @author Shbarroso
 */

public class Ejercicio6 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce un tipo de pokemon:");
        String tipo = scanner.nextLine();

        switch (tipo) {
            case "Agua":
                System.out.println("Puedes usar la pokebola");
                break;
            case "Fuego":
                System.out.println("Puedes usar la pokebola");
                break;
            case "Planta":
                System.out.println("Puedes uasr la pokebola");
                break;
            default:
                System.out.println("No puedes usar la pokebola");
                break;
        }
        scanner.close();
    }

}
