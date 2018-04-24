import java.io.*;

public class PruebaFinal2
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
            operador = cadena.charAt(i);
                                      
            var1 = pila[tope-1];
            var2 = pila[tope-2];
            
            if(operador == '+')
            {
               result = var2 + var1;
               System.out.print("\nResultado: "+result);
               tope--;tope--;
            }
            else
            if(operador == '-')
            {
               result = var2 - var1;
               System.out.print("\nResultado: "+result);
               tope--;tope--;
            }
            else
            if(operador == '*')
            {
               result = var2 * var1;
               System.out.print("\nResultado: "+result);
               tope--;tope--;
            }
            else
            if(operador == '/')
            {
               result = var2 / var1;
               System.out.print("\nResultado: "+result);
               tope--;tope--;
            }            
            else
            if(operador == '^')
            {
               result = Math.pow(var2,var1);
               //Math.pow(base,exponente)
               System.out.print("\nResultado: "+result);
               tope--;tope--;
            }
            
            pila[tope] = result;
            tope++;
         }
      }            
            System.out.print("\nPILA ACTUAL\n");			
   		   for(int i = 0; i <= tope-1; i++)
   		   {
   			   System.out.println("pila["+i+"]= "+pila[i]);
   		   }
   }
}