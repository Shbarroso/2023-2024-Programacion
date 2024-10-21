package es.ies.puerto;
/**
 * Ejercicio 19
 * Crea una clase Circulo con un atributo radio. Implementa un método que calcule el área 
 * y el perímetro del círculo. Usa getters y setters para el radio.
 * Ejercicio 20
 * Modifica la clase Circulo para que el setter de radio solo acepte valores positivos 
 * y mayores a 0.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Circulo {
    private  float radio;
    /**
     * Constructor por defecto
     */
    public Circulo() {
    }
     /**
     * Constructor con todas las propiedades
     * @param radio del circulo
     */
    public Circulo(float radio) {
        setRadio(radio);
    }
    /**
     * Getters and Setters
     */
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }

    public float area(){
        double area = Math.PI * Math.pow(radio,2);
        return (float) area;
    }
    public void perimetro(){
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro: "+perimetro);
    }
    @Override
    public String toString() {
        return "Radio: " + radio;
    }
}
