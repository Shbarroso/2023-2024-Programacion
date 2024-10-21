package es.ies.puerto;
/**
 * Ejercicio 5
 * Crea una clase llamada Rectangulo con los atributos base y altura. 
 * Implementa un método que calcule el área del rectángulo. 
 * Usa getters y setters para los atributos.
 * Ejercicio 6
 * Añade un método en la clase Rectangulo que calcule el perímetro del rectángulo.
 * La fórmula para calcular el perímetro de un rectángulo es:
 *  𝑃 = 2⋅(𝑏+ℎ)
 * Donde:
 *  P es el perímetro.
 *  b es la longitud de la base del rectángulo.
 *  h es la altura del rectángulo.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Rectangulo {
    private int base;
    private int altura;

    /**
     * Constructor por defecto
     */
    public Rectangulo() {
    }
    /**
     * Constructor con todas las propiedades
     * @param base del rectangulo
     * @param altura del rectangulo
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * Getters and Setters
     */
    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return"Base: " + getBase() +
            ", altura: " + getAltura();
    }

    public int calcularArea(){
        return base*altura;
    }

    public int calcularPerimetro(){
        return 2*(base+altura);
    }

}
