import java.io.*;
import java.util.*;

public class MenuPila
{
   Pila c = new Pila();
   
	public void muestraMenu () throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int ope = 0;
      int resp = 0;
       
      System.out.print("Tamaño de Pila: ");
      int t = Integer.parseInt(br.readLine());
      
      c.leeTamaño(t);
      c.creaPila();
         
      do
		{

         System.out.print("\n--- MENÚ PILA ---\n");
         System.out.print("1.- PUSH (Insertar elementos)\n"
                          +"2.- POP (Borrar elementos)\n"
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
               
               c.muestraVacia(); 
            }break;
            case 4: //VERIFICAR SI ESTA LLENA
            {

               c.muestraLlena();
            }
            case 5: // IMPRIMIR PILA
            {
               
               c.muestraPila();
            }break;
            default:
            {
               System.out.print("¡OPCIÓN NO VÁLIDA!\nIntentelo de nuevo\n");
            }break;
            
         }
            System.out.print("¿Desea continuar? 1.-Si 2.-No\n");
            resp = Integer.parseInt(br.readLine());
      }while (resp == 1);
      System.out.print("FIN DEL PROGRAMA");
   }
} 
