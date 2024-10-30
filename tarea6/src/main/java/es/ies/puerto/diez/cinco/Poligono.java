package es.ies.puerto.diez.cinco;

import java.util.Objects;

public class Poligono {
    private float area;

    public Poligono() {
    }

    public Poligono(float area) {
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "area=" + area +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poligono poligono = (Poligono) o;
        return Float.compare(area, poligono.area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }
}
