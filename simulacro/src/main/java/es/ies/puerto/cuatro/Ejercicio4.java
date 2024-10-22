package es.ies.puerto.cuatro;

import java.util.Scanner;

public class Ejercicio4 {
    static  Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String texto = scanner.nextLine();

        int contadorVocales = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'á'
                || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                contadorVocales++;
            }
        }

        System.out.println("Número de vocales: " + contadorVocales);
        scanner.close();
    }

}