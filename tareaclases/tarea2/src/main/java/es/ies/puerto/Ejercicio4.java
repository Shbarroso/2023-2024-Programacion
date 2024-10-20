package es.ies.puerto;

public class Ejercicio4 {
    static private Coche coche2;

    public static void main(String[] args) {
        coche2 = new Coche("Ford","Toyota", 2020);
        coche2.mostarInfo();
        coche2.setAnio(1878);
        System.out.println(coche2);
    }
}
