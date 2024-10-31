package es.ies.puerto.veinte.cinco;

import es.ies.puerto.diez.uno.Vehiculo;

public class Ejercicio25 {
    static Concesionario concesionario;

    public static void main(String[] args) {
        concesionario = new Concesionario(5);
        Vehiculo vehiculo = new Vehiculo("h","j");
        concesionario.addVehiculo(vehiculo);
        System.out.println("Consesionario: "+concesionario);
    }
}
