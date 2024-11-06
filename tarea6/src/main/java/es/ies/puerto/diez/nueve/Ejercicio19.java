package es.ies.puerto.diez.nueve;

public class Ejercicio19 {
    static Conversor conversor;

    public static void main(String[] args) {
        conversor = new Conversor(2,4);
        System.out.println("Pies: "+conversor.metrosAPies(conversor.getMetro()));
        System.out.println("Millas: "+conversor.kilometrosAMillas(conversor.getKilimetros()));
    }

}
