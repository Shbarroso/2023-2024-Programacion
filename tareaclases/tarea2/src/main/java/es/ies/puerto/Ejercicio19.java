package es.ies.puerto;

public class Ejercicio19 {
    static private Circulo circulo;

    public static void main(String[] args) {
        circulo = new Circulo(5);
        System.out.println(circulo);
        System.out.println("Area: "+circulo.area());
        circulo.perimetro();
    }
}
