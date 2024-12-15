package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * @version 1.0.0
 * Crea una lista de listas donde cada sublista representa una categoría de productos.
 * Implementa métodos para agregar productos a una categoría, mover un producto entre categorías, y eliminar categorías vacías.
 */
public class Ejercicio15 {
    static List<List<String>> productos = new ArrayList<>();
    static int electronica = 0;
    static int ropa = 1;
    static int libro = 2;
    static  int alimentacion = 3;
public static void main(String[] args) {
    productos.add(crearLista());
    productos.add(crearLista());
    productos.add(crearLista());
    System.out.println(productos);
    //productos.get(ropa).add("Pantaolon");
    addproducto(productos.get(ropa), "pantalon");
    addproducto(productos.get(ropa), "camiseta");
    addproducto(productos.get(ropa), "polo");
    addproducto(productos.get(electronica), "casco");
    System.out.println(productos);
    moverproducto(productos.get(electronica),productos.get(ropa),"casco");
    addproducto(productos.get(libro), "El Principito");
    System.out.println(productos);
    productos.add(crearLista());
    addproducto(productos.get(alimentacion), "Papa");
    System.out.println(productos);

    }

    public static List<String> crearLista(){

        return new ArrayList<>();
    }

    public static boolean addproducto(List<String> lista, String producto){
        if (lista == null) {
            return false;
        }
        if (producto == null) {
            return false;
        }

        return lista.add(producto);
    }

    public static boolean deleteProducto(List<String> lista, String producto){
        if (lista == null || lista.isEmpty()) {
            return false;
        }
        if (producto == null) {
            return false;
        }

        return lista.remove(producto);
    }

    public static boolean moverproducto(List<String> listaOrigen, List<String> listaDestino, String producto){
        if (!listaOrigen.contains(producto) || listaDestino.contains(producto)) {
            return false;
        }
        deleteProducto(listaOrigen, producto);
        return addproducto(listaDestino, producto);
    }
    public static boolean deleteisEmpty(List<List<String>> lista, int posicion){
        if (lista == null || lista.isEmpty()) {
            return false;
        }
        if(lista.get(posicion).isEmpty()){
            lista.remove(posicion);
            return true;
        }
        return false;
    }
}