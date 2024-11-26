package es.ies.puerto.cuarenta;

import es.ies.puerto.diez.siete.Libro;
import es.ies.puerto.dos.Producto;

public class BibliotecaDigital {
    private String nombre;
    private int numEBook;
    private EBook[] eBooks;

    public BibliotecaDigital() {
        numEBook = 0;
        eBooks = new EBook[5];
    }

    public BibliotecaDigital(String nombre) {
        this.nombre = nombre;
        numEBook = 0;
        eBooks = new EBook[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEBook() {
        return numEBook;
    }

    public void setNumEBook(int numEBook) {
        this.numEBook = numEBook;
    }

    public EBook[] geteBooks() {
        return eBooks;
    }

    public void seteBooks(EBook[] eBooks) {
        this.eBooks = eBooks;
    }
    public boolean addEBook(EBook eBook){
        if (eBook == null){
            return  false;
        }
        if (numEBook >= eBooks.length){
            return false;
        }
        eBooks[numEBook] = eBook;
        numEBook++;
        return  true;
    }
    public  boolean  deleteEbook(EBook eBook){
        if (eBook == null) {
            return false;
        }
        if (numEBook == 0)  {
            return false;
        }
        for (int i = 0; i < eBooks.length; i++) {
            if (eBook.equals(eBooks[i])) {
                eBooks[i] = null;
                numEBook--;
                return true;
            }
        }
        return false;
    }

    public boolean buscarEbook(EBook eBookBuscado) {
       for(int i = 0; i<eBooks.length; i++){
           EBook eBook = eBooks[i];
           if (eBook!= null) {
               if (eBook.equals(eBookBuscado)) {
               return true;
               }
           }
       }
       return false;
   }
   public boolean actualizar(EBook EBookActualizado) {
    for(int i = 0; i<eBooks.length; i++){
        EBook eBook = eBooks[i];
        if (eBook!= null) {
            if (eBook.equals(EBookActualizado)) {
                eBooks[i] = EBookActualizado;
            return true;
            }
        }
    }
    return false;
}

    public EBook buscarEbooks(String nombre) {
        for (int i = 0; i < numEBook; i++) {
            if (eBooks[i] != null && eBooks[i].getNombre().equalsIgnoreCase(nombre)) {
                return eBooks[i];
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;

        for (int i = 0; i < numEBook; i++){
            mensaje += eBooks[i];
        }
        return mensaje;
    }
}
