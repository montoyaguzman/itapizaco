import java.io.*;
public class Lista
{  
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   
   //ATRIBUTOS
   private int tama;
   private int tope;
   private int numero;
   private int lista[];
   private int pos;
   private int numeroABuscar;
   private boolean listaVacia;
   private boolean listaLlena;
   
   //CONSTRUCTOR
   public void Lista (int t)
   {
	   tama = t;
	   tope = 0;
	   listaLlena = false;
	   listaVacia = true;
      pos = -1;
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
  
  public void creaLista()
  {
     lista = new int [tama];
  }
  
  public void verificaLlena()
  {
     if (tope == tama)
     listaLlena = true;
     else
     listaLlena = false;
  }
   
  public void verificaVacia()
  {
      if (tope == 0)
      listaVacia = true;
      else
      listaVacia = false;
   }
         
   public void agregar() throws IOException
   {
      this.verificaLlena();
      if (listaLlena != true)
      {
         System.out.print("Agregue elemento: ");
         lista[tope] = Integer.parseInt(br.readLine());
         tope++;
      }
      else
      {
         System.out.print("\nLISTA LLENA, no se pueden agregar más elementos!\n\n");
      }
   }
   
   public void eliminar() throws IOException
   {   
      this.verificaVacia();                                    
      
      if (listaVacia != true)
      {
         tope = tama - 1;
      
         System.out.print("Valor a eliminar: ");
         int eliminado = Integer.parseInt(br.readLine()); 
   
         for (int i = 0; i < tama; i++)
   
         if(eliminado == lista[i])
         {
            pos = i;
            break;
         }
      
         for (int i = pos; i < tama - 1; i++)  /*(int i = pos; i < tope - 1; i++)*/
         {
            lista[i] = lista[i+1];
         }
        
         //lista[tama] = -1;
         tama--;
         
         System.out.print("\nLista actualiza\n");
         for (int i = 0; i <= tope-1; i++)
         {
            System.out.print("L ["+lista[i]+"]\n");
         }
      }   
      else
      {
         System.out.print("\n¡Lista Vacía, no se puede borrar!\n");
      }
         //tama = tama - 1;  
     
   }
      
   public void ordenar()
   {
      for(int i = 0; i < tope-1; i++)
      { 
            int min = i;
         
            for(int j = i+1; j < tama; j++)
            {
               if(lista[j]<lista[min])
               {
                  min=j;
               }
            }
            if(i!=min)
            {
               int aux =lista[i];
               lista[i]=lista[min];
               lista[min] = aux;
            }
      }
         System.out.println("Datos ordenados :");
         for(int i=0; i < tope; i++)
         {
            System.out.println("L["+i+"]"+" = "+lista[i]);
         }
   }
   
   public void Busqueda() throws IOException
   {
      pos = -1;
      System.out.print("Indicar número buscado: ");
      numeroABuscar = Integer.parseInt(br.readLine());
		for(int i = 0; i < lista.length; i++)
		{  
	      if (numeroABuscar == lista[i])
			{
		      pos = i;
            System.out.print("\nElemento "+numeroABuscar+ " encontrado en la posicion: " + pos+"\n");
		      break;
			}
     } 
   }
       
   public void muestraLista()
   {
      this.verificaVacia();
      if (listaVacia != true)
      {
         for (int i = 0; i <= tope-1; i++)
         {
            System.out.println(lista[i]);
         }
      }
      else
      {
         System.out.println("\nLista vacía, no hay nada que imprimir\n");
      }
   }
   
   //MOSTRAR SI VACIA O LLENA
   public void muestraLlena()
   {
      this.verificaLlena();
      if (listaLlena == true)
      {
         System.out.print("\nLista Llena\n");
      }
      else
      {
         System.out.print("\nLa Lista no está llena\n");      
      }
  }
   
   public void muestraVacia()
   {
      this.verificaVacia();
      if (listaVacia == true)
      {
         System.out.print("\nLista Vacía\n\n");
      }
      else
      {
         System.out.print("\nLa Lista no está vacía\n\n");
      }
   }
}