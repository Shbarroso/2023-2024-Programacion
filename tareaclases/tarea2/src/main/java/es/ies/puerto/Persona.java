package es.ies.puerto;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;


    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }


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

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }



    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", dni='" + getDni() + "'" +
            "}";
    }





}
