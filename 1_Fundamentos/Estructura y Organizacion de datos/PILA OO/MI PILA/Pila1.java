import java.io.*;
import java.util.*;

public class Pila1
{
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   
   //CONSTRUCTOR
   public void Pila (int t)
   {
	   tama = t;
	   tope = 0;
	   pilaLlena = false;
	   pilaVacia = true;
   }
   
   //ATRIBUTOS
   private int tama;
   private int tope;
   private int numero;
   private int pila[];
   private boolean pilaVacia;
   private boolean pilaLlena;
   
   //ENTRADA
      
  public void leeTamaño(int t)
  {
     tama = t;
  }
   
  public void leeNum(int n)
  {
     numero = n;
  }
   
  public void creaPila()
  {
     pila = new int [tama];
  }
   
   //PROCESO
   
   public void verificaLlena()
   {
      if (tope == tama)
      {
         pilaLlena = true;
         System.out.print("\nPila Llena\n");
      }
      else
      {
         System.out.print("\nLa Pila no está llena\n");      
      }
  }
   
   public void verificaVacia()
   {
      if (tope == 0)
      {
         pilaVacia = true;
         System.out.print("\nPila Vacía\n");
      }
      else
      {
         System.out.print("\nLa Pila no está vacía\n");
      }
   }
   
   public void push() throws IOException
   {
      if (tope != tama)//(pilaLlena == false)
      {
         System.out.print("Agregue elemento: ");
         pila[tope] = Integer.parseInt(br.readLine());
         tope++;
      }
      else
      {
         System.out.print("\nPILA LLENA");
      }
   }
   
   public void pop()
   {
      if (tope != 0) //(pilaVacia == false)
      {
         tope--;
         pila[tope]=0;
      }  
      else
      {
         System.out.print("PILA VACIA, \n No hay elementos para borrar!");  
      }
   }
      
   public void muestraPila()
   {
      //System.out.print(Arrays.toString(pila)+"\n");
      if (pilaLlena == false)
      {
         for (int i = tope-1; i >= 0; i--)
         {
            System.out.println(pila[i]);
         }
      }
      else
      {
         System.out.println("Pila vacía, no hay nada que imprimir");
      }
   }
}