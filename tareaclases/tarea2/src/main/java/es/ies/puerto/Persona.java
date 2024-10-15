package es.ies.puerto;

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

}
