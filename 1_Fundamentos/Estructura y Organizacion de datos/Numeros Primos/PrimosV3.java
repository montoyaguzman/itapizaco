import java.io.*;

public class PrimosV3
{
   public static void main (String a[]) throws IOException
   {
      
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int i,j,cont,eva,modulo = 0;
      
      System.out.print("Indicar n: ");
      int n = Integer.parseInt(br.readLine());
      
      for(i = 3; i <= n; i++)
      {  
         cont = 0;
         eva = 0;
         System.out.print("\t"+i+" ");
         
         for (j = 1; j <= i; j++)
         {
            eva++;
            modulo = i % j;
            
            if (modulo == 0)
            {
               cont++;
            }
            if (cont > 2)
            {
               System.out.print(" el número no es primo, y se hicieron ");
               break;
            }
            if(cont <= 2 && i==j)
            {
               System.out.print(" el número es primo, y se hicieron ");
            }
         }System.out.print(eva+" evalucaciones\n");
         
       }
   }
}