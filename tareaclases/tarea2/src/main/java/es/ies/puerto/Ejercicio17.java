package es.ies.puerto;

public class Ejercicio17 {
    static private Vehiculo vehiculo;

    public static void main(String[] args) {
        vehiculo = new Vehiculo("Honda", "Civic", 40);
        System.out.println(vehiculo);
        vehiculo.agregar(20);
    }
}
