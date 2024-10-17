package es.ies.puerto;

public class Ejercicio5 {
    static private Rectangulo rectangulo;
    static private Rectangulo rectangulo2;

    public static void main(String[] args) {
        rectangulo = new Rectangulo(5,10);
        System.out.println(rectangulo);
        System.out.println("Area: "+rectangulo.calcularArea());


        rectangulo2 = new Rectangulo(4, 7);
        System.out.println(rectangulo2);
        System.out.println("Perimetro: "+rectangulo2.calcularPerimetro());
    }
}
