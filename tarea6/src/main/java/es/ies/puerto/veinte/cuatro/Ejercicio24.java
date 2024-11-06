package es.ies.puerto.veinte.cuatro;

public class Ejercicio24 {
    static Zoologico zoologico;
    static Animal animal;
    static Animal animal2;
    static Animal animal3;

    public static void main(String[] args) {
        animal = new Animal("Perro","g");
        animal2 = new Animal("Gato","J");
        animal3 = new Animal("Gato","J");
        zoologico = new Zoologico("Loropark");


        zoologico.addAnimal(animal);
        zoologico.addAnimal(animal2);
        zoologico.addAnimal(animal3);
        System.out.println(zoologico);

        zoologico.deleteAnimal(animal3);
        System.out.println(zoologico);
    }
}
