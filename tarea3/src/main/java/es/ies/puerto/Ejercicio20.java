package es.ies.puerto;

import java.util.Scanner;

/**
 * Dos luchadores están en la final de Mortal Kombat. Si la salud de un luchador es 0, pierde. Si ambos tienen salud, 
 * se evalúa quién tiene más ataque. Si ambos tienen el mismo ataque, el combate es un empate.
 * Escribe un programa que reciba la salud y ataque de ambos luchadores y determine el resultado del combate.
 * @author Shbarroso
 */
public class Ejercicio20 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce la vida de luchador1: ");
        int vida = scanner.nextInt();

        System.out.print("Introduce la vida de luchador2: ");
        int vida1 = scanner.nextInt();

        if (vida < 0) {
            System.out.println("Pierdes el combate");
        } else if (vida == vida1) {
            System.out.println("La vida de ambos combatientes es igual. Se utiliza el ataque para diferenciar al ganador.");

            System.out.print("Introduce el ataque del luchador: ");
            int luchador = scanner.nextInt();

            System.out.print("Introduce el ataque del luchador1: ");
            int luchador1 = scanner.nextInt();

            if (luchador > luchador1) {
                System.out.println("Ganas el combate.");
            } else if (luchador == luchador1){
                System.out.println("El combate es un empate");
            }
        }
        scanner.close();
    }
}
