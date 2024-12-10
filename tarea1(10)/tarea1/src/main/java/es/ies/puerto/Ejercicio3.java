package es.ies.puerto;

import java.util.Arrays;
import java.util.Vector;
/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio3 {
    static Vector<String> enteros = new Vector<>();
    public static void main(String[] args) {
        System.out.println(eliminarCondicion(enteros));
    }
/**
 * Metodo para eliminar por una condicion.
 * @param palabras
 * @return
 */
    static Vector eliminarCondicion(Vector<String> palabras){
        palabras = new Vector<>(Arrays.asList("Azul", "Amarillo", "Verde", "Anaranjado"));
        char palabra1 = 'A';
        for(int i = 0; i < palabras.size();i++){
            if(palabras.get(i).charAt(0) == palabra1){
                palabras.remove(i);
                i--;
            }
        }
        return palabras;
    }
}