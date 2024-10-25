package es.ies.puerto.cinco;

public class Ejercicio5 {
    static private Circulo circulo;
    static private Circulo circulo2;

    public static void main(String[] args) {
        circulo = new Circulo(5);
        System.out.println(circulo);
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());

        circulo2 = new Circulo(7);
        System.out.println(circulo2);
        System.out.println(circulo2.area());
        System.out.println(circulo2.perimetro());
    }
}