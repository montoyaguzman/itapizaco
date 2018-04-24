import java.io.*;
import java.util.*;

public class Prueba2
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int resp,tama;
      
      System.out.print("Ingresa cadena: ");
      String cadena = br.readLine();
      
      for(int i = 0; i < cadena.length(); i++)
      {
         //System.out.println(cadena.charAt(i));
         char aux = cadena.charAt(i);
         if (Character.isDigit(aux) == true)
         {
            System.out.print("\nEso es un numero");
         }
         else
         {
            System.out.print("\nEso no es un numero");      
         }
      }  
  
 
   }
}

