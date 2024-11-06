package es.ies.puerto.treinta;

public class Playlist {
    private String nombre;
    private int numCancion;
    private Cancion[] canciones;

    public Playlist() {
        numCancion = 0;
        canciones = new Cancion[5];
    }

    public Playlist(String nombre) {
        this.nombre = nombre;
        numCancion = 0;
        canciones = new Cancion[5];
    }

    public boolean addCancion(Cancion cancion){
        if (cancion == null){
            return false;
        }
        if (numCancion >= canciones.length){
            return false;
        }
        canciones[numCancion] = cancion;
        numCancion++;
        return true;
    }

    public boolean deletecancion(Cancion cancion){
        if (cancion == null){
            return false;
        }
        if (numCancion == 0){
            return false;
        }
        for (int i = 0; i<canciones.length; i++){
            if (cancion.equals(canciones[i])){
                canciones[i] = null;
                numCancion--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numCancion; i++){
            mensaje += canciones[i];
        }
        return mensaje;
    }
}
