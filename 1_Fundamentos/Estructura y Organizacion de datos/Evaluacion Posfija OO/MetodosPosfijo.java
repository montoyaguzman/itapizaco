import java.io.*;
public class MetodosPosfijo
{  
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   
   //ATRIBUTOS
   private int tama;
   private int tope;
   private double var1;
   private double var2;
   private double result;
   private char operador;
   private String cadena;
   private double pila[];
   
   
   //CONSTRUCTOR
   public void Pila (int t)
   {
	   tama = t;
	   tope = 0;
   }
   
   //ENTRADA   
  
  public void leeCadena(String c)
  {
     cadena = c;
  }
   
  public void leeTamaño(int t)
  {
     tama = t;
  }
  
  //PROCESO
  
  public void creaPila()
  {
     pila = new double [tama];
  }
  
  //MOVER PUSH         
   public void push() throws IOException
   { 
         int i = 0;
         pila[tope] = Double.parseDouble(cadena.charAt(i)+"");
         tope++;
   }
   
   public void pop()
   {
      //for (int i = tope; i > tope-2; i--)
      //{
         //tope--;
         tope--;tope--; 
        // break;
      //}
   }
   
   //EVALUACION
      public void evaluaPosfijo() throws IOException
      {
         for(int i = 0; i < tama; i++)   
         {
            char aux = cadena.charAt(i);
            if (Character.isDigit(aux) == true)
            {
               pila[tope] = Double.parseDouble(cadena.charAt(i)+"");
               tope++;
               //this.push();
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
                  this.pop();
               }
               else
               if(operador == '-')
               {
                  result = var2 - var1;
                  System.out.print("\nResultado: "+result);
                  this.pop();
               }
               else
               if(operador == '*')
               {
                  result = var2 * var1;
                  System.out.print("\nResultado: "+result);
                  this.pop();
               }
               else
               if(operador == '/')
               {
                  result = var2 / var1;
                  System.out.print("\nResultado: "+result);
                  this.pop();
               }            
               else
               if(operador == '^')
               {
                  result = Math.pow(var2,var1);
                  //Math.pow(base,exponente)
                  System.out.print("\nResultado: "+result);
                  this.pop();
               }
            
               pila[tope] = result;
               tope++;
         }
      }
   }
        
   public void muestraPila()
   {
      System.out.print("\n\nPILA ACTUAL\n");			
      for(int i = 0; i <= tope-1; i++)
   	{
   	   System.out.println("pila["+i+"]= "+pila[i]);
      }
   }
      
}