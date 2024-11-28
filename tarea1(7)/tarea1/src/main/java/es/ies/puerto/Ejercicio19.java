package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @authorShbarroso
 * @version 1.0.0
 */

public class Ejercicio19 {
public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        String dni = "12345678A";
        Persona personabuscada = new Persona(dni);
        int posicion = personas.indexOf(personabuscada);
        if (posicion >= 0) {
            System.out.println("Persona buscada: "+personas.get(posicion));
        }
        personas.add(new Persona("Alejanro", 25, "12345678A"));
        personas.add(new Persona("Samuel", 13, "12345679A"));
        personas.add(new Persona("Eduardo", 42, "12345668A"));
        personas.add(new Persona("Hector", 12, "12345673A"));

        for (Persona nombre : personas) {
            System.out.println(nombre);
            if (nombre.getDni().equals(dni)) {
                System.out.println(nombre);
            }
        }
    }
}