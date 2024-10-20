package es.ies.puerto;
/**
 * Un viajero del espacio está tratando de calcular el tiempo que
 * tardará en llegar a su destino a través del hiperespacio. La
 * distancia a su destino es de ( 4.5 \times 10^{16} ) metros y
 * çviaja a una velocidad constante de ( 2.0 \times 10^{8} )
 * metros por segundo. Usa la fórmula:
 *
 * [ t = \frac{d}{v} ]
 *
 * donde ( t ) es el tiempo en segundos, ( d ) es la distancia y
 * ( v ) es la velocidad. Calcula el tiempo de viaje.
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio30 {
    public static void main(String[] args) {
        double distancia = 4.5e16;
        double velocidad = 2.0e8;
        double tiempo = distancia/velocidad;
        System.out.println(tiempo+ " segundos");
    }
}