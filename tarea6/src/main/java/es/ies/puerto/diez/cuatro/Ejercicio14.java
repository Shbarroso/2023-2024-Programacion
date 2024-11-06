package es.ies.puerto.diez.cuatro;

public class Ejercicio14 {
    static Coordenadas coordenadas;
    static Coordenadas coordenadas2;
    public static void main(String[] args) {
        coordenadas = new Coordenadas(0, 0);
        coordenadas2 = new Coordenadas(3, 4);

        System.out.println("Coordenada 1: " + coordenadas);
        System.out.println("Coordenada 2: " + coordenadas2);
        System.out.println("Distancia entre c1 y c2: " + coordenadas.distancia(coordenadas2));

        coordenadas.desplazar(45, 5);
        System.out.println("Coordenada 1 después de desplazar: " + coordenadas);
    }

}
