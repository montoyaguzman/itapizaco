import java.io.*;
public class SumaPI
{
   public static void main (String a[]) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader (System.in)); 
      
      int x;
      int y;
      
      System.out.print("¡Realizemos la suma de dos números!\n");
      
      System.out.print("Ingrese x: ");
      x = Integer.parseInt(br.readLine()); 
      System.out.print("Ingrese y: ");
      y = Integer.parseInt(br.readLine()); 
      
      int suma = x + y;
      System.out.print(x+" + "+y+" = "+suma);
      
      if (suma%2==0)
      System.out.print("\nLa suma es par");
      else
      System.out.print("\nLa suma es inpar");
   }
}