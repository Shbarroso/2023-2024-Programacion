package es.ies.puerto;

public class Ejercicio1 {
    public static void main(String[] args) {
    
    System.out.println("NUmero caracteres:"+contarNumeros(555));    
    }

    /**
     * Funcion que cuenta el numero de digitos
     * @return
     */
    static int contarNumeros(Integer numero){
        if(numero==null || numero<1){
            return 0;
        }
        return String.valueOf(numero).length();
    }


}
