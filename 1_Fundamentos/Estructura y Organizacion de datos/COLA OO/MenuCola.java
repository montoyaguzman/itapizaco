import java.io.*;
import java.util.*;

public class MenuCola
{
   Cola c = new Cola();
   
	public void muestraMenu () throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int ope = 0;
      int resp = 0;
           
      System.out.print("Tamaño de la Cola: ");
      int t = Integer.parseInt(br.readLine());
      
      c.leeTamaño(t);
      
      c.creaCola();
         
      do
		{

         System.out.print("\n--- MENÚ COLA ---\n");
         System.out.print("1.- Insertar elementos\n"
                          +"2.- Borrar elementos\n"
                          +"3.- Verificar si está vacía\n"
                          +"4.- Verificar si esta llena\n"
                          +"5.- Imprimir la Cola");

         System.out.print("\n\nElige opción: ");
         ope = Integer.parseInt(br.readLine());
         
         switch(ope)
         {  
            
            case 1: //INSERTAR ELEMENTOS
            {
               c.push();

            }break;
            case 2: //BORRAR ELEMENTOS
            {
               c.pop();      
            }break;
            case 3: //VERIFICAR SI ESTA VACIA
            {
               c.muestraVacia();              
            }break;
            case 4: //VERIFICAR SI ESTA LLENA
            {
               c.muestraLlena();
            }
            case 5: // IMPRIMIR PILA
            {
               c.muestraCola();
            }break;
            default:
            {
               System.out.print("¡OPCIÓN NO VÁLIDA!\nIntentelo de nuevo");
            }break;
            
         }
            System.out.print("¿Desea continuar? 1.-Si 2.-No\n");
            resp = Integer.parseInt(br.readLine());
      }while (resp == 1);
      System.out.print("FIN DEL PROGRAMA");
   }
}