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

        bibliotecaDigital.buscarEbook(eBook2);
        System.out.println("¿Existe este Ebook2?"+bibliotecaDigital.buscarEbook(eBook));
        
        bibliotecaDigital.actualizar(new EBook("9","h",6));
        System.out.println(bibliotecaDigital);
    }
}
