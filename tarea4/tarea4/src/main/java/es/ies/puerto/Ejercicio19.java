package es.ies.puerto;
/**
 * Un alquimista ha creado varias pociones y desea organizar su almacén. 
 * Las pociones curativas contienen la palabra "Curación". 
 * Escribe un programa que separe las pociones curativas de las otras.
 * @author Shbarroso
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        String[] pociones = {"Poción de Curación", "Poción de Veneno", "Curación Mayor", "Poción de Invisibilidad"};

        int curativasContador = 0;
        int otrasContador = 0;

        for (int i = 0; i < pociones.length; i++) {
            if (pociones[i].contains("Curación")) {
                curativasContador++;
            } else {
                otrasContador++;
            }
        }

        String[] pocionesCurativas = new String[curativasContador];
        String[] otrasPociones = new String[otrasContador];

        curativasContador = 0;
        otrasContador = 0;

        for (int i = 0; i < pociones.length; i++) {
            if (pociones[i].contains("Curación")) {
                pocionesCurativas[curativasContador++] = pociones[i];
            } else {
                otrasPociones[otrasContador++] = pociones[i];
            }
        }

        System.out.print("Pociones curativas: ");
        for (int i = 0; i < pocionesCurativas.length; i++) {
            System.out.print(pocionesCurativas[i]);
            if (i < pocionesCurativas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Otras pociones: ");
        for (int i = 0; i < otrasPociones.length; i++) {
            System.out.print(otrasPociones[i]);
            if (i < otrasPociones.length - 1) {
                System.out.print(", ");
            }
        }

    }
}