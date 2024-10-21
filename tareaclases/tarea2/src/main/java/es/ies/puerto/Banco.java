package es.ies.puerto;
/**
 * Ejercicio 7
 * Crea una clase Banco con un atributo privado saldo. 
 * Implementa métodos para depositar y retirar dinero, 
 * y un método getter para consultar el saldo.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Banco {
    private float saldo;

    /**
     * Constructor por defecto
     */

    public Banco() {
    }
    /**
     * Constructor con todas las propiedades
     * @param saldo del cliente
     */
    
     public Banco(float saldo) {
        this.saldo = saldo;
    }
    /**
     * Getters and Setters
     */
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Has depositado: "+cantidad);
        }
    }

    public void retirar (float cantidad){
        if (cantidad >0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Has retirado: "+cantidad);
        }
    }

    @Override
    public String toString() {
        return "{" +
            " saldo='" + getSaldo() + "'" +
            "}";
    }
}
