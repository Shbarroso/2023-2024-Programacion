package es.ies.puerto;
/**
 * Los héroes de un equipo de aventureros tienen diferentes cantidades de puntos de vida. 
 * Escribe un programa que calcule la suma total de puntos de vida de todos los aventureros en un array.
 * @author Shbarroso
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] puntosDeVida = {100, 200, 150, 180, 90};

        int suma = 0;
        for(int i=0; i < puntosDeVida.length; i++){
            suma = suma + puntosDeVida[i];
        }
        System.out.print("Total de puntos de vida: "+suma);
    }

}