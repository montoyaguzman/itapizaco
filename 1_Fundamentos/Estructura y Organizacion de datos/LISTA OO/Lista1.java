import java.io.*;
public class Lista1
{  
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   
   //ATRIBUTOS
   private int tama;
   private int tope;
   private int numero;
   private int orden;
   private int lista[];
   private int numeroABuscar;
   private boolean listaVacia;
   private boolean listaLlena;
   
   //CONSTRUCTOR
   public void Lista (int t)
   {
      tama = t;
      tope = 0;
      orden = 0;
      listaLlena = false;
      listaVacia = true;
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
   
   public void leeOrden(int o)
   {
      orden = o;
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
   //----------------------------------------------------------------------------------------------
   
   public void agregar () throws IOException
   {
      int pos = 0;
      this.verificaLlena();
      if(listaLlena == false)
      {		
         System.out.print("Agregue elemento: ");
         numero = Integer.parseInt(br.readLine());
         
         if (orden == 1) //ORDEN ASCENDENTE
         { 
            this.verificaVacia();
            if(listaVacia == true)
            {
               lista[tope] = numero;
               tope++;
            }
            else 
            if(numero >= lista[tope-1])
            {
                  lista[tope] = numero;
                  tope++;
            }
            else
            if (numero < lista[tope-1])
            {
               if(numero <= lista[0])
               {
                  /*for(int i = tope-1; i >= 0; i--)
                  {
                     lista[i+1]=lista[i];
                  }
                  lista[0] = numero;
                  tope++;*/pos=0;
               }
           else
           {
               pos = -1;
               for(int i = 0; i < tope; i++) 
               {
                  if(numero >= lista[i])
                  {
                     pos = i + 1;	
                  }
               }
           }
           for(int i = tope-1; i >= pos; i--)
           {
               lista[i+1] = lista[i];
           }
           lista[pos] = numero;
           tope++;
           pos = -1; 
        }
     }
      else //ORDEN DESCENDENTE
      {
         this.verificaVacia();
         if(listaVacia == true)
		   {
            lista[tope] = numero;
		      tope++;		
         }
         else 
		   if (numero < lista[tope-1])
		   {
            lista[tope] = numero;
		      tope++;
         }
         else 
		   if(numero >= lista[tope-1]) 
		   {
            for(int i = lista.length-1; i <= 0; i--)
		      {
               if(i == lista[i])
			      {
                  pos = i+1;
               }
            }
            
            int numMenor = lista[pos]; 
                
            if(numMenor > numero)
			   {			 
               for(int i=0; i<tope; i++) 
			      {
                  if(lista[pos] > numero) 
			         {
                     pos++;
                  }      
               }
               if(pos<0) 
               {       			
                  pos=0;     			
               }
           }
               //RECORRER
               for(int i = tope-1; i >= pos; i--)
               {
                  lista[i+1] = lista[i];
               }
               lista[pos] = numero;
               tope++;
               //pos = -1;  
        }
               
     }
   }else{System.out.print("\nLISTA LLENA, no se pueden agregar elementos!\n");}
 }   
   
      
   ///------------------------------------------------------------------------------------
      public void eliminarMontoya() throws IOException
      {   
      this.verificaVacia();                                    
      int eliminado = 0;
      if (listaVacia != true)
      {
         int pos = -1;
         System.out.print("Valor a eliminar: ");
         eliminado = Integer.parseInt(br.readLine());
         /*if (eliminado == lista[tope])
         {
            lista[tope]=0;
            tope--;
         }
         else
            if (eliminado == lista[0])
            {
               for (int i = 0; i <= tope - 1; i++)
               {
                  lista[i] = lista[i+1];
               }tope--;
            }
            else
            { 
         */
         for (int i = 0; i < tope-1; i++)
         {
            if(eliminado == lista[i])
            {
               pos = i;
               break;
            }
         }               

		for (int i = pos; i < tope - 1; i++)
               {
                  lista[i] = lista[i+1];
               }
               tope--;
            //}
         this.verificaVacia();
         if (listaVacia != true)
         {
            System.out.print("\nLista actualizada\n");
            for (int i = 0; i <= tope-1; i++)
            {
               System.out.print("L ["+lista[i]+"]\n");
            }
         }
         else
         {
            System.out.print("\nLISTA VACIA\n");
         }
      }   
      else
      {
         System.out.print("\n¡Lista Vacía, no se puede borrar!\n");
      }
   }




          
   public void muestraLista()
   {
      this.verificaVacia();
      if (listaVacia != true)
      {
         for (int i = 0; i <= tope-1; i++)
         {
            System.out.println("L["+lista[i]+"]");
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