package es.ies.puerto.veinte;

public class Factura {
    private String producto;
    private int cantidad;
    private float precio;

    public Factura() {
    }

    public Factura(String producto, int cantidad, float precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public double calcularTotal() {
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
