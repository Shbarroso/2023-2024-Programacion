package es.ies.puerto;
/**
 * En la Tierra Media, varios objetos mágicos han sido encontrados, 
 * pero los héroes están buscando específicamente el "Anillo Único". 
 * Escribe un programa que determine si el Anillo Único está en el inventario.
 * @author Shbarroso
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        String[] objetosMagicos = {"Palantir", "Anillo Único", "Espada de Elendil", "Capa Élfica"};
        String objetoBuscado = "Anillo Único";

        boolean recursoEncontrado = false;

        for(String recurso: objetosMagicos){
            if (recurso.equals(objetoBuscado)) {
                recursoEncontrado = true;
                break;
            }
        }

        if (recursoEncontrado){
            System.out.println(objetoBuscado + " se encuentra en el inventario");
        } else {
            System.out.println(objetoBuscado + " no se encuantra el recurso encontrado");
        }
    }
}