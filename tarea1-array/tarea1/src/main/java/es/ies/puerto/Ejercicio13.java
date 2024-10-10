package es.ies.puerto;
/**
 * Crea un programa que convierta un poder de pelea (entero) en un 
 * string y viceversa usando los métodos Integer.parseInt() y 
 * Integer.toString().
 * @author Shbarroso
 * @version 1.0.0
 */


public class Ejercicio13 {
    public static void main(String[] args) {
        int pelea = 4000;
        String pelea1 = "5000";
        int cambio = Integer.parseInt(pelea1);
        String cambio1 = Integer.toString(pelea);    
        
        System.out.println(pelea);
        System.out.println(pelea1);
        System.out.println();
        System.out.print(cambio);
        System.out.println();
        System.out.print(cambio1);
    }
}