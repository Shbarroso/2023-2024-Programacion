package es.ies.puerto;
/**
 * Thanos ha recolectado gemas del infinito, pero quiere saber cuántas tiene de cada tipo. 
 * Escribe un programa que cuente cuántas gemas de "Poder", "Tiempo" y "Espacio" ha recolectado.
 * @author Shbarroso
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        String[] gemas = {"Poder", "Tiempo", "Espacio", "Tiempo", "Poder", "Poder"};

        int Poder = 0;
        int Tiempo = 0;
        int Espacio = 0;

        for (String gema : gemas) {
            if (gema.equals("Poder")) {
                Poder++;
            } else if (gema.equals("Tiempo")) {
                Tiempo++;
            } else if (gema.equals("Espacio")) {
                Espacio++;
            }
        }

        System.out.println("Poder = " + Poder);
        System.out.println("Plata = " + Tiempo);
        System.out.println("Bronce = " + Espacio);
    }
}