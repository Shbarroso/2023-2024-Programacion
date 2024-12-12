package es.ies.puerto;

import java.util.Scanner;
import java.util.Vector;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingresa números (0 para terminar):");
        System.out.println(crearVectorDinamico());
    }

    static Vector crearVectorDinamico(){
        Vector<Integer> numeros = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int numero;
        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeros.add(numero);
        }

        scanner.close();
        return numeros;
    }
}