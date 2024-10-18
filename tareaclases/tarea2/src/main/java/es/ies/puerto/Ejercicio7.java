package es.ies.puerto;

public class Ejercicio7 {

    static private Banco banco;
     public static void main(String[] args) {
        banco = new Banco(1000);
        banco.depositar(500);
        banco.retirar(200);
        System.out.println("Saldo actual: "+banco.getSaldo());
     }
}
