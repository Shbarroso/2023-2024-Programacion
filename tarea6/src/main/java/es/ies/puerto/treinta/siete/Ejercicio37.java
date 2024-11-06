package es.ies.puerto.treinta.siete;

public class Ejercicio37 {
    static Partido partido;

    public static void main(String[] args) {
        partido = new Partido("H","d");
        System.out.println(partido);
        partido.actualizarResultado(2,5);
        System.out.println(partido);
    }
}
