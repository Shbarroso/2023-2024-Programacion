package es.ies.puerto.veinte.cuatro;

public class Ejercicio24 {
    static Zoologico zoologico;
    static Animal animal;

    public static void main(String[] args) {
        animal = new Animal("H","g");
        zoologico = new Zoologico("Loropark");
        zoologico.addAnimal(animal);
        System.out.println(zoologico);
    }
}
