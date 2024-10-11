package es.ies.puerto;
/**
 * Dado el código Sith: "La paz es una mentira, solo hay pasión",
 * crea un programa que cuente cuántas veces aparece la palabra "es".
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        String codigoSith = "La paz es una mentira, solo hay pasión";
        String[] palabras = codigoSith.split(" ");
        int contador = 0;

        for (String palabra : palabras){
            if (palabra.equals("es")){
                contador++;
            }
        }
        System.out.println(contador);
    }
}