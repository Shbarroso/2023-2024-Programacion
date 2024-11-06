package es.ies.puerto.treinta;

/**
 * falta listar las canciones.
 */
public class Ejercicio30 {
    static Playlist playlist;
    static Cancion cancion;
    static Cancion cancion2;

    public static void main(String[] args) {
        cancion = new Cancion("f","H");
        cancion2 = new Cancion("G","K");
        playlist = new Playlist("H");

        playlist.addCancion(cancion);
        playlist.addCancion(cancion2);
        System.out.println(playlist);
        playlist.deletecancion(cancion2);
        System.out.println(playlist);
    }
}
