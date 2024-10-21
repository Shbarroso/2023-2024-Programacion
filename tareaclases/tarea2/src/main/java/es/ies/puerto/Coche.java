package es.ies.puerto;
/**
 * Ejercicio 3
 * Crea una clase Coche con los atributos marca, modelo y año. 
 * Incluye un constructor y métodos getter y setter para cada atributo.
 * Ejercicio 4
 * Modifica la clase Coche para que el setter del atributo año solo permita 
 * valores mayores o iguales a 1886 (año de creación del primer coche).
 * @author Shbarroso
 * @version 1.0.0
 */
public class Coche {
    private String  marca;
    private String modelo;
    private int anio;
    /**
     * Constructor por defecto
     */
    public Coche() {
    }
    /**
     * Constructor con todas las propiedades
     * @param marca del coche
     * @param modelo del coche
     * @param anio del coche
     */
    
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    /**
     * Getters and Setters
     */
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) { 
        if (anio <= 1886) {
            this.anio = 1886;
        }else{
            this.anio = anio;
        }
    }

    public void mostarInformacion(){
        System.out.println("Marca: "+marca+", Modelo: "+modelo+ ", Años: "+anio);
    }

    public void mostarInfo(){
        System.out.println("Marca: "+marca+", Modelo: "+modelo+ ", Años: "+anio);
    }


    @Override
    public String toString() {
        return"Marca: " + getMarca()+
            ", Modelo: " + getModelo() +
            ", año: " + getAnio();
    }


}
