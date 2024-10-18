package es.ies.puerto;

public class Banco {
    private float saldo;


    public Banco() {
    }

    public Banco(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{" +
            " saldo='" + getSaldo() + "'" +
            "}";
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

}
