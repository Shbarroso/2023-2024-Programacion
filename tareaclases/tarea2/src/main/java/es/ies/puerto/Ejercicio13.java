package es.ies.puerto;

public class Ejercicio13 {
    static private Alumno alumno;

    public static void main(String[] args) {
        alumno = new Alumno("Lucia",7);
        System.out.println(alumno.getNota());
        alumno.apobar();
    }
}
