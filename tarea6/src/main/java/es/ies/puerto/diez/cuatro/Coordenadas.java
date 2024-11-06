package es.ies.puerto.diez.cuatro;


public class Coordenadas {
    private int x;
    private int y;

    public Coordenadas() {
    }

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Coordenadas otraCoordenadas) {
        double dx = this.x - otraCoordenadas.x;
        double dy = this.y - otraCoordenadas.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Método para desplazar la coordenada a partir de un ángulo y una distancia
     * @param angulo
     * @param distancia
     */
    public void desplazar(double angulo, double distancia) {
        double anguloRad = Math.toRadians(angulo);
        this.x += distancia * Math.cos(anguloRad);
        this.y += distancia * Math.sin(anguloRad);
    }

    @Override
    public String toString() {
        return "Coordenadas{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
