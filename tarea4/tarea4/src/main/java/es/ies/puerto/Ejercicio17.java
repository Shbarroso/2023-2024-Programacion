package es.ies.puerto;
/**
 * En un RPG, los personajes pueden subir de nivel incrementando su experiencia. 
 * Escribe un programa que multiplique la experiencia de cada personaje por 1.5 
 * para simular su mejora tras una batalla.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int[] experiencia = {100, 200, 150, 120};
        double multiplicador = 1.5; 

        int[] experiencia2 = new int[experiencia.length];

        for(int i = 0; i <experiencia2.length; i++){
            experiencia2[i] = (int) (experiencia[i] * multiplicador);
        }

        for(int experiencia3 : experiencia2) {
            System.out.print(experiencia3 + " ");
        }

    }
}