package es.ies.puerto;

public class Empleado {
    private String nombre;
    private String puesto;
    private float salario;

    public Empleado() {
    }

    public Empleado(String nombre, String puesto, float salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto == null || puesto.trim().isEmpty()){
            this.puesto = "puesto";
        }else {
            this.puesto = puesto;
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario > 0){
            this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre+
                ", puesto: " + puesto +
                ", salari: " + salario;
    }

}
