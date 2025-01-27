package es.ies.puerto;
import java.util.Objects;

public class Mago {
    private String nombre;
    private int nivel;
    private int mana;

    /**
     * Constructor por defecto
     */
    public Mago(){}

    /**
     * Contructor con propiedades
     * @param nombre
     * @param nivel
     * @param mana
     */
    public Mago(String nombre, int nivel, int mana) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.mana = mana;
    }
    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nivel='" + getNivel() + "'" +
            ", mana='" + getMana() + "'" +
            "}";
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mago)) {
            return false;
        }
        Mago mago = (Mago) o;
        return Objects.equals(nombre, mago.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel, mana);
    }
    /**
     * 
     * @param valor a restar
     * @return
     */
    public boolean lanzarHechizo(int valor) {
        if((this.mana - valor) > 0){
            this.mana -= valor;
            return true;
        }
        return false;
    }

    public int calcularDanio(){
        return this.nivel*10;
    }

    public void recargar(int cantidad) {
        this.mana += cantidad;
    }

}
