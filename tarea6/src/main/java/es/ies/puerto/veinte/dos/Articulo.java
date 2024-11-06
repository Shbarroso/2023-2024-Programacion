package es.ies.puerto.veinte.dos;

import java.util.Objects;

public class Articulo {
    private String nombre;
    private float precio;
    private float stock;

    public Articulo() {
    }

    public Articulo(String nombre, float precio, float stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        if (stock > 0){
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo");        }
    }

    public void aumentarStock(float aumento){
        if (aumento > 0){
            this.stock += aumento;
            System.out.println("El stock aumentado es: "+aumento);
        }
    }
    public void disminuirStock(float disminuir){
        if (disminuir > 0 && disminuir <= stock){
            this.stock -= disminuir;
            System.out.println("El stock disminuido es: "+disminuir);
        } else if (disminuir > stock){
            System.out.println("Stock insuficiente");
        } else{
            System.out.println("El stock disminuido no puede ser negativo.");
        }
    }
    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return nombre == articulo.nombre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, stock);
    }
}
