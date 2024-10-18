package es.ies.puerto;

public class Ejercicio8 {
    static private Empleado empleado;

    public static void main(String[] args) {
        empleado = new Empleado("Ana","Gerente",5000);
        System.out.println(empleado.getSalario());
    }
}
