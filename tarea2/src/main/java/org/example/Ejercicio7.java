package org.example;

import java.util.Scanner;

/**
 *  Crea un programa que pida al usuario las horas trabajadas y
 *  el salario por hora, y luego calcule su salario semanal.
 * @author Shbarroso
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        float horasTrabajadas = scanner.nextFloat();

        System.out.print("Introduce el salario que gana por hora: ");
        float salarioHora = scanner.nextFloat();

        float salarioSemanal = horasTrabajadas * salarioHora;
        System.out.println("El salario semanal que gana es de: "+salarioSemanal);
        scanner.close();
    }
}
