package es.ies.puerto.diez.seis;
/**
 * Crea una clase Fecha con atributos dia, mes y anio.
 * Implementa métodos para validar si la fecha es correcta
 * y para comparar dos fechas con equals().
 * @author Shbarroso
 * @version 1.0.0
 * Examen sobre una fecha dada bisiesto
 */
public class Ejercicio16 {
    static Fecha fecha;
    static Fecha fecha2;

    public static void main(String[] args) {
        fecha = new Fecha(29,10,2024);
        fecha2 = new Fecha(29,10,2024);

        System.out.println("fecha: "+fecha);
        System.out.println("Fecha: "+fecha2);
        System.out.println("¿Son iguales? "+fecha.equals(fecha2));
    }

}
