package es.ies.puerto;
/**
 * Declara una variable int que contenga tu año de nacimiento. 
 * Calcula y muestra tu edad actual utilizando otra variable para el año actual.
 * @author Shbarroso
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int anoNacimiento = 2004;
        int anoActual = 2024;
        int edad = anoActual - anoNacimiento;
        System.out.println("Mi edad es: " +edad);
    }
}