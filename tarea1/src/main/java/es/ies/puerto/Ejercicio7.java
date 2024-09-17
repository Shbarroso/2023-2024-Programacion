package es.ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que convierta grados Celsius a Fahrenheit. 
 * Usa variables de tipo double para los cálculos.
 * @author Shbarroso
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        double gradoC;
        double gradoF;
        System.out.println("Introduce los gradosC:");
        gradoC = sc.nextDouble();
        gradoF = (gradoC * 9.5d) +32;
        System.out.println("Los grados Celsius a Fahrenheit es: "+gradoF);
    }
}