package es.ies.puerto.veinte.cinco;

import es.ies.puerto.diez.uno.Vehiculo;

public class Concesionario {
    private Vehiculo[] vehiculos;

    private int numVehiculos;


    public Concesionario() {
    }

    public Concesionario(int numVehiculos) {
        this.numVehiculos = 0;
        this.vehiculos = new Vehiculo[numVehiculos];
    }
    /**
     * Metodo para agregar vehiculos
     * @param vehiculo
     * @return
     */
    public boolean addVehiculo(Vehiculo vehiculo){
        if (numVehiculos >= vehiculos.length) {
            return false;
        }
        vehiculos[this.numVehiculos] = vehiculo;
        this.numVehiculos++;
        return true;
    }

    @Override
    public String toString() {
        String mensaje = "";

        // version 1
        /**
        for(int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null) {
                mensaje += vehiculos[i];
            }
            
        }
        */
        // version 2 mas eficiente
        for(int i = 0; i < this.numVehiculos; i++) {
            mensaje += vehiculos[i];
        }
        return "numVehiculos='" + numVehiculos+ "'"+mensaje;
    }

}
