package es.ies.puerto;


/**
 * Declara una variable de tipo boolean que indique si una persona 
 * es mayor de edad (true o false). Asigna un valor y muéstralo por pantalla.
 * @author Shbarroso
 * 
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int edad = 12;
        boolean mayorEdad = true;
        boolean menorEdad = false;
        if(edad >= 18) {
            System.out.println("La persona es mayor de edad: "+mayorEdad);
        }else{
            System.out.println("La persona es mayor de edad: " +menorEdad);
        }
        
    }
}