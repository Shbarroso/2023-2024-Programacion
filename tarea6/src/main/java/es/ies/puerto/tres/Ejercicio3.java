package es.ies.puerto.tres;

public class Ejercicio3 {
    static private Coche coche;

    public static void main(String[] args) {
        coche = new Coche("marca", "modelo", 1,2);
        System.out.println(coche);
        coche.acelerar(2);
        coche.frenar(23);
    }
}
