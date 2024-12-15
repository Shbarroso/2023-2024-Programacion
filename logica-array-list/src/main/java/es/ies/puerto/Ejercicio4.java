package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio4 {
  
    static List<Integer> reduceList = new ArrayList<>(Arrays.asList(5, 1, 8, 3, 2));

  public static void main(String[] args) {
      System.out.println(reduceToSizeN(reduceList, 3));
  } 
  
  public static List<Integer> reduceToSizeN(List<Integer> list, int n) {
      Collections.sort(list);
      while (list.size() > n){
          list.remove(0);
      }
        return list;
    }

}
