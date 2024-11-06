package es.ies.puerto.treinta.ocho;

public class Ejercicio38 {
    static Jugador jugador;
    static Jugador jugador2;
    static Juego juego;

    public static void main(String[] args) {
        jugador = new Jugador("G","F","K");
        jugador2 = new Jugador("G","H","D");
        juego = new Juego("Hola");

        juego.addJugador(jugador);
        juego.addJugador(jugador2);
        System.out.println(juego);
        juego.deleteJugador(jugador2);
        System.out.println(juego);
    }
}
