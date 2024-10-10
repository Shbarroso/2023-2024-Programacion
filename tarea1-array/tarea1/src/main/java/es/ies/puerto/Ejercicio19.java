package es.ies.puerto;
/**
 * Crea un programa que simule el lanzamiento de un dado de 20 
 * caras usando Math.random() y que imprima el resultado del 
 * lanzamiento.
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 20+1);
        System.out.println("El valor aleatorio entre 1 y 20: "+numeroAleatorio);
    }
}