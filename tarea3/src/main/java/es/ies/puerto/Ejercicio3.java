package es.ies.puerto;
/**
 * Cada día de la semana en tu nave espacial hay una actividad diferente. 
 * Los lunes entrenas combate, los miércoles pilotaje, y los viernes reparaciones. 
 * El resto de días descansas.
 * @author Shbarroso
 */

public class Ejercicio3 {
    public static void main(String[] args) {
       String diaActividad = "Lunes";

       switch(diaActividad){

        case "Lunes":
            System.out.println("Entrenas combate");
            break;

        case "Martes":
            System.out.println("Descansas");
            break;

        case "Miercoles":
            System.out.println("Pilotaje");
            break;
        case "Jueves":
            System.out.println("Descansas");
            break;

        case "Viernes":
            System.out.println("Reparaciones");
            break;

        default:
            System.out.println("Dependiendo del dia haces una actividad o no: "+diaActividad);
            break;
       }
         
    }

}
