package es.ies.puerto.treinta.tres;

import java.util.Objects;

public class Componentes {
    private String Procesador;
    private int Ram;

    public Componentes() {
    }

    public Componentes(String procesador, int ram) {
        Procesador = procesador;
        Ram = ram;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    @Override
    public String toString() {
        return "Componente{" +
                "Procesador='" + Procesador + '\'' +
                ", Ram=" + Ram +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Componentes that = (Componentes) o;
        return Ram == that.Ram && Objects.equals(Procesador, that.Procesador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Procesador, Ram);
    }
}
