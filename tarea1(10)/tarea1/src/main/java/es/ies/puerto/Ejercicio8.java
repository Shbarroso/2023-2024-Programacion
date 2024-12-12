package es.ies.puerto;

import java.util.Vector;

public class Ejercicio8 {
    public static void main(String[] args) {
        Vector<String> vector1 = new Vector<>();
        Vector<String> vector2 = new Vector<>();
        vector1.add("Perro");
        vector1.add("Gato");
        vector2.add("Gato");
        vector2.add("Caballo");
        System.out.println(vector1);
        System.out.println(vector2);
        Vector<String> combinacion = fusionarVectores(vector1, vector2);
        System.out.println(combinacion);
    }
    static Vector<String> fusionarVectores(Vector<String> vector1, Vector<String> vector2){
        if (vector1 == null || vector1.isEmpty()){
            return vector1;
        }
        if (vector2 == null || vector2.isEmpty()){
            return vector2;
        }
        Vector<String> combinacion = new Vector<>(vector1);
        for (String elemento : vector2) {
            if (!combinacion.contains(elemento)) {
                combinacion.add(elemento);
            }
        }
        return combinacion;
    }
}