package es.ies.puerto.diez.dos;
/**
 * Crea una clase Calculadora con métodos estáticos
 * para sumar, restar, multiplicar y dividir dos números.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio12 {
    static Calculadora calculadora;

    public static void main(String[] args) {
        calculadora = new Calculadora(2,2);
        System.out.println(calculadora);
        calculadora.sumar();
        calculadora.resta();
        calculadora.multiplicacion();
        calculadora.dividir();
    }

}
