package es.ies.puerto;

public class Libro {
    private String titular;
    private String autor;
    private int paginas;


    public Libro() {
    }

    public Libro(String titular, String autor, int paginas) {
        this.titular = titular;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "{" +
            " titular='" + getTitular() + "'" +
            ", autor='" + getAutor() + "'" +
            ", paginas='" + getPaginas() + "'" +
            "}";
    }

}
