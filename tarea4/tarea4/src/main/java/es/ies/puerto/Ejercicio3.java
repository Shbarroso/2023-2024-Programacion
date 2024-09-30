package es.ies.puerto;
/**
 * Crea un array que almacene los nombres de 6 Pokémon de Ash. Recorre el array para mostrar los nombres con las siguientes reglas:
 * Si el nombre del Pokémon contiene una "a", imprime "Pikachu lo elige".
 * Si se oste una "i", imprime "Es muy fuerte".
 * De lo contrario, imprime el nombre normalmente.
 * @author Shbarroso
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Pikachu", "Greninja", "Charizard", "Pidgeot", "Scraggy", "Muk"};
        for (String nombre : nombres) {
            if (nombre.contains("a") || nombre.contains("A")) {
                System.out.println("Ash lo elige");
            }   else if (nombre.contains("i") || nombre.contains("I")){
                System.out.println("Es muy fuerte");
            }else{
                System.out.println(nombre);
            }
        }
    }
}