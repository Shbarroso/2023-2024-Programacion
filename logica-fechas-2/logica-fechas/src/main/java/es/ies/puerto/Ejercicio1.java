package es.ies.puerto;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Ejercicio1 {
    
    public static LocalDateTime calcularDiferenciaFechas(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        if (fechaFin == null || fechaInicio == null) {
            return null;
        }
        fechaInicio = LocalDateTime.of(2020, 2, 29, 23, 45, 30);
        fechaFin = LocalDateTime.of(2025, 1, 1, 8, 15, 45);
        Duration diferencia =  Duration.between(fechaInicio, fechaFin);
       
        return null;
    }
}
