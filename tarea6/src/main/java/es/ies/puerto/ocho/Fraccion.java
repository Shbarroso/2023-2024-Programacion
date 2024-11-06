package es.ies.puerto.ocho;

public class Fraccion {
    private float numerador;
    private float denominador;

    public Fraccion() {
    }

    public Fraccion(float numerador, float denominador) {
        this.numerador = numerador;
        setDenominador(denominador);
    }

    public float getNumerador() {
        return numerador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }

    public float getDenominador() {
        return denominador;
    }

    public void setDenominador(float denominador) {
        if (denominador == 0){
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }

    public Fraccion suma(Fraccion fraccion){
        float nuevoNumerador = (this.numerador * fraccion.denominador) + (fraccion.numerador * this.denominador);
        float nuevoDenominador = this.denominador * fraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion resta(Fraccion fraccion){
        float nuevoNumerador = (this.numerador * fraccion.denominador) - (fraccion.numerador * this.denominador);
        float nuevoDenominador = this.denominador * fraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
    public Fraccion multiplicar(Fraccion fraccion) {
        float nuevoNumerador = this.numerador * fraccion.numerador;
        float nuevoDenominador = this.denominador * fraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividir(Fraccion fraccion) {
        float nuevoNumerador = this.numerador * fraccion.numerador;
        float nuevoDenominador = this.denominador * fraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public String toString(){
        return numerador + " / " +denominador;
    }

}
