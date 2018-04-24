import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SortArrayList1{
   
   private static ArrayList<Integer> arrayListInt = new ArrayList<>();
   
   public static void main (String args[]){
   
      //Datos en el ArrayList
      arrayListInt.add(3);
      arrayListInt.add(6);
      arrayListInt.add(2);
      arrayListInt.add(4);
      arrayListInt.add(1);
      arrayListInt.add(8);
      arrayListInt.add(5);
      arrayListInt.add(7);
      arrayListInt.add(9);
      
      //Imprime arreglo desordenado
      printArrayListInt("ArrayList desordenado: \n");
      
      //Ordena de menor a mayor
      Comparator<Integer> comparador = Collections.reverseOrder();
      Collections.sort(arrayListInt,comparador);
      printArrayListInt("ArrayList ordenado de mayor a menor\n");
   }
   
   private static void printArrayListInt(String ca){
      Iterator<Integer> itrArrayList = arrayListInt.iterator();
      String cad=ca;
      int posicion = 1;
      
      while(itrArrayList.hasNext()){
         cad+="\nPosicion("+posicion+") = "+itrArrayList.next();
         posicion++;
      }
      ES.escribe(cad);
   }   
}


