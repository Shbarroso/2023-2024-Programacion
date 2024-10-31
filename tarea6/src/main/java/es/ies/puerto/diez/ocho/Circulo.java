package es.ies.puerto.diez.ocho;

public class Circulo {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return this.radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void area(){
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("Area: "+area);
    }
    public void perimetro(){
        double perimetro = 2 * (Math.PI + radio);
        System.out.println("Perimetro: "+perimetro);
    }

    @Override
    public String toString() {
        return "Radio: " + getRadio();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circulo)) {
            return false;
        }
        Circulo circulo = (Circulo) o;
        return radio == circulo.radio;
    }


}
