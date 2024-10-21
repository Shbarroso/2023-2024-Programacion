package org.example;

import java.util.Scanner;

/**
 * Reto 2: Calculadora de impuestos
Crea un programa que calcule el impuesto basado en los ingresos anuales 
ingresados por el usuario. Si el ingreso es menor a 30,000, no hay impuesto. 
Si es entre 30,000 y 100,000, el impuesto es del 10%. Si es mayor a 100,000, 
el impuesto es del 20%.
 */
public class Ejercicio2 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Introdusca los ingresos anuales: ");
        float impuesto = scanner.nextFloat();
        if (impuesto < 30.000) {
            System.out.println("No hay impuesto");
        }else if (impuesto < 30.000 && impuesto > 100.000) {
            impuesto = impuesto/10;
            System.out.println("El impuesto es del 10%");
        }else if (impuesto > 100.000) {
            impuesto = impuesto/20;
            System.out.println("El impuesto es del 20%");
        }
        scanner.close();
    }
}
