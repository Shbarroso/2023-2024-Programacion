package es.ies.puerto.diez.tres;

public class Ejercicio13 {
    static  Alumno alumno;
    static Alumno alumno2;

    public static void main(String[] args) {
        alumno = new Alumno("Atila",6,5,5);
        alumno2 = new Alumno("Atila",6,5,5);
        System.out.println("El promedio de las notas: "+alumno.promedio());
        System.out.println("¿Son iguales?"+alumno.equals(alumno2));
    }

}
