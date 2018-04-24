import java.util.*;
import java.io.*;

public class PilaV1
{
	public static void main (String args[]) throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      boolean pilaLlena = false;
      boolean pilaVacia = false;
      int resp, numero = 0, tope = 0;
           
      System.out.print("Tamaño de Pila: ");
      int lim = Integer.parseInt(br.readLine());
      
      int pila[] = new int[lim];
      
      do
      {
         System.out.print("\n--- MENÚ ---\n");
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
                  if (pilaLlena == false)
                  {
                     System.out.print("Agregue elemento: ");
                     pila[tope] = Integer.parseInt(br.readLine());
                     tope++;
                  }
                  else
                  {
                     System.out.print("PILA LLENA");
                  }
            }break;
            case 2: //BORRAR ELEMENTOS
            {
                  if (tope != 0)
                  {
                     tope--;
                     pila[tope]=0;
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
                  pilaVacia = true;
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
                  pilaLlena = true;
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
               System.out.print(Arrays.toString(pila)+"\n");
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