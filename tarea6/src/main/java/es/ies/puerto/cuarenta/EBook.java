package es.ies.puerto.cuarenta;

import java.util.Objects;

public class EBook {
    private String nombre;
    private String isbn;
    private int anio;

    public EBook() {
    }

    public EBook(String nombre, String isbn, int anio) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "nombre='" + nombre + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anio=" + anio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EBook eBook = (EBook) o;
        return anio == eBook.anio && Objects.equals(nombre, eBook.nombre) && Objects.equals(isbn, eBook.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, isbn, anio);
    }
}
