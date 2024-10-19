package es.ies.puerto;

public class Producto {
    private String nombre;
    private float precio;
    private float stock;


    public Producto() {
    }

    public Producto(String nombre, float precio, float stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        if (precio >0) {
            this.precio = precio;
        }
    }

    public float getStock() {
        return this.stock;
    }

    public void setStock(float stock) {
        if (stock >=0) {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
            ", precio: " + getPrecio() +
            ", stock: " + getStock();
    }

}
