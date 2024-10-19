package es.ies.puerto;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float combustible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, float combustible) {
        this.marca = marca;
        this.modelo = modelo;
        setCombustible(combustible);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCombustible() {
        return combustible;
    }

    public void setCombustible(float combustible) {
        if (combustible > 0) {
            this.combustible = combustible;
        }
    }
    public void agregar(float litro) {
        if (litro > 0) {
            this.combustible += litro;
            System.out.println("Combustible agregado: "+litro);
        }
    }
    @Override
    public String toString() {
        return "Marca: " + marca +
                ", modelo: " + modelo +
                ", combustible: " + combustible;
    }
}
