package es.ies.puerto;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 123;

        if (isNumeroFuerza(numero)) {
            System.out.println("Este numero es digo de la fuerza");
        } else {
            System.out.println("Este numero NO es digo de la fuerza");
        }
        

    }
    static boolean isNumeroFuerza(Integer numero){
        if(numero==null || numero<1){
            return false;
        }
        int tamanio = String.valueOf(numero).length();
        int suma=0;
        for(int i=0; i<tamanio;i++){
            int digito = String.valueOf(numero).charAt(i);
            suma += digito;
        }
        int resto = suma%tamanio;
        if (resto==0){
            return true;
        }
        return false;
        //return resto == 0 ? true: false;
    }
}
