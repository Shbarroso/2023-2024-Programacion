package es.ies.puerto;

import java.time.LocalDate;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ejercicio4 {
    public static boolean esDiaFestivoNacional(LocalDate fecha) {
        if (fecha == null) {
            return false;
        }
        LocalDate navidad = LocalDate.of(fecha.getYear(), 12, 25);
        LocalDate anioNuevo = LocalDate.of(fecha.getYear(), 1, 1);
        List<LocalDate> festivos = new ArrayList<>(List.of(navidad, anioNuevo));

        return festivos.contains(fecha);
    }
}
