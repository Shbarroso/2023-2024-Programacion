package es.ies.puerto;

public class Alumno {
    private String nombre;
    private float nota;

    public Alumno() {
    }

    public Alumno(String nombre, float nota) {
        this.nombre = nombre;
        setNota(nota);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        if (nota < 0 || nota > 10) {
            this.nota = 10;
        }else{
            this.nota = nota;
        }
    }

    @Override
    public String toString() {
        return " Nombre:" + getNombre()+
            ", nota:" + getNota();
    }
    public void apobar(){
        if (nota > 6) {
            System.out.println("Estas aprobado");
        }else{
            System.out.println("No estas aprobado");
        }
    }
}
