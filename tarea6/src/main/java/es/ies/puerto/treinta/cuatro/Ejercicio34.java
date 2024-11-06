package es.ies.puerto.treinta.cuatro;

public class Ejercicio34 {
    static Plato plato;
    static Plato plato2;
    static  Restaurante restaurante;

    public static void main(String[] args) {
        plato = new Plato("H",3,"Cuadrado");
        plato2 = new Plato("J",4,"G");
        restaurante = new Restaurante("Hola");

        restaurante.addPlato(plato);
        restaurante.addPlato(plato2);
        System.out.println(restaurante);
        restaurante.deletePlato(plato2);
        System.out.println(restaurante);
    }
}
