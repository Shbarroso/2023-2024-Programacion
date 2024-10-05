package es.ies.puerto;
/**
 * Un droide está buscando un cristal Kyber en una lista de recursos
 * recolectados por el equipo rebelde.
 * Escribe un programa que busque un valor específico en el array y
 * verifique si el cristal Kyber está presente.
 * @author Shbarroso
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String[] recursos = {"Bláster", "Cristal Kyber", "Sable de luz", "Pistola"};
        String recursoBuscado = "Cristal Kyber";

        boolean recursoEncontrado = false;

        for(String recurso: recursos){
            if (recurso.equals(recursoBuscado)) {
                recursoEncontrado = true;
                break;
            }
        }

        if (recursoEncontrado){
            System.out.println(recursoBuscado + "se encuentra en el inventario");
        } else {
            System.out.println(recursoBuscado + "no se encuantra el recurso encontrado");
        }
    }
}