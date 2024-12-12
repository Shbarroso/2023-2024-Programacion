package es.ies.puerto;

import java.util.Arrays;
import java.util.Vector;

public class Ejercicio6 {
    static Vector<String> pais = new Vector<>();
    public static void main(String[] args) {
        System.out.println(verificarPresenciaElemento(pais, "Italia"));
    }

    static boolean verificarPresenciaElemento(Vector<String> palabra, String paisBuscado){
        palabra = new Vector<>(Arrays.asList("España", "EE.UU", "Argentina","Marrueco"));
        if (palabra.contains(paisBuscado)){
            return true;
        }
        return false;
    }
}