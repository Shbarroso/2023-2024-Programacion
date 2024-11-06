package es.ies.puerto.cuarenta.uno;

import es.ies.puerto.diez.siete.Libro;
import es.ies.puerto.seis.Estudiante;

public class Colegio {
    private String nombre;
    private int numEstudiante;
    private Estudiante[] estudiantes;

    public Colegio() {
        numEstudiante = 0;
        estudiantes = new Estudiante[5];
    }

    public Colegio(String nombre) {
        this.nombre = nombre;
        numEstudiante = 0;
        estudiantes = new Estudiante[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    public boolean addEstudiante(Estudiante estudiante){
        if (estudiante == null){
            return  false;
        }
        if (numEstudiante >= estudiantes.length){
            return false;
        }
        estudiantes[numEstudiante] =estudiante;
        numEstudiante++;
        return  true;
    }
    public  boolean  deleteEstudiante(Estudiante estudiante){
        if (estudiante == null) {
            return false;
        }
        if (numEstudiante == 0)  {
            return false;
        }
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiante.equals(estudiantes[i])) {
                estudiantes[i] = null;
                numEstudiante--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numEstudiante; i++){
            mensaje += estudiantes[i];
        }
        return mensaje;
    }
}
