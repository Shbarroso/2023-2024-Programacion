package es.ies.puerto;

public class Ejercicio6 {
    static private Rectangulo rectangulo2;

    public static void main(String[] args) {
        rectangulo2 = new Rectangulo(4, 7);
        System.out.println(rectangulo2);
        System.out.println("Perimetro: "+rectangulo2.calcularPerimetro());
    }
}
