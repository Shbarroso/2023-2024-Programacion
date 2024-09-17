package es.ies.puerto;
/**
 * Declara dos variables de tipo double para almacenar el 
 * precio de dos productos. Calcula la suma y muestra el resultado.
 * @author Shbarroso
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        double precio1 = 12.3d;
        double precio2= 15.1d;
        double suma;
        suma = precio1 + precio2;
        System.out.println("El precio1 es:"+precio1+", el precio2 es:" +precio2);
        System.out.println("La suma es: " + suma);
    }
}