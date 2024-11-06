package es.ies.puerto.veinte.uno;

import es.ies.puerto.nueve.Empleado;

public class Empresa {
    private String nombre;
    private Empleado[] empleados;
    private int numEmpleados;

    /**
     * Constructor por defecto
     */
    public Empresa() {

    }

    /**
     * Constructor de la clase
     * @param nombre
     * @param capacidad
     */
    public Empresa(String nombre, int capacidad) {
        this.nombre = nombre;
        this.empleados = new Empleado[capacidad]; 
        this.numEmpleados = 0;
    }

    /**
     * Funcion para agregar un empleado
     * @param empleado a agregar a la lista
     * @return true/false si es agregado o no
     */
    public boolean agregarEmpleado(Empleado empleado) {
        if (numEmpleados < empleados.length) {
            empleados[numEmpleados++] = empleado;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Funcion para eliminar un empleado por nombre y puesto
     * @param nombre
     * @param puesto
     * @return
     */

    public boolean eliminarEmpleado(Empleado empleado) {
        if (empleado == null || numEmpleados == 0) {
            return false;
        }
        for (int i = 0; i < empleados.length; i++) {
            if (empleado.equals(empleados[i])) {
                empleados[i] = null;
                numEmpleados--;
                return true;
            }
        }
        return false;
    }


    /**
     * Muestra los detalles de la empresa
     */ 
    @Override
    public String toString() {
        String mensaje = "Nombre de Empresa: " + nombre + "\n";
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                mensaje += empleado.toString();
            }
        }
        return mensaje;
    }
}
