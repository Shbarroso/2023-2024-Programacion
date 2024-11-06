package es.ies.puerto.ocho;

public class Ejercicio8 {
    static Fraccion fraccion;

    public static void main(String[] args) {
        fraccion = new Fraccion(2,2);
        System.out.println(fraccion.suma(fraccion));
        System.out.println(fraccion.resta(fraccion));
        System.out.println(fraccion.multiplicar(fraccion));
        System.out.println(fraccion.dividir(fraccion));
    }
}
