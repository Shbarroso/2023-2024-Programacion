package es.ies.puerto;
/**
 * En un juego de Mario, calcula cuántas vidas extra tiene si ha
 * recolectado 1270 monedas, sabiendo que cada 100 monedas obtiene
 * 1 vida extra.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        int moneda = 1270;
        double vida = Math.floor(moneda/100);
        System.out.println(vida+ " vidas extras");
    }
}