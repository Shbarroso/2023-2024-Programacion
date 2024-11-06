package es.ies.puerto.veinte.ocho;

public class Ejercicio28 {
    static Ciudad ciudad;
    static Ciudad ciudad2;

    public static void main(String[] args) {
        ciudad = new Ciudad("H","H",2);
        ciudad2 = new Ciudad("J","J",2);
        System.out.println("¿Son ihuales la poblacion de H y J?"+ciudad2.equals(ciudad2));
    }
}
