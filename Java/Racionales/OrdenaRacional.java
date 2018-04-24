import java.util.*;

public class OrdenaRacional{
   static int MR = 7;
   
   public static void main (String args[]){
      Racional arreglo[] = new Racional[MR];
      
      try{
         for (int i = 0; i<MR; i++){
            int n,d;
            n = (int)(Math.random() * 21 +1);
            d = (int)(Math.random() * 21 +1);
            arreglo[i] = new Racional(n,d);
         }   
      }catch (Exception e){
      }
      
      System.out.println("Lista de Numeros Racionales");
      escribe(arreglo);
      Arrays.sort(arreglo);
      System.out.println("\nLista Ordenada de Numeros Racionales");
      escribe(arreglo);
   }
   
   static void escribe(Racional r[]){
      for (int i=0; i<r.length; i++){
         System.out.print(r[i] + "  ");
      }
   }
}