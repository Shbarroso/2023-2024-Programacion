package es.ies.puerto;

import java.util.Scanner;

/**
 * Si tu pokémon es de tipo Agua y el rival es de tipo
 * Fuego, ganas. Si es Planta, pierdes. Si el rival es Agua, empatas.
 * Crea un programa que reciba los tipos de los pokémon y determine el
 * resultado de la batalla.
 * @author Shbarroso
 */
public class Ejercicio14 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce tu tipo de pokemon: ");
        String tipo1 = scanner.nextLine();

        System.out.print("Introduce el tipo de pokemon rival: ");
        String tipo2 = scanner.nextLine();

        switch (tipo1) {
            case "Agua":
                switch (tipo2) {
                    case "Fuego":
                        System.out.println("Ganas. El tipo Agua vence al tipo Fuego.");
                        break;
                    case "Planta":
                        System.out.println("Pierdes. El tipo Agua pierde contra el tipo Planta.");
                        break;
                    case "Agua":
                        System.out.println("Empate. Ambos son de tipo Agua.");
                        break;
                    default:
                        System.out.println("Tipo de Pokémon rival no válido.");
                        break;
                }
                break;

            case "Fuego":
                switch (tipo2) {
                    case "Planta":
                        System.out.println("Ganas. El tipo Fuego vence al tipo Planta.");
                        break;
                    case "Agua":
                        System.out.println("Pierdes. El tipo Fuego pierde contra el tipo Agua.");
                        break;
                    case "Fuego":
                        System.out.println("Empate. Ambos son de tipo Fuego.");
                        break;
                    default:
                        System.out.println("Tipo de Pokémon rival no válido.");
                        break;
                }
                break;

            case "Planta":
                switch (tipo2) {
                    case "Agua":
                        System.out.println("Ganas. El tipo Planta vence al tipo Agua.");
                        break;
                    case "Fuego":
                        System.out.println("Pierdes. El tipo Planta pierde contra el tipo Fuego.");
                        break;
                    case "Planta":
                        System.out.println("Empate. Ambos son de tipo Planta.");
                        break;
                    default:
                        System.out.println("Tipo de Pokémon rival no válido.");
                        break;
                }
                break;

            default:
                System.out.println("Tu tipo de Pokémon no es válido.");
                break;
        }
        scanner.close();
    }
}
