package es.ies.puerto;
/**
 * Simula un combate Pokémon y genera un daño aleatorio
 * entre 50 y 100 usando Math.random().
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio29 {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random()*50)+50;
        System.out.println(numeroAleatorio);
    }
}