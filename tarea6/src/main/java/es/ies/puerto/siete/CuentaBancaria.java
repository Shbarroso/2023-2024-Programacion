package es.ies.puerto.siete;

import java.util.Objects;

public class CuentaBancaria {
    private float saldo;
    private String titular;
    private float numero;

    public CuentaBancaria() {
    }

    public CuentaBancaria(float saldo, String titular, float numero) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo > 0){
            this.saldo = saldo;
        }else {
            System.out.println("El saldo no puede ser negativo");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }
    public void depositar(float incremento){
        if (incremento > 0){
            this.saldo += incremento;
            System.out.println("El dinero depositado es: "+incremento);
        }
    }
    public void retirar(float decremento){
        if (decremento > 0 && decremento <= saldo){
            this.saldo -= decremento;
            System.out.println("El dinero retirado es: "+decremento);
        }else if (decremento > saldo) {
            System.out.println("Saldo insuficiente");

        }else{
            System.out.println("En dinero a retirar no puede ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Float.compare(saldo, that.saldo) == 0 && Float.compare(numero, that.numero) == 0 && Objects.equals(titular, that.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo, titular, numero);
    }
}
