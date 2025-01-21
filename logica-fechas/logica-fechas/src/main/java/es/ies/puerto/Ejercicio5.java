package es.ies.puerto;

import java.time.LocalDate;
/**
 * Dado un número n, calcula cuál será el día de la semana que ocurrirá después de sumar n días a la fecha actual.
 */
public class Ejercicio5 {
    public static String obtenerDiaDeLaSemanaEnElFuturo(LocalDate fecha, int dias) {
        if (fecha == null) {
            return null;
        }
        LocalDate fechaFutura = fecha.plusDays(dias);
        return fechaFutura.getDayOfWeek().toString();
    }
}
