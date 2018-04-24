import java.io.*;

public class Primos
{
   public static void main (String a[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      System.out.print("Dame n: ");
      int n = Integer.parseInt(br.readLine());
      
      int i,j;
      int modulo = 0;
      int cont;
      
      System.out.println("\nLos primeros "+n+" números primos son:\n");
      
      for (i = 3; i <= n; i++)
      {
         cont = 0;
         for(j = 1; j <= i; j++)
         {
            modulo = i % j;
            
            if (modulo == 0)
            {
               cont++;
            }
            if (cont > 2)
            {
               break;
            }
            else if (cont <= 2 && i == j)
            {
                  System.out.print("\t"+i);  
            }
         }
         //cont = 0;
      }
   }
}
