package es.ies.puerto;
/**
 *  Escribe un programa que reciba una entrada del usuario
 *  y convierta la primera letra de cada palabra en mayúscula
 *  (como si fuera el diario del Capitán Kirk).
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = "en un universo alterno";
        String[] mayuscula = frase.split(" ");
        for(int i = 0; i < mayuscula.length; i++){
            mayuscula[i] = mayuscula[i].substring(0,1).toUpperCase()
            + mayuscula[i].substring(1).toLowerCase();
            System.out.print(mayuscula[i]+ " ");
        }

    }
}