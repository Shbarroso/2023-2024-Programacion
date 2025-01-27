package es.ies.puerto;

public class Consejo {
    private Mago[] magos;
    private int totalMagos = 0;
    public Consejo() {
        this.magos = new Mago[10];
    }
    public Consejo(int numeroMagos) {
        this.magos = new Mago[numeroMagos];
    }

    public boolean agregarMago(Mago mago) {
        if (mago == null) {
            return false;
        } 
        if (totalMagos >= magos.length) {
            return false;
        }
        magos[totalMagos] = mago;
        totalMagos++;
        return true;
    }

    public boolean eliminarMago() {
         
        if (totalMagos == 0) {
            return false;
        }
        magos[totalMagos-1] = null;
        totalMagos--;
        return true;
    }
    
}
