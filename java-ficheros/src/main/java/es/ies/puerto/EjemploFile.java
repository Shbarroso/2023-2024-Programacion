package es.ies.puerto;


import java.io.File;
import es.ies.puerto.model.Persona;
import es.ies.puerto.model.fichero.OperacionsFichero;



public class EjemploFile {
    
    public static void main(String[] args) {
        OperacionsFichero operaciones = new OperacionsFichero();
        Persona persona = new Persona("00000000H", "dios", 10000);
        //System.out.println(persona);
        boolean insertar = operaciones.create(persona);
        if (insertar) {
            System.out.println("Se ha insertado correctamente");
        } else {
            System.out.println("No se ha insertado el elemento");
        }
        Persona personaBuscar = new Persona("00000000H", "Dios 2", 20000);
        operaciones.update(personaBuscar);
        

    }    
}