package es.ies.puerto;
/**
 * Simula el daño crítico de un ataque multiplicando el 
 * daño base por un número aleatorio entre 1.5 y 2.0 usando 
 * Math.random().
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        int dano = 200;
        double ramdom = (Math.random() *(1.5 + 2.0));
        double danoCritico = dano * ramdom;
        danoCritico = Math.round(danoCritico);
        System.out.println("Un valor aleatorio entre "+danoCritico+" y "+danoCritico);
    }
}