package es.ies.puerto.diez.uno;

import java.util.List;

public class Consesionario {
    private String nombre;
    private List<Vehiculo> vehiculos;


    public Consesionario() {
    }

    public Consesionario(String nombre) {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }
    public boolean addVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            return false;
        }
        return vehiculo.add(vehiculo);
    }

    @Override
    public String toString() {
        return "{Nombre"+nombre+", vehiculo"+vehiculo+"}";
    }
}
