package es.ies.puerto;
/**
 * Ejercicio 15
 * Crea una clase Producto con los atributos nombre, precio y stock. 
 * El precio no puede ser negativo y el stock debe ser al menos 0.
 * Ejercicio 16
 * Añade a la clase Producto un método para vender productos, que disminuya 
 * el stock y retorne el total de la venta.
 * @author Shbarroso
 * @version 1.0.0
 */
public class Producto {
    private String nombre;
    private float precio;
    private float stock;

    /**
     * Constructor por defecto
     */

    public Producto() {
    }
    /**
     * Constructor con todas las propiedades
     * @param nombre del producto
     * @param precio del producto
     * @param stock del producto
     */

    public Producto(String nombre, float precio, float stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }
    /**
     * Getters and Setters
     */
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
