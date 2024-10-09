package es.ies.puerto;
/**
 * Dado un texto sobre Wakanda, usa el método substring()
 * para extraer solo la palabra "Wakanda" de la frase
 * "El vibranium en Wakanda es sagrado".
 * @author Shbrroso
 * @version 1.0.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String frase = "El vibranium en Wakanda es sagrado";
        String cambio = frase.substring(15,23);
        System.out.println(cambio);
    }
}