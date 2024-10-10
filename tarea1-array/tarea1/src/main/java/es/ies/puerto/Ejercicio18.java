package es.ies.puerto;
/**
 * Dadas las masas de dos planetas y la distancia entre ellos, 
 * calcula la fuerza gravitacional entre ellos usando la fórmula 
 * de la Ley de Gravitación Universal y Math.pow().
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        double masa1 = 6 * Math.pow(10, 24);
        double masa2 = 7 * Math.pow(10, 22);
        double distancia = 4 * Math .pow(10, 8);

        double fueraG = 6.67 * Math.pow(10, -11);

        double calculo = fueraG * (masa1 * masa2)/ Math.pow(distancia,2);

        System.out.println(calculo);

    }
}