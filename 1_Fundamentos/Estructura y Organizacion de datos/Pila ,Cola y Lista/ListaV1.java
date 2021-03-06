import java.util.*;
import java.io.*;

public class ListaV1
{
	public static void main (String args[]) throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      boolean listaLlena = false;
      boolean listaVacia = false;
      int resp, numero = 0, tope = 0;
      int pos = 0;
      int NumeroABuscar = 0;

           
      System.out.print("Tama?o de Pila: ");
      int lim = Integer.parseInt(br.readLine());
      
      int lista[] = new int[lim];
      
      do
      {
         System.out.print("\n--- MEN? ---\n");
         System.out.print("1.- Insertar elementos\n"
                       +"2.- Borrar elementos\n"
                       +"3.- Verificar si est? vac?a\n"
                       +"4.- Verificar si esta llena\n"
                       +"5.- Imprimir la Lista"
                       +"6.- Busqueda de elemento");
                       
         System.out.print("\n\nElige opci?n: ");
         int ope = Integer.parseInt(br.readLine());
      
         switch(ope)
         {  
            
            case 1: //INSERTAR ELEMENTOS
            {
                  if (listaLlena == false)
                  {
                     //PROYECTO MONTOYIA
                     System.out.print("Agregue elemento: ");
                     lista[tope] = Integer.parseInt(br.readLine());
                     tope++;
                     
                     for (int i = 0; i < lista.length; i++)
                     {
	                     for (int j = 0; j < lista.length && j != i; j++) 
	                     {
		                     if (lista[i] < lista[j])
		                     {
                     			int aux = lista[i];
                     			lista[i] = lista[j];  
                     			lista[j] = aux;
                     		}
                     	}
                     }
                  }         
                  if (listaLlena == true)
                  {
                     System.out.print("LISTA LLENA");
                  }
            }break;
            case 2: //BORRAR ELEMENTOS
            {
                  if (tope != 0)
                  {
                     tope--;
                     lista[tope]=0;
                  }
                  else
                  {
                     System.out.print("PILA VACIA, \n No hay elementos para borrar!");
                  }   
            }break;
            case 3: //VERIFICAR SI ESTA VACIA
            {
               if (tope == 0)
               {
                  listaVacia = true;
                  System.out.print("PILA VACIA");
               }
               else
               {
                  System.out.print("LA PILA NO ESTA VACIA\n");
               }
                  //return true;
            }break;
            case 4: //VERIFICAR SI ESTA LLENA
            {
               if (tope == lim)
               {
                  listaLlena = true;
                  System.out.print("PILA LLENA");
               }
               else
               {
                  System.out.print("LA PILA NO ESTA LLENA\n");
               }
                  //return true;
            }
            case 5: // IMPRIMIR PILA
            {
               System.out.print(Arrays.toString(lista)+"\n");
            }break;
            case 6:
            {
		         pos = -1;
		         for(int i = 0; i < lista.length; i++)
		         {  
			         if (NumeroABuscar == lista[i])
			         {
				         pos = i;
                     System.out.print("\nElemento "+NumeroABuscar+ " encontrado en la posicion: " + pos);
				         break;
			         }
               }            
            }break;
            default:
            {
               System.out.print("?OPCI?N NO V?LIDA!\nIntentelo de nuevo");
            }break;
            
         }
      System.out.print("?Desea continuar? 1.-Si 2.-No\n");
      resp = Integer.parseInt(br.readLine());
      }while (resp == 1);
      if (resp == 2)
      {
         System.out.print("\nFIN DEL PROGRAMA\n");
      }
   }
}