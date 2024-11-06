package es.ies.puerto.treinta.siete;

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private String resultado;

    public Partido() {
    }

    public Partido(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultado = "0-0";
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public void actualizarResultado(int golesLocal, int golesVisitante) {
        this.resultado = golesLocal + " - " + golesVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal='" + equipoLocal + '\'' +
                ", equipoVisitante='" + equipoVisitante + '\'' +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}
