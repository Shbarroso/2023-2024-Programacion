package es.ies.puerto;
/**
 * Un grupo de guerreros ha sido evaluado por su nivel de poder de ataque. 
 * Escribe un programa que determine quién es el héroe más fuerte y el más débil.
 * @author Shbarroso
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] nivelesDeAtaque = {300, 150, 500, 200, 250}; // Niveles de ataque de los guerreros // Salida esperada: Máximo = 500, Mínimo = 150

        int max = nivelesDeAtaque[0];
        int min = nivelesDeAtaque[0];
    

        for(int i = 1; i < nivelesDeAtaque.length; i++){
            int valor = nivelesDeAtaque[i];

            if (valor > max) {
                max = valor;
            }

            if (valor < min) {
                min = valor;
            }

        }

        System.out.println("Guerrero con más ataque: " + max);
        System.out.println("Guerrero con menos ataque: " + min);    
    }
}