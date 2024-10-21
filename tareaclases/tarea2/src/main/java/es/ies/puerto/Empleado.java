package es.ies.puerto;
/**
 * Ejercicio 8
 * Crea una clase Empleado con los atributos nombre, puesto y salario. 
 * Usa getters y setters para cada atributo. El salario no puede ser negativo.
 * Ejercicio 9
 * Modifica la clase Empleado para que el setter de puesto no permita 
 * valores vacíos o nulos.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Empleado {
    private String nombre;
    private String puesto;
    private float salario;
/**
     * Constructor por defecto
     */
    public Empleado() {
    }
    
    /**
     * Constructor con todas las propiedades
     * @param nombre del empleado
     * @param puesto del empleado
     * @param salario del empleado
     */
    public Empleado(String nombre, String puesto, float salario) {
        this.nombre = nombre;
        setPuesto(puesto);
        setSalario(salario);
    }

    /**
     * Getters and Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto == null || puesto.isEmpty()){
            puesto = "puesto";
        }else {
            this.puesto = puesto;
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario > 0){
            this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre+
                ", puesto: " + puesto +
                ", salari: " + salario;
    }

}
