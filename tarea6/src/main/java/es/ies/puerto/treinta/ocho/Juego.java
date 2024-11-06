package es.ies.puerto.treinta.ocho;

import es.ies.puerto.diez.siete.Libro;

public class Juego {
    private String nombre;
    private int numJugador;
    private Jugador[] jugadores;

    public Juego() {
        numJugador = 0;
        jugadores = new Jugador[5];
    }

    public Juego(String nombre) {
        this.nombre = nombre;
        numJugador = 0;
        jugadores = new Jugador[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    public boolean addJugador(Jugador jugador){
        if (jugador == null){
            return  false;
        }
        if (numJugador >= jugadores.length){
            return false;
        }
        jugadores[numJugador] = jugador;
        numJugador++;
        return  true;
    }
    public  boolean  deleteJugador(Jugador jugador){
        if (jugador == null) {
            return false;
        }
        if (numJugador == 0)  {
            return false;
        }
        for (int i = 0; i < jugadores.length; i++) {
            if (jugador.equals(jugadores[i])) {
                jugadores[i] = null;
                numJugador--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numJugador; i++){
            mensaje += jugadores[i];
        }
        return mensaje;
    }
}
