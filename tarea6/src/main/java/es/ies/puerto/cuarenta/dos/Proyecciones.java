package es.ies.puerto.cuarenta.dos;

import java.util.Objects;

public class Proyecciones {
    private String ciudad;
    private String hora;
    private String fecha;

    public Proyecciones() {
    }

    public Proyecciones(String ciudad, String hora, String fecha) {
        this.ciudad = ciudad;
        this.hora = hora;
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Proyecciones{" +
                "ciudad='" + ciudad + '\'' +
                ", hora='" + hora + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proyecciones that = (Proyecciones) o;
        return Objects.equals(ciudad, that.ciudad) && Objects.equals(hora, that.hora) && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, hora, fecha);
    }
}
