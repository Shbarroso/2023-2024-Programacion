package es.ies.puerto.treinta.tres;

public class Ejercicio33 {
    static Componentes componente;
    static Componentes componente2;
    static Computadora computadora;

    public static void main(String[] args) {
        componente = new Componentes("H",2);
        componente2 = new Componentes("J",3);
        computadora = new Computadora("Hola","H","J");

        computadora.addComponente(componente);
        computadora.addComponente(componente2);
        System.out.println(computadora);
    }
}
