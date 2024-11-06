package es.ies.puerto.treinta.cuatro;

public class Restaurante {
    private String nombre;
    private int numPlato;
    private Plato[] platos;

    public Restaurante() {
        numPlato = 0;
        platos = new Plato[5];
    }

    public Restaurante(String nombre) {
        this.nombre = nombre;
        numPlato = 0;
        platos = new Plato[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPlato() {
        return numPlato;
    }

    public void setNumPlato(int numPlato) {
        this.numPlato = numPlato;
    }

    public Plato[] getPlatos() {
        return platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }
    public boolean addPlato(Plato plato ){
        if (plato == null){
            return  false;
        }
        if (numPlato >= platos.length){
            return false;
        }
        platos[numPlato] = plato;
        numPlato++;
        return  true;
    }

    public boolean deletePlato(Plato plato){
        if (plato == null){
            return false;
        }
        if (numPlato == 0){
            return false;
        }
        for (int i = 0; i < platos.length; i++) {
            if (plato.equals(platos[i])) {
                platos[i] = null;
                numPlato--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numPlato; i++){
            mensaje += platos[i];
        }
        return mensaje;
    }
}
