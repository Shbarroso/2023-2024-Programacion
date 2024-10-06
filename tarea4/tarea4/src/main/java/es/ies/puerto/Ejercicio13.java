package es.ies.puerto;
/**
 * Dos equipos de superhéroes han decidido fusionarse para enfrentar una amenaza mayor. 
 * Escribe un programa que combine ambos equipos en un solo array, sin que se repita ningún nombre.
 * @author Shbarroso
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        String[] equipo1 = {"Ironman", "Thor", "Hulk"};
        String[] equipo2 = {"Capitán América", "Thor", "Hawkeye"};

        String[] equipoFusionado = new String[equipo1.length + equipo2.length];

        int indiceFusionado = 0;

        for (int i = 0; i < equipo1.length; i++) {
            equipoFusionado[indiceFusionado++] = equipo1[i];
        }

        for (int i = 0; i < equipo2.length; i++) {
            boolean existe = false;
            for (int j = 0; j < indiceFusionado; j++) {
                if (equipo2[i].equals(equipoFusionado[j])) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                equipoFusionado[indiceFusionado++] = equipo2[i];
            }
        }
        for (int i = 0; i < indiceFusionado; i++) {
            System.out.print(equipoFusionado[i] + " ");
        }
    }
}