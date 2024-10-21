package es.ies.puerto;
/**
 * Ejercicio 17
 * Crea una clase Vehiculo con los atributos marca, modelo y combustible. 
 * Define un método que permita agregar combustible al vehículo.
 * Ejercicio 18
 * Modifica la clase Vehiculo para que el setter de combustible no permita 
 * valores negativos.
 * @author Shbarroso
 * @version 1.0.0
*/
public class Vehiculo {
    private String marca;
    private String modelo;
    private float combustible;
    /**
     * Constructor por defecto
     */
    public Vehiculo() {
    }
    
     /**
     * Constructor con todas las propiedades
     * @param marca del vehiculo
     * @param modelo del vehiculo
     * @param combustible del vehiculo
     */
    
    public Vehiculo(String marca, String modelo, float combustible) {
        this.marca = marca;
        this.modelo = modelo;
        setCombustible(combustible);
    }

    /**
     * Getters and Setters
     */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCombustible() {
        return combustible;
    }

    public void setCombustible(float combustible) {
        if (combustible > 0) {
            this.combustible = combustible;
        }
    }
    public void agregar(float litro) {
        if (litro > 0) {
            this.combustible += litro;
            System.out.println("Combustible agregado: "+litro);
        }
    }
    @Override
    public String toString() {
        return "Marca: " + marca +
                ", modelo: " + modelo +
                ", combustible: " + combustible;
    }
}
