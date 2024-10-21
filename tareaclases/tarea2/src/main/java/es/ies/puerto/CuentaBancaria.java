package es.ies.puerto;
/**
 * Ejercicio 10
 * Crea una clase CuentaBancaria con los atributos titular y saldo. 
 * Implementa un método para transferir dinero entre dos cuentas.
 * Ejercicio 11
 * Modifica la clase CuentaBancaria para que la transferencia 
 * no pueda realizarse si el saldo de la cuenta es insuficiente.
 * @author Shbarroso
 * @version 1.0.0
 */
public class CuentaBancaria {
    private String titular;
    private float saldo;
    /**
     * Constructor por defecto
     */
    public CuentaBancaria() {
    }
    /**
     * Constructor con todas las propiedades
     * @param titular de la cuenta bancaria
     * @param saldo del titular
     */
    public CuentaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    /**
     * Getters and Setters
     */
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void transferir(float cantidad, CuentaBancaria cuenta){
        if (saldo - cantidad < 0) {
            this.saldo -= cantidad;
            System.out.println("Tranferienci hecha");
        }else{
            cuenta.saldo += cantidad;
        }
        
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
