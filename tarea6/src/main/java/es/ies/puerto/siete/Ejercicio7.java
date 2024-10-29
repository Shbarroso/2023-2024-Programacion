package es.ies.puerto.siete;

public class Ejercicio7 {
    static private CuentaBancaria cuentaBancaria;

    public static void main(String[] args) {
        cuentaBancaria = new CuentaBancaria(200,"Samuel",3);
        System.out.println(cuentaBancaria);
        cuentaBancaria.depositar(100);
        cuentaBancaria.retirar(400);
    }
}
