package es.ies.puerto.uno;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        System.out.println(esBisiesto(anio));
        scanner.close();
    }

    public static String esBisiesto(int anio) {
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            return "EL año: "+anio+" es bisiesto.";
        }
        return "El año: "+anio+" no es bisiesto.";
    }
}