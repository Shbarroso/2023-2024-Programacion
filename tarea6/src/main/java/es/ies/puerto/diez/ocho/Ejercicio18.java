package es.ies.puerto.diez.ocho;

public class Ejercicio18 {
    static Circulo circulo;

    public static void main(String[] args) {
        circulo = new Circulo(4);
        System.out.println(circulo);
        circulo.area();
        circulo.perimetro();
    }

}
