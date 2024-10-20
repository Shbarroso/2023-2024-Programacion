package org.example;

import java.util.Scanner;

/**
 * Reto 1: Verificar el acceso a una aplicación
 * Escribe un programa que solicite al usuario un nombre de usuario y una
 * contraseña. Si el nombre de usuario es "admin" y la contraseña es "1234",
 * imprime "Acceso concedido". Si no, imprime "Acceso denegado". El programa
 * debe permitir 3 intentos de inicio de sesión antes de bloquear el acceso.
 */
public class Ejercicio1 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {

            System.out.print("Introduce un nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce una contraseña: ");
            String contrasena = scanner.nextLine();

            if (nombre.contains("admin") && contrasena.equals("1234")) {
                System.out.println("Acceso concedido.");
                break;
            } else {
                intentos--;
                System.out.println("Acceso denegado. Intentos restantes: "+intentos);
            }
        }
        scanner.close();
    }
}