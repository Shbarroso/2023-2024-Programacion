package es.ies.puerto.veinte.uno;

import es.ies.puerto.nueve.Empleado;

public class Ejercicio21 {
    static Empleado empleado;
    static Empleado empleado2;
    static Empresa empresa;

    public static void main(String[] args) {
        empleado = new Empleado("h","h",14);
        empleado2 = new Empleado("j","h",14);
        empresa = new Empresa("XD",1);
        empresa.agregarEmpleado(empleado);
        empresa.agregarEmpleado(empleado2);
        System.out.println(empresa);
        empresa.eliminarEmpleado(empleado);
        System.out.println(empresa);

    }
}
