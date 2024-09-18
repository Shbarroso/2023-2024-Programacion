package es.ies.puerto;
/**
 * Crea un programa que intercambie los valores de dos variables enteras. Por ejemplo,
 * si la variable a vale 5 y b vale 10, después del intercambio adebería valer a 10 y b 5.
 * @author Shbarroso
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+a+" b: "+b);
    }
}