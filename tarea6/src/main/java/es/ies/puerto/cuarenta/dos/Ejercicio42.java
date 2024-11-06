package es.ies.puerto.cuarenta.dos;

public class Ejercicio42 {
    static Proyecciones proyecciones;
    static  Proyecciones proyecciones2;
    static  Cine cine;

    public static void main(String[] args) {
        proyecciones = new Proyecciones("F","G","b");
        proyecciones2 = new Proyecciones("M","K","b");
        cine = new Cine("Hola");

        cine.addProyeccion(proyecciones);
        cine.addProyeccion(proyecciones2);
        System.out.println(cine);

        cine.deleteProyeccion(proyecciones2);
        System.out.println(cine);
    }
}
