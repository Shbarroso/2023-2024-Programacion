package es.ies.puerto;

public class CuentaBancaria {
    private String titular;
    private float saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

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

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
