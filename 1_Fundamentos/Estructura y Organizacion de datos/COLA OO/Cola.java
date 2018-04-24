import java.io.*;
public class Cola
{  
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   
   //ATRIBUTOS
   private int tama;
   private int tope;
   private int numero;
   private int cola[];
   private boolean colaVacia;
   private boolean colaLlena;
   
   //CONSTRUCTOR
   public void Cola (int t)
   {
	   tama = t;
	   tope = 0;
	   colaLlena = false;
	   colaVacia = true;
   }
   
   //ENTRADA   
   
  public void leeTamaño(int t)
  {
     tama = t;
  }
   
  public void leeNum(int n)
  {
     numero = n;
  }
  
  //PROCESO
  
  public void creaCola()
  {
     cola = new int [tama];
  }
  
  public void verificaLlena()
  {
     if (tope == tama)
     colaLlena = true;
     else
     colaLlena = false;
  }
   
  public void verificaVacia()
  {
      if (tope == 0)
      colaVacia = true;
      else
      colaVacia = false;
   }
         
   public void push() throws IOException
   {
      this.verificaLlena();
      if (colaLlena != true)
      {
         System.out.print("Agregue elemento: ");
         cola[tope] = Integer.parseInt(br.readLine());
         tope++;
      }
      else
      {
         System.out.print("\nCOLA LLENA, no se pueden agregar más elementos!\n\n");
      }
   }
   
      
   /*public void pop()
   {
      this.verificaVacia();
      if (colaVacia != true)
      {
         int aux;
         cola[0] = 0;
         for (int i = 0; i < tope-1; i++)
         {
            aux =  cola [i];
            cola[i] = cola [i+1];
            cola [i+1] = aux;
         }
           //cola [tope-1] = 0;
      }
      else
      {
         System.out.print("COLA VACIA, \n No hay elementos para borrar!\n");  
      }
   }*/
   
   public void pop()
   {
      this.verificaVacia();
      if (colaVacia != true)
      {
         for (int i = 0; i < tope-1; i++)
         {
            cola[i] = cola [i+1];
         }
           cola [tope-1] = 0;
           tope--;
      }
      else
      {
         System.out.print("COLA VACIA, \n No hay elementos para borrar!\n");  
      }
   }
      
   public void muestraCola()
   {
      this.verificaVacia();
      if (colaVacia != true)
      {
         for (int i = 0; i <= tope-1; i++)
         {
            System.out.println(cola[i]);
         }
      }
      else
      {
         System.out.println("\nCola vacía, no hay nada que imprimir\n");
      }
   }
   
   //MOSTRAR SI VACIA O LLENA
   public void muestraLlena()
   {
      this.verificaLlena();
      if (colaLlena == true)
      {
         System.out.print("\nCola Llena\n");
      }
      else
      {
         System.out.print("\nLa Cola no está llena\n");      
      }
  }
   
   public void muestraVacia()
   {
      this.verificaVacia();
      if (colaVacia == true)
      {
         System.out.print("\nCola Vacía\n\n");
      }
      else
      {
         System.out.print("\nLa Cola no está vacía\n\n");
      }
   }
}