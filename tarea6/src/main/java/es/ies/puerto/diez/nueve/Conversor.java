package es.ies.puerto.diez.nueve;

public class Conversor {
    private float metro;
    private float kilimetros;

    public Conversor() {
    }

    public Conversor(float metro, float kilimetros) {
        this.metro = metro;
        this.kilimetros = kilimetros;
    }

    public float getMetro() {
        return metro;
    }

    public void setMetro(float metro) {
        this.metro = metro;
    }

    public float getKilimetros() {
        return kilimetros;
    }

    public void setKilimetros(float kilimetros) {
        this.kilimetros = kilimetros;
    }

    public double metrosAPies(double metros) {
        return metros * 3.28084;
    }

    public double kilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }

    @Override
    public String toString() {
        return "Conversor{" +
                "metro=" + metro +
                ", kilimetros=" + kilimetros +
                '}';
    }

}
