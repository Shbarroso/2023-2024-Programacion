package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author Shabarroso
 * @version 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("Hola","Mundo","Cruel"));
        System.out.println(obtenerElemento(lista, -1));
    }
    static String obtenerElemento(List<String> lista, int indice){
        String vacia = "";
        if (indice >= lista.size() || indice < 0 ){
            return vacia;
        }
        if (lista == null || lista.isEmpty()) {
            return vacia;
        }

        return lista.get(indice);
    }
}