package es.ies.puerto;
/**
 * Dado un hechizo como "Expecto Patronum", crea un programa que 
 * verifique si comienza con "Expecto" y termina con "Patronum".
 * @author Shbarroso
 * @version 1.0.0
 */

public class Ejercicio22 {
    public static void main(String[] args) {
        String hechizo = "Expecto Patronum";
        boolean hechizo1 = false;
        if (hechizo.contains(hechizo)){
            hechizo1 = true;
        }
        System.out.println(hechizo1);
    }
}