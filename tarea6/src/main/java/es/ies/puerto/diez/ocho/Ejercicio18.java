package es.ies.puerto.diez.ocho;

public class Ejercicio18 {
    static Circulo circulo;
    static Circulo circulo2;

    public static void main(String[] args) {
        circulo = new Circulo(4);
        circulo2 = new Circulo(5);
        System.out.println(circulo);
        circulo.area();
        circulo.perimetro();
        System.out.println("¿Los radios son iguales?"+circulo.equals(circulo2));
    }

}
