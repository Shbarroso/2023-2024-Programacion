package es.ies.puerto;

public class Ejercicio2 {
    static private Persona persona2;

    public static void main(String[] args) {
        persona2 = new Persona("Maria", 25);
        persona2.mostarInfo2();
        persona2.setEdad(26);
        System.out.println(persona2);
    }
}
