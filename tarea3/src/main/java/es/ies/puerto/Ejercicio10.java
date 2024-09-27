package es.ies.puerto;

import java.util.Scanner;

/**
 *  Según tus respuestas en el sombrero seleccionador, te pueden asignar a
 *  Gryffindor, Slytherin, Ravenclaw o Hufflepuff. Elige entre valiente, astuto,
 *  sabio o leal y el programa te asignará una casa.
 * Crea un programa que te asigne una casa según tu elección.
 * @author Shbarroso
 */

public class Ejercicio10 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Introduce un tipo(Valiente, Astuto, Sabio o Leal): ");
        String tipo = scanner.nextLine();

        switch (tipo){
            case "Valiente" :
                System.out.println("Perteneces a Gryffindor");
                break;
            case "Astuto" :
                System.out.println("Perteneces a Slytherin");
                break;
            case "Sabio" :
                System.out.println("Perteneces a Ravenclaw");
                break;
            case "Leal" :
                System.out.println("Perteneces a Hufflepuff");
                break;
            default:
                System.out.println("Opcion incorrecta.");
                break;
        }
        scanner.close();
    }

}
