package es.ies.puerto.veinte;

public class Ejercicio20 {
    static Factura factura;

    public static void main(String[] args) {
        factura = new Factura("Manzana",5,9);
        System.out.println(factura);
        System.out.println("Tota de la factura: "+factura.calcularTotal());
    }
}
