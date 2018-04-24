import java.io.*;
import java.util.*;

public class Prueba5
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int resp, tama, tope = 0;
      int var1 = 0, var2 = 0;
      int result[];
         System.out.print("Ingresa cadena: ");
         String cadena = br.readLine();
         
         tama = cadena.length();
         
         int pila[] = new int[tama];
         //pila[] = result[pila.length];;
         
         for(int i = 0; i < tama; i++)
         
         {
            //System.out.println(cadena.charAt(i));
            char aux = cadena.charAt(i);
            if (Character.isDigit(aux) == true)
            {
               pila[tope] = Integer.parseInt(cadena.charAt(i)+"");
               
               tope++;
            }
            else
            {
               //var1 = Integer.parseInt(cadena.charAt(i)+"");
               //pila[tope] = Integer.parseInt(cadena.charAt(i)+"");
               //esult[i] = Integer.parseInt(pila[i]);
               //pila[tope] = var1;
               //pila[tope-1] = var2;
               //for (int k = tope; k >= 2; k--)
               //{
                  //pila[i] = Integer.parseInt(cadena.charAt(i)+"");
               /*if (tope != 0)
               {
                  tope--;
                  System.out.println("Dato Borrado");
                  pila[tope]=0;
               } */
               //}
            }
         }  
         System.out.print("\nCadena: "+cadena);
         
         System.out.print("\nPILA\n");			
   		for(int j = 0; j <= tope-1; j++)
   		{
   			System.out.println("pila["+j+"]= "+pila[j]);
   		}
         
         
         var1 = pila[tope-1];
         var2 = pila[tope-2];
         System.out.print("Tope: "+var1+"\nTope -1 : "+var2);
        
         
         
         
   }
}

// REPLACE
   