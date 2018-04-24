import java.io.*;
public class Pila
{  
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   
   //ATRIBUTOS
   private int tama;
   private int tope;
   private int numero;
   private int pila[];
   private boolean pilaVacia;
   private boolean pilaLlena;
   
   //CONSTRUCTOR
   public void Pila (int t)
   {
	   tama = t;
	   tope = 0;
	   pilaLlena = false;
	   pilaVacia = true;
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
  
  public void creaPila()
  {
     pila = new int [tama];
  }
  
  public void verificaLlena()
  {
     if (tope == tama)
     pilaLlena = true;
     else
     pilaLlena = false;
  }
   
  public void verificaVacia()
  {
      if (tope == 0)
      pilaVacia = true;
      else
      pilaVacia = false;
   }
         
   public void push() throws IOException
   {
      this.verificaLlena();
      if (pilaLlena != true)
      {
         System.out.print("Agregue elemento: ");
         pila[tope] = Integer.parseInt(br.readLine());
         tope++;
      }
      else
      {
         System.out.print("\nPILA LLENA, no se pueden agregar más elementos!\n\n");
      }
   }
   
      
   public void pop()
   {
      this.verificaVacia();
      if (pilaVacia != true)
      {
         tope--;
         System.out.println("Dato Borrado");
         pila[tope]=0;
      }  
      else
      {
         System.out.print("PILA VACIA, \n No hay elementos para borrar!\n");  
      }
   }
      
   public void muestraPila()
   {
      this.verificaVacia();
      if (pilaVacia != true)
      {
         for (int i = tope-1; i >= 0; i--)
         {
            System.out.println(pila[i]);
         }
      }
      
      else
      {
         System.out.println("\nPila vacía, no hay nada que imprimir\n");
      }
   }
   
   //MOSTRAR SI VACIA O LLENA
   public void muestraLlena()
   {
      this.verificaLlena();
      if (pilaLlena == true)
      {
         System.out.print("\nPila Llena\n");
      }
      else
      {
         System.out.print("\nLa Pila no está llena\n");      
      }
  }
   
   public void muestraVacia()
   {
      this.verificaVacia();
      if (pilaVacia == true)
      {
         System.out.print("\nPila Vacía\n\n");
      }
      else
      {
         System.out.print("\nLa Pila no está vacía\n\n");
      }
   }
}