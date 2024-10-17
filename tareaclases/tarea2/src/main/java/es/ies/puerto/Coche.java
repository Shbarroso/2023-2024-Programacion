package es.ies.puerto;

public class Coche {
    private String  marca;
    private String modelo;
    private int anio;

    public Coche() {
    }
    
    public Coche(String marca) {
        this.marca = marca;
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) { 
        if (anio <= 1886) {
            this.anio = 1886;
        }else{
            this.anio = anio;
        }
    }

    public void mostarInformacion(){
        System.out.println("Marca: "+marca+", Modelo: "+modelo+ ", Años: "+anio);
    }

    public void mostarInfo(){
        System.out.println("Marca: "+marca+", Modelo: "+modelo+ ", Años: "+anio);
    }


    @Override
    public String toString() {
        return"Marca: " + getMarca()+
            ", Modelo: " + getModelo() +
            ", año: " + getAnio();
    }


}
