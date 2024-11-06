package es.ies.puerto.treinta.seis;

public class ColeccionMonedas {
    private String nombre;
    private int numColeccion;
    private Moneda[] monedas;

    public ColeccionMonedas() {
        numColeccion = 0;
        monedas = new Moneda[5];
    }

    public ColeccionMonedas(String nombre) {
        this.nombre = nombre;
        numColeccion = 0;
        monedas = new Moneda[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumColeccion() {
        return numColeccion;
    }

    public void setNumColeccion(int numColeccion) {
        this.numColeccion = numColeccion;
    }

    public Moneda[] getMonedas() {
        return monedas;
    }

    public void setMonedas(Moneda[] monedas) {
        this.monedas = monedas;
    }

    public boolean addMoneda(Moneda moneda){
        if (moneda == null){
            return false;
        }
        if (numColeccion >= monedas.length){
            return false;
        }
        monedas[numColeccion] = moneda;
        numColeccion++;
        return  true;
    }

    public boolean deleteMoneda(Moneda moneda){
        if (moneda == null){
            return false;
        }
        if (numColeccion == 0)  {
            return false;
        }
        for (int i = 0; i < monedas.length; i++) {
            if (moneda.equals(monedas[i])) {
                monedas[i] = null;
                numColeccion--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numColeccion; i++){
            mensaje += monedas[i];
        }
        return mensaje;
    }
}
