import java.io.*;
import java.util.*;

public class MenuLista
{
   Lista c = new Lista();
   
	public void muestraMenu () throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int ope = 0;
      int resp = 0;
           
      System.out.print("Tamaño de la Lista: ");
      int t = Integer.parseInt(br.readLine());
      
      c.leeTamaño(t);
      
      c.creaLista();
         
      do
		{

         System.out.print("\n--- MENÚ COLA ---\n");
         System.out.print("1.- Insertar elementos\n"
                          +"2.- Borrar elementos\n"
                          +"3.- Ordenar elementos\n"
                          +"4.- Busqueda Secuencial\n"
                          +"5.- Verificar si está vacía\n"
                          +"6.- Verificar si esta llena\n"
                          +"7.- Imprimir la Lista");

         System.out.print("\n\nElige opción: ");
         ope = Integer.parseInt(br.readLine());
         
         switch(ope)
         {  
            
            case 1: //INSERTAR ELEMENTOS
            {
               c.agregar();

            }break;
            case 2: //BORRAR ELEMENTOS
            {
               c.eliminar();      
            }break;
            case 3: // ORDENAR ELEMENTOS
            {
               c.ordenar();
            }break;
            case 4: //BUSQUEDA SECUENCIAL
            {
               c.Busqueda();
            }break;
            case 5: //VERIFICAR SI ESTA VACIA
            {
               c.muestraVacia();              
            }break;
            case 6: //VERIFICAR SI ESTA LLENA
            {
               c.muestraLlena();
            }
            case 7: // IMPRIMIR PILA
            {
               c.muestraLista();
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