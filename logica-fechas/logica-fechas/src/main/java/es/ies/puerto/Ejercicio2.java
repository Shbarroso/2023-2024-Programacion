package es.ies.puerto;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio2 {

    public static int obtenerDiasDelMes(int anio, Month mes) {
        if (mes == null || anio < 1){
            return -1;
        }
        LocalDate localDate = LocalDate.of(anio, mes.getValue(), 0);
        int numeroMes =localDate.getMonthValue();
        switch (numeroMes) {
            case 1: case 3: case 5: return 31;
            default:
                return -1;
        }
    }
}
