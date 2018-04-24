import java.io.*;

public class PruebaFinal
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int tama, tope = 0;
      double var1 = 0, var2 = 0;
      double result = 0;
      char operador = ' ';
      System.out.print("Ingresa cadena: ");
      String cadena = br.readLine();
         
      tama = cadena.length();
         
      double pila[] = new double[tama];
   
      for(int i = 0; i < tama; i++)   
      {
         char aux = cadena.charAt(i);
         if (Character.isDigit(aux) == true)
         {
            pila[tope] = Double.parseDouble(cadena.charAt(i)+"");
            tope++;
           
         }
         else
         {
            operador = cadena.charAt(tama-1);
         }
      }  
              
            var1 = pila[tope-1];
            var2 = pila[tope-2];
            
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
               result = Math.pow(var1,var2);
               System.out.print("\nSu potenciacion es: "+result);
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