package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 */
public class Ejercicio12 {
    static List<String> palabras = new ArrayList<>(Arrays.asList(
        "Inicio", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Fin"
    ));
public static void main(String[] args) {
    
    }
    static List<String> crearLista(List<String> lista, String inicio, String fin){
        if (lista == null || lista.isEmpty()) {
            return lista;
        }
        int poicion = lista.indexOf(inicio);
        int poscion2 = lista.indexOf(fin);
        lista.subList(poicion, poscion2);
        
        return lista;
    }
}