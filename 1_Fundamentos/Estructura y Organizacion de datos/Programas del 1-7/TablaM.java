import java.io.*;

public class TablaM
{
   public static void main (String []a) throws IOException
   {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("¿Qué tabla de multiplicar desea? ");
      int numero = Integer.parseInt(br.readLine());
        
      System.out.print("La tabla de Multiplicar del "+numero+"\n");
      for (int i = 1; i<=10; i++)
      {
         System.out.println(numero + " x "+ i + " = "+(numero*i));
      }
   
   }
}