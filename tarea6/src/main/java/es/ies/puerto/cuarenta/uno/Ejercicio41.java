package es.ies.puerto.cuarenta.uno;

import es.ies.puerto.seis.Estudiante;

public class Ejercicio41 {
    static Estudiante estudiante;
    static  Estudiante estudiante2;
    static Colegio colegio;

    public static void main(String[] args) {
        estudiante = new Estudiante("H",3,3);
        estudiante = new Estudiante("J",4,1);
        colegio = new Colegio("Hola");

        colegio.addEstudiante(estudiante);
        colegio.addEstudiante(estudiante2);
        System.out.println(colegio);

        colegio.deleteEstudiante(estudiante2);
        System.out.println(colegio);
    }
}
