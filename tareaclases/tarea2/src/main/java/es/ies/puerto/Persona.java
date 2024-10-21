package es.ies.puerto;
/**
 * Ejercicio 1
 * Crea una clase llamada Persona con los atributos nombre y edad. 
 * Define un constructor que inicialice estos valores.
 * Ejercicio 2
 * Modifica la clase Persona para que tenga métodos getter y setter 
 * para el atributo edad.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Persona {

    private String nombre;
    private int edad;

/**
 * Constructor por defecto
 */
    public Persona() {
    }
/**
 * Constructor coon el nombre del objeto
 * @param nombre de la persona.
 */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
/**
 * Constructor con el nombre y edad del objeto
 * @param nombre de la persona
 * @param edad de la persona
 */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
/**
 * Getter y Setter.
 * @return
 */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostarInfo(){
        System.out.println("Nombre: "+nombre+", edad: "+edad);
    }
    public void mostarInfo2(){
        System.out.println("Nombre: "+nombre+", edad: "+edad);
    }

    @Override
    public String toString() {
        return "Nombre: " +nombre+
                ", edad: " + edad;
    }
}
