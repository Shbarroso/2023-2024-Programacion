package es.ies.puerto;

import java.util.Arrays;
import java.util.Vector;

public class Ejercicio7 {
    static Vector<String> nombre = new Vector<>();
    public static void main(String[] args) {

        System.out.println(contarNombresLargos(nombre));
    }

    static int contarNombresLargos(Vector<String> palabra){
        palabra = new Vector<>(Arrays.asList("Ana", "Francisco", "Maria", "Alejandro"));
        int contador = 0;
        for (int i = 0; i < palabra.size();i++){
            if (palabra.get(i).length() > 5){
                contador++;
            }
        }
        return contador;
    }
}