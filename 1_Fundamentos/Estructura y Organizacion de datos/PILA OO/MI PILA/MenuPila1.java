import java.io.*;
import java.util.*;

public class MenuPila1
{
   Pila1 c = new Pila1();
   
	public void muestraMenu () throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int ope = 0;
      int resp = 0;
           
      System.out.print("Tamaño de Pila: ");
      int tama = Integer.parseInt(br.readLine());
      
      c.leeTamaño(tama);
      
      c.creaPila();
         
      do
		{

         System.out.print("\n--- MENÚ PILA ---\n");
         System.out.print("1.- Insertar elementos\n"
                          +"2.- Borrar elementos\n"
                          +"3.- Verificar si está vacía\n"
                          +"4.- Verificar si esta llena\n"
                          +"5.- Imprimir la Pila");

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
               c.verificaVacia();              
            }break;
            case 4: //VERIFICAR SI ESTA LLENA
            {
               c.verificaLlena();
            }
            case 5: // IMPRIMIR PILA
            {
               c.muestraPila();
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
