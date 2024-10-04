package es.ies.puerto;
/**
 * Un cazador de tesoros ha recolectado una lista de objetos en el orden en que los encontró. 
 * Escribe un programa que invierta el orden de los objetos en su inventario para mostrar el último objeto primero.
 * @author Shbarroso
 */
public class Ejercicio4 {
    // Examen
    public static void main(String[] args) {
        String[] inventario = {"Espada", "Escudo", "Poción", "Gema", "Mapa"}; 
        
        int tamanio = inventario.length;

        for(int i = 0; i < tamanio/2; i++){
            String valor = inventario[i];
            inventario[i] = inventario[tamanio -1 -i];
            inventario[tamanio -1 -i] = valor;
        }

        for(int i= 0; i < inventario.length; i++){
            System.out.println(inventario[i]);
        }

    }
}