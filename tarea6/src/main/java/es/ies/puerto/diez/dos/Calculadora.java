package es.ies.puerto.diez.dos;
import java.util.Objects;

public class Calculadora {
    private float numero1;
    private float numero2;


    public Calculadora() {
    }

    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return this.numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return this.numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public void sumar(){
        float suma = numero1 + numero2;
        System.out.println("LA suma es: "+suma);
    }
    public void resta(){
        float resta = numero1 - numero2;
        System.out.println("La resta es: "+resta);
    }
    public void multiplicacion() {
        float multiplicacion = numero1 * numero2;
        System.out.println("La multiplicacion es: "+multiplicacion);
    }
    public void dividir(){
        float dividir = numero1/numero2;
        System.out.println("La division es: "+dividir);
    }

    @Override
    public String toString() {
        return "{" +
            " numero1='" + getNumero1() + "'" +
            ", numero2='" + getNumero2() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Calculadora)) {
            return false;
        }
        Calculadora calculadora = (Calculadora) o;
        return numero1 == calculadora.numero1 && numero2 == calculadora.numero2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero1, numero2);
    }


}
