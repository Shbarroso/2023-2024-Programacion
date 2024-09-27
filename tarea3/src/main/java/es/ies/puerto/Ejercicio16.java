package es.ies.puerto;


/**
 * Si tienes un arma de fuego y munición, puedes luchar contra los zombies.
 * Si tienes un arma cuerpo a cuerpo, puedes defenderte. Si no tienes armas, debes huir.
 * Escribe un programa que determine qué hacer según el tipo de arma y si tienes munición.
 * @author Shbarroso
 */
public class Ejercicio16 {
    public static void main(String[] args) {

        System.out.print("Introdce un tipo de arma: ");
        String armaFuego = "Pistola";
        String armaCuerpo = "Espada";
        String noArma = "Manos";
        String municion = "9mm";

        if (armaFuego.equals("Pistola") && municion.equals("9mm")){
            System.out.println("Puedes luchar contra los zombies");
        } else if (armaCuerpo.equals("Espada")) {
            System.out.println("Puedes defenderte");
        } else if (noArma.equals("Manos")) {
            System.out.println("Debes huir");
        }
    }
}
