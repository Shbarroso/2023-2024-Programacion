package es.ies.puerto.treinta.tres;

import java.util.Arrays;

public class Computadora {
    private String nombre;
    private String marca;
    private String modelo;
    private int numComponente;
    private Componentes[] componentes;

    public Computadora() {
        numComponente = 0;
        componentes = new Componentes[5];
    }

    public Computadora(String nombre, String marca, String modelo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        numComponente = 0;
        componentes = new Componentes[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getNumComponente() {
        return numComponente;
    }

    public void setNumComponente(int numComponente) {
        this.numComponente = numComponente;
    }

    public Componentes[] getComponentes() {
        return componentes;
    }

    public void setComponentes(Componentes[] componentes) {
        this.componentes = componentes;
    }

    public boolean addComponente(Componentes componente){
        if (componente == null){
            return false;
        }
        if (numComponente >= componentes.length){
            return false;
        }
        componentes[numComponente] = componente;
        numComponente++;
        return  true;
    }

    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre+
                "Modelo: "+modelo+"Marca: "+marca;
        for (int i = 0; i<numComponente; i++){
            mensaje += componentes[i];
        }
        return mensaje;
    }
}
