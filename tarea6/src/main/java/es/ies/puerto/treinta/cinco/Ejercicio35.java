package es.ies.puerto.treinta.cinco;

public class Ejercicio35 {
    static Bebida bebida;
    static Bebida bebida2;

    public static void main(String[] args) {
        bebida = new Bebida("H",2,2);
        bebida2 = new Bebida("G",3,3);
        System.out.println("¿Son iguales los tamaños de las bebidas?"+bebida.equals(bebida2));
    }
}
