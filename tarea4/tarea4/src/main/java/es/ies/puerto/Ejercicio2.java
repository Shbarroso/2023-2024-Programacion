package es.ies.puerto;
/**
 * Declara un array que contenga las palabras de la frase 
 * "Por el poder de Grayskull, yo tengo el poder". Seguido, 
 * imprime la frase palabra por palabra desde el último elemento hasta el primer.
 * @author Shbarroso
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] palabra = {"Por", "el", "poder", "de", "Grayskull,", "yo", "tengo", "el", "poder"};

        for(int i = 0; i < palabra.length; i++){
            System.out.print(palabra[i]+ " ");
        }
        System.out.println();
        System.out.println("Inversa");
        for(int i = palabra.length - 1; i >=0; i--){
            System.out.print(palabra[i]+ " ");

        }
        
    }

}