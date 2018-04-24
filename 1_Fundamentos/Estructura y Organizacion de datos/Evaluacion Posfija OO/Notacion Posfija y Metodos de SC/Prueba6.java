import java.io.*;
import java.util.*;

public class Prueba6
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int resp, tama, tope = 0;
      int var1 = 0, var2 = 0;
      int result = 0;
      char operador = ' ';
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
            operador = cadena.charAt(tama-1);
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
            
            if(operador == '+')
            {
               result = var2 + var1;
               System.out.print("\nSu suma es: "+result);
               tope--;tope--;
            }
            else
            if(operador == '-')
            {
               result = var2 - var1;
               System.out.print("\nSu diferencia es: "+result);
               tope--;tope--;
            }
            else
            if(operador == '*')
            {
               result = var2 * var1;
               System.out.print("\nSu producto es: "+result);
               tope--;tope--;
            }
            else
            if(operador == '^')
            {
               double result1;
               result1 = Math.pow(var1,var2);
               System.out.print("\nSu potenciacion es: "+result1);
               tope--;tope--;
            }
            pila[tope] = result;
            tope++;
            System.out.print("\nPILA ACTUAL\n");			
   		   for(int u = 0; u <= tope-1; u++)
   		   {
   			   System.out.println("pila["+u+"]= "+pila[u]);
   		   }
   }
}