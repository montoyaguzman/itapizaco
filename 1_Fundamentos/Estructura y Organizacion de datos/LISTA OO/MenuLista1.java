import java.io.*;
import java.util.*;

public class MenuLista1
{
   Lista1 c = new Lista1();
   
	public void muestraMenu () throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int ope = 0;
      int resp = 0;
      int orden = 0;
      
      System.out.print("Tamaño de la Lista: ");
      int t = Integer.parseInt(br.readLine());
      
      c.leeTamaño(t);
      
      c.creaLista();
      
      do 
      {
         System.out.print("\nELIGA ORDEN"
                           +"\n1)Ascendente" 
                           +"\n2)Descendente"
                           +"\nDesicion: ");
    	   orden =  Integer.parseInt(br.readLine());
         c.leeOrden(orden);           
			if(orden < 1 || orden > 2)
         {
            System.out.print("Opción no válida");
         } 
     }while(orden>2 || orden<1);
         
      do
		{

         System.out.print("\n--- MENÚ COLA ---\n");
         System.out.print("1.- Insertar elementos\n"
                          +"2.- Borrar elementos\n"
                          +"3.- Borrar por el inicio\n"
                          +"4.- Borrar por el final\n"
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
               c.muestraLista();

            }break;
            case 2: //BORRAR ELEMENTOS POR DONDE MANDÉ
            {
               c.eliminarMontoya();      
            }break;
            case 3: // BORRA INICIO
            {
               c.eliminaInicio();
            }break;
            case 4: //BORRA FIN
            {
               c.eliminaFin();
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