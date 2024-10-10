package es.ies.puerto;
/**
 * En un juego de Mario, calcula cuántas vidas extra tiene el jugador 
 * si obtiene 250 monedas (usa Math.floor() para las divisiones entre 100).
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        int moneda = 250;
        double vida = Math.floor(moneda/100);
        System.out.println(vida + " vidas extras");
    }
}