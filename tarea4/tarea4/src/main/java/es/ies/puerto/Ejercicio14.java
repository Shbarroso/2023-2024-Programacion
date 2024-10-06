package es.ies.puerto;
/**
 * Se han registrado los puntajes de las casas de Hogwarts en el Torneo de Magia. 
 * Cada casa recibe una medalla (Oro, Plata o Bronce) según su puntuación. 
 * Escribe un programa que cuente cuántas medallas de cada tipo ha ganado una casa.
 * @author Shbarroso
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        String[] medallas = {"Oro", "Plata", "Bronce", "Oro", "Oro", "Plata"};

        int oro = 0;
        int plata = 0;
        int bronce = 0;

        for (String medalla : medallas) {
            if (medalla.equals("Oro")) {
                oro++;
            } else if (medalla.equals("Plata")) {
                plata++;
            } else if (medalla.equals("Bronce")) {
                bronce++;
            }
        }

        System.out.println("Oro = " + oro);
        System.out.println("Plata = " + plata);
        System.out.println("Bronce = " + bronce);
    }
}