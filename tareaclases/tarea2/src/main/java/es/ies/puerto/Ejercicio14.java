package es.ies.puerto;

public class Ejercicio14 {
    static private Alumno alumno;

    public static void main(String[] args) {
        alumno = new Alumno("Jorge", 11);
        System.out.println(alumno.getNota());
        alumno.apobar();

    }
}