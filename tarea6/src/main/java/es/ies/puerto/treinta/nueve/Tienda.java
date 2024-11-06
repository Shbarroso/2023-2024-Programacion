package es.ies.puerto.treinta.nueve;

import es.ies.puerto.diez.siete.Libro;
import es.ies.puerto.veinte.dos.Articulo;

public class Tienda {
    private String nombre;
    private int numArticulo;
    private Articulo[] articulos;

    public Tienda() {
        numArticulo = 0;
        articulos = new Articulo[5];
    }

    public Tienda(String nombre) {
        this.nombre = nombre;
        numArticulo = 0;
        articulos = new Articulo[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumArticulo() {
        return numArticulo;
    }

    public void setNumArticulo(int numArticulo) {
        this.numArticulo = numArticulo;
    }

    public Articulo[] getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo[] articulos) {
        this.articulos = articulos;
    }
    public boolean addArticulo(Articulo articulo){
        if (articulo == null){
            return  false;
        }
        if (numArticulo >= articulos.length){
            return false;
        }
        articulos[numArticulo] = articulo;
        numArticulo++;
        return  true;
    }
    public  boolean  deleteArticulo(Articulo articulo){
        if (articulo == null) {
            return false;
        }
        if (numArticulo == 0)  {
            return false;
        }
        for (int i = 0; i < articulos.length; i++) {
            if (articulo.equals(articulos[i])) {
                articulos[i] = null;
                numArticulo--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numArticulo; i++){
            mensaje += articulos[i];
        }
        return mensaje;
    }
}
