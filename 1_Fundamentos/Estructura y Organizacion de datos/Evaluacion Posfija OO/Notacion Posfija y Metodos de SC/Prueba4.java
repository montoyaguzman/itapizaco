import java.io.*;
import java.util.*;

public class Prueba4
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int resp, tama, tope = 0;
     
         System.out.print("Ingresa cadena: ");
         String cadena = br.readLine();
         
         tama = cadena.length();
         
         int pila[] = new int[tama];
         
         for(int i = 0; i < tama; i++)
         
         {
            //System.out.println(cadena.charAt(i));
            char aux = cadena.charAt(i);
            if (Character.isDigit(aux) == true)
            {
               pila[tope] = Integer.parseInt(cadena.charAt(i)+"");
               
               tope++;
               System.out.print("\nEso es un numero");
            }
            else
            {
               System.out.print("\nEso no es un numero");      
            }
         }  
         System.out.print("\nCadena: "+cadena);
         //System.out.print("\nPila: "+Arrays.toString(pila));
         
         System.out.print("\nPILA\n");			
   		for(int j = 0; j <= tope-1; j++)
   		{
   			System.out.println("b["+j+"]= "+pila[j]);
   		}

   }
}

// REPLACE
   //http://diwolf.blogspot.mx/2010/06/eliminar-un-caracter-de-una-cadena-con.html