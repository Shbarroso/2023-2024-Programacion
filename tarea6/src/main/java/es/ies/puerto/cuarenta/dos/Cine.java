package es.ies.puerto.cuarenta.dos;

import es.ies.puerto.cuarenta.EBook;
import es.ies.puerto.diez.siete.Libro;

public class Cine {
    private String nombre;
    private int numCine;
    private Proyecciones[] proyecciones;

    public Cine() {
        numCine = 0;
        proyecciones = new Proyecciones[5];
    }

    public Cine(String nombre) {
        this.nombre = nombre;
        numCine = 0;
        proyecciones = new Proyecciones[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCine() {
        return numCine;
    }

    public void setNumCine(int numCine) {
        this.numCine = numCine;
    }

    public Proyecciones[] getProyecciones() {
        return proyecciones;
    }

    public void setProyecciones(Proyecciones[] proyecciones) {
        this.proyecciones = proyecciones;
    }
    public boolean addProyeccion(Proyecciones proyeccione){
        if (proyeccione == null){
            return  false;
        }
        if (numCine >= proyecciones.length){
            return false;
        }
        proyecciones[numCine] = proyeccione;
        numCine++;
        return  true;
    }
    public  boolean  deleteProyeccion(Proyecciones proyeccione){
        if (proyeccione == null) {
            return false;
        }
        if (numCine == 0)  {
            return false;
        }
        for (int i = 0; i < proyecciones.length; i++) {
            if (proyeccione.equals(proyecciones[i])) {
                proyecciones[i] = null;
                numCine--;
                return true;
            }
        }
        return false;
    }


    public boolean buscarProyeccion(Proyecciones eBookBuscado) {
       for(int i = 0; i<proyecciones.length; i++){
           Proyecciones proyeccione = proyecciones[i];
           if (proyeccione!= null) {
               if (proyeccione.equals(eBookBuscado)) {
               return true;
               }
           }
       }
       return false;
   }

    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numCine; i++){
            mensaje += proyecciones[i];
        }
        return mensaje;
    }
}
