package es.ies.puerto.cuarenta;

public class Ejercicio40 {
    static EBook eBook;
    static EBook eBook2;
    static BibliotecaDigital bibliotecaDigital;

    public static void main(String[] args) {
        eBook = new EBook("e","h",3);
        eBook2 = new EBook("f","k",4);
        bibliotecaDigital = new BibliotecaDigital("Hola");

        bibliotecaDigital.addEBook(eBook);
        bibliotecaDigital.addEBook(eBook2);
        System.out.println(bibliotecaDigital);

        bibliotecaDigital.deleteEbook(eBook2);
        System.out.println(bibliotecaDigital);
    }
}
