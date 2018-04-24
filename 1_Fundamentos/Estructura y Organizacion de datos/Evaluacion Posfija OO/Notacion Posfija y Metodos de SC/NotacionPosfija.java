import java.io.*;
import java.lang.*;

public class NotacionPosfija
{
   public static void main (String a[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int tope;
      char c = ' ';
      
      System.out.print("Ingrese su cadena posfija: ");
      String cadena = br.readLine();
      
      int n = cadena.length(); 
      int pila[] = new int[n];
            
      System.out.print("Su cadena: "+cadena+"\n");
      
      for (int i = 0; i <= cadena.length()-1; i++)
      {
         c = cadena.charAt(i);
         if (c.isLetter(char) == true)  //http://lineadecodigo.com/java/validar-si-un-dato-es-numerico-en-java/
         {
            System.out.print("mjh");
         }
         else
         {
            System.out.print("ñaña");
         }
      }
      
   }
}