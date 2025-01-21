package es.ies.puerto;

import java.time.LocalDate;

public class Ejercicio8 {
    public static long diasDesdeInicioDelanio(LocalDate fecha) {
        if (fecha == null) {
            return -1l;
        }

        return fecha.getDayOfYear();
    }
}
