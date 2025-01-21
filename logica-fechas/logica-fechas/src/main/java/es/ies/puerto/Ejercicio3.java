package es.ies.puerto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Ejercicio3 {
    public static LocalDate obtenerUltimoViernes(int anio, Month mes) {
        if (anio < 1 || mes == null){
            return null;
        }
        LocalDate localDate = LocalDate.of(anio, mes, 1);

        return null;
    }
}
