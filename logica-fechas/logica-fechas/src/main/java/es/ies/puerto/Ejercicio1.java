package es.ies.puerto;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio1 {
    public static boolean esViernes13(String fechaStr) {
        
        if(fechaStr == null || fechaStr.isEmpty()){
            return false;
        }

        LocalDate localDate = LocalDate.parse(fechaStr);
        return localDate.getDayOfMonth() == 13 && localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }
}
