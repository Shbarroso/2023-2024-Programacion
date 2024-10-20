package es.ies.puerto;

public class Ejercicio5 {
    static private Rectangulo rectangulo;

    public static void main(String[] args) {
        rectangulo = new Rectangulo(5,10);
        System.out.println(rectangulo);
        System.out.println("Area: "+rectangulo.calcularArea());
    }
}
