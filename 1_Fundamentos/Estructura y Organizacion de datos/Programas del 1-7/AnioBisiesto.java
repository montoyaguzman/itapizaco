import java.io.*;
public class AnioBisiesto
{
   public static void main (String a[]) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader (System.in)); 
      
      int anio;
      
      System.out.print("Indicar un año; ");
      anio = Integer.parseInt(br.readLine());
      
      if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)
      System.out.println("El año es bisiesto");
      else
      System.out.println("El año no es bisiesto");
   }
}