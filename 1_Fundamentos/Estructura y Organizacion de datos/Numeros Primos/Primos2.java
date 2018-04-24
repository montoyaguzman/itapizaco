import java.io.*;

public class Primos2
{
   public static void main (String a[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      System.out.print("Dame limite: ");
      int n = Integer.parseInt(br.readLine());
      
            
      int i,j;
      int modulo = 0;
      int cont;
      
      //System.out.println("\nLos primeros "+n+" números primos son:\n");
      
      for (i = 3; i <= n; i++)
      {
         cont = 0;
         System.out.print(i+": ");
         for(j = 1; j <= i; j++)
         {
            modulo = i % j;
            
            if (modulo == 0)
            {
               cont++;
            }
            if (cont > 2)
            {
               System.out.print("No es primo y se evaluo´");
               break;
            }
            else if (cont <= 2 && i == j)
            {
                  System.out.print("Es primo y se evaluó ");  
            }
         }
         System.out.print(", se hicieron " + cont + " evaluaciones \n");
      }
   }
}
