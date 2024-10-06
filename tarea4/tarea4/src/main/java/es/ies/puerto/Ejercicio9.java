package es.ies.puerto;
/**
 * En una batalla épica, dos ejércitos se han unido.
 * Escribe un programa que sume los puntos de fuerza de 
 * los guerreros de dos ejércitos y muestre un nuevo array con las fuerzas combinadas de ambos.
 * @author Shbarroso
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] ejercito1 = {50, 60, 70};
        int[] ejercito2 = {40, 80, 60};

        int[] fuerzasCombinadas = new int[ejercito1.length];

        for (int i = 0; i < fuerzasCombinadas.length; i++) {
            fuerzasCombinadas[i] += ejercito1[i];
            fuerzasCombinadas[i] += ejercito2[i];
        }

        for (int fuerza : fuerzasCombinadas){
            System.out.println(fuerza+" ");
        }
    }
}