package es.ies.puerto;
/**
 * Calcula la potencia de Superman en función de un poder inicial 
 * de 5 elevado a la fuerza de un enemigo (usa el método Math.pow()).
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        int poder = 5;
        int poderEnemigo = 3;
        double poderElevado = Math.pow(poder, poderEnemigo);
        System.out.println(poderElevado);        
    }
}