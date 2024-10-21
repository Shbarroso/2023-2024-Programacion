package es.ies.puerto;
/**
 * Ejercicio 13
 * Crea una clase Alumno con los atributos nombre y nota. 
 * Implementa un método que determine si el alumno ha aprobado (nota >= 6).
 * Ejercicio 14
 * Modifica la clase Alumno para que la nota no pueda ser mayor a 10 
 * ni menor a 0 en el setter.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Alumno {

    private String nombre;
    private float nota;

    /**
     * Constructor por defecto
     */
    public Alumno() {
    }

    /**
     * Constructor con todas las propiedades
     * @param nombre del alumno
     * @param nota del alumno
     */

    public Alumno(String nombre, float nota) {
        this.nombre = nombre;
        setNota(nota);
    }
    /**
     * Getters and Setters
     */

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        if (nota < 0 || nota > 10) {
            this.nota = 10;
        }else{
            this.nota = nota;
        }
    }

    @Override
    public String toString() {
        return " Nombre:" + getNombre()+
            ", nota:" + getNota();
    }
    public void apobar(){
        if (nota > 6) {
            System.out.println("Estas aprobado");
        }else{
            System.out.println("No estas aprobado");
        }
    }
}
