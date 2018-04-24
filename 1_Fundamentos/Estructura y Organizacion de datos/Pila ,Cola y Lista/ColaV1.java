import java.util.*;
import java.io.*;

public class ColaV1
{
	public static void main (String args[]) throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      boolean colaLlena = false;
      boolean colaVacia = false;
      int resp, numero = 0, fin = 0;
      int frente = 0;
           
      System.out.print("Tamaño de Pila: ");
      int lim = Integer.parseInt(br.readLine());
      
      int cola[] = new int[lim];
      
      do
      {
         System.out.print("\n--- MENÚ COLA ---\n");
         System.out.print("1.- Insertar elementos\n"
                       +"2.- Borrar elementos\n"
                       +"3.- Verificar si está vacía\n"
                       +"4.- Verificar si esta llena\n"
                       +"5.- Imprimir la Pila");
                       
         System.out.print("\n\nElige opción: ");
         int ope = Integer.parseInt(br.readLine());
      
         switch(ope)
         {  
            
            case 1: //INSERTAR ELEMENTOS
            {
                  if (colaLlena == false)
                  {
                     System.out.print("Agregue elemento: ");
                     cola[fin] = Integer.parseInt(br.readLine());
                     fin++;
                  }
                  else
                  {
                     System.out.print("COLA LLENA");
                  }
            }break;
            case 2: //BORRAR ELEMENTOS
            {
               for (int i = 0; i < fin; i++)
               {
                  if (colaVacia == false)
                  {
                     cola[i]=0;
                  }
                  else
                  {
                     System.out.print("COLA VACIA, \n ¡No hay elementos para borrar!");
                  }
               } 
            }break;
            case 3: //VERIFICAR SI ESTA VACIA
            {
               if (fin == 0)
               {
                  colaVacia = true;
                  System.out.print("COLA VACIA");
               }
               else
               {
                  System.out.print("LA COLA NO ESTA VACIA\n");
               }
                  //return true;
            }break;
            case 4: //VERIFICAR SI ESTA LLENA
            {
               if (fin == lim)
               {
                  colaLlena = true;
                  System.out.print("COLA LLENA");
               }
               else
               {
                  System.out.print("LA COLA NO ESTA LLENA\n");
               }
                  //return true;
            }
            case 5: // IMPRIMIR PILA
            {
               System.out.print(Arrays.toString(cola)+"\n");
            }break;
            
            default:
            {
               System.out.print("¡OPCIÓN NO VÁLIDA!\nIntentelo de nuevo");
            }break;
            
         }
      System.out.print("¿Desea continuar? 1.-Si 2.-No\n");
      resp = Integer.parseInt(br.readLine());
      }while (resp == 1);
      if (resp == 2)
      {
         System.out.print("\nFIN DEL PROGRAMA\n");
      }
   }
}