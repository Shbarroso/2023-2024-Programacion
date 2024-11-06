package es.ies.puerto.treinta.seis;

public class Ejercicio36 {
    static Moneda moneda;
    static Moneda moneda2;
    static ColeccionMonedas coleccionMonedas;

    public static void main(String[] args) {
        moneda = new Moneda("H",3);
        moneda2 = new Moneda("G",7);
        coleccionMonedas = new ColeccionMonedas("Hola");

        coleccionMonedas.addMoneda(moneda);
        coleccionMonedas.addMoneda(moneda2);
        System.out.println(coleccionMonedas);

    }
}
