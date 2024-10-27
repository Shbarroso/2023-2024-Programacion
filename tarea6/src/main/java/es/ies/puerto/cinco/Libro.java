package es.ies.puerto.cinco;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return paginas == libro.paginas && Objects.equals(titulo, libro.titulo)
                && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, paginas);
    }
}
