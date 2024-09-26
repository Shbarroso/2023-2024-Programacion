package es.ies.puerto;

import java.util.Scanner;

/**
 * Rick ha activado su pistola de portales. Si ingresa un número divisible por 3, 
 * el portal lleva a la dimensión A. Si es divisible por 5, a la dimensión B. Si es divisible por ambos, a la dimensión C.
 * Crea un programa que determine una dimensión que llega el portal según el ingresado número.
 * @author Shbarroso
 */

public class Ejercicio8 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        System.out.print("Introduce un numero divisibles entre 3 y 5: ");
        int numero = scanner.nextInt();

        boolean divisible1 = numero % 3 == 0;
        boolean divisible2 = numero % 5 == 0;
        
        if (divisible1 && divisible2) {
            System.out.println("Eres llevado a la dimension C");
        } else if(divisible1){
            System.out.println("Eres llevado a la dimension A");
        }else if (divisible2) {
            System.out.println("Eres llevado a la dimension B");
        }
        scanner.close();
    }

}
