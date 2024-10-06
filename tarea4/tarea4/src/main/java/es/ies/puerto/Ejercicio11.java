package es.ies.puerto;
/**
 * Los héroes han bebido una poción mágica que multiplica su poder de ataque. 
 * Escribe un programa que multiplique cada valor de ataque en el array por un valor escalar (el poder de la poción).
 * @author Shbarroso
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] poderesDeAtaque = {50, 70, 100};
        int pocion = 2;

        int[] poderesMultiplicados = new int[poderesDeAtaque.length];

        for (int i = 0; i < poderesDeAtaque.length; i++) {
            poderesMultiplicados[i] = poderesDeAtaque[i] * pocion;
        }
        for(int poder : poderesMultiplicados) {
            System.out.println(poder + " ");
        }
    }
}