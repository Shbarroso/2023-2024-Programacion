package es.ies.puerto;
/**
 * Dado el nombre "Goku", crea un programa que añada "SSJ" al final 
 * de su nombre dependiendo del nivel (e.g. "Goku SSJ1", "Goku SSJ2").
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre = "Goku";
        Integer nivel = Math.abs(3);
        String resultado = nombre +"SSJ"+ Integer.toString(nivel);
        System.out.println(resultado);
        
    }
}