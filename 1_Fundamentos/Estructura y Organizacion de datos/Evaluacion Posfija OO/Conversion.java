import java.io.*;

public class Conversion
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int tama, tope = 0;
      char simbolo = ' ';
      
      System.out.print("Ingresa cadena: ");
      String cadena = br.readLine();
         
      tama = cadena.length();
         
      char pila[] = new char[tama];
   
      for(int i = 0; i < tama; i++)   
      {
         char aux = cadena.charAt(i);
         if (Character.isDigit(aux) == true)
         {
            
            //si char es numero
            
         }
         else
         {
            simbolo = cadena.charAt(i);
                                      
            if(simbolo == '(' || simbolo == '+' || simbolo == '-'|| simbolo == '*'|| simbolo == '/'|| simbolo == '^')
            {
               pila[tope] = simbolo;
               tope++;
            }
         }
     }
                     
            System.out.print("\nPILA ACTUAL\n");			
   		   for(int i = 0; i <= tope-1; i++)
   		   {
   			   System.out.println("pila["+i+"]= "+pila[i]);
   		   }
      
   }
}