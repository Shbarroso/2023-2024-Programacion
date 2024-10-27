package es.ies.puerto.cuatro;

public class Ejercicio4 {
    static private Rectangulo rectangulo;

    public static void main(String[] args) {
        rectangulo = new Rectangulo(2,4);
        System.out.println(rectangulo);
        rectangulo.area();
        rectangulo.perimetro();
    }
}
