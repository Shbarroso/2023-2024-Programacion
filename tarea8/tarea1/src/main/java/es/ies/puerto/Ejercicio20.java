package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio20 {
public static void main(String[] args) {
    List<String> lista1 = crearLista();
    System.out.println(lista1);
    System.out.println(cambiar(lista1));
    }

    public static List<String> crearLista(){
        List<String> nombres = new ArrayList<>();
        nombres.add("Daniel");
        nombres.add("Eduardo");
        nombres.add("Danone");
        nombres.add("Damian");
        nombres.add("Alejandro");
        return nombres;
    }
    public static List<String> cambiar(List<String> palabras){
        char letra = 'D';
        for (int i = 0; i < palabras.size(); i++) {
            if (palabras.get(i).charAt(0) == letra) {
                palabras.set(i, "GENÉRICO");
            }
        }
        return palabras;
    }
}