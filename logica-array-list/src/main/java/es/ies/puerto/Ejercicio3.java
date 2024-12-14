package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    static List<String> words = new ArrayList<>(Arrays.asList("Hola", "Mundo", "Java"));

    public static void main(String[] args) {
        System.out.println(wordLengths(words));
    }

    public static List<Integer> wordLengths(List<String> words) {
        if (words == null|| words.isEmpty()){
            return new ArrayList<>();
        }
        List<Integer> numero = new ArrayList<>();
        for (String palabra: words){
            numero.add(palabra.length());
        }

        return numero;
    }
}
