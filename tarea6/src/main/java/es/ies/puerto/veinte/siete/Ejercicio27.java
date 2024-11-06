package es.ies.puerto.veinte.siete;

public class Ejercicio27 {
    static Planeta planeta;

    public static void main(String[] args) {
        planeta = new Planeta("H",4,4);
        System.out.println("La gravedad en la superficie de la tierra es de: "+planeta.calcularGavedad());
    }
}
