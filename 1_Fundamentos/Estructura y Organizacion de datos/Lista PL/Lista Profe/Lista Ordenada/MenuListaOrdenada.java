import java. io.*;
public class MenuListaOrdenada
{
   public void Menu () throws IOException
   {
      NuevaListaOrdenada c = new NuevaListaOrdenada();

      int opcion; 
      int resp;
      int d;   
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
      
      System.out.println("***_________MENU LISTA ORDENADA DOBLEMENTE-LIGADA_________\n***");

      do 
      {
         System.out.println("1.- Insertar \n"
                           +"2.- Imprimir Ascendente\n"
                           +"3.- Imprime Descendente\n"
                           +"4.- Borra Dato");
                     
         System.out.print("Tecle Opcion: ");
         opcion = Integer.parseInt(br.readLine());

         switch (opcion)
         {
            case 1: 
            {
               System.out.print("\nIntroduce dato: ");
               d = Integer.parseInt(br.readLine());
               c.insertaOrden(d);
            }break;
            case 2: 
            {
               c.imprimeListaAscendente();
            }break;
            case 3:
            {
               c.imprimeListaDescendente();
            }break;
            case 4:
            {
               System.out.print("Dato a eliminar: ");
               int eliminado = Integer.parseInt(br.readLine());
               c.borraDato(eliminado);  
            }break;            
            default:
            {
               System.out.print("Opcion no valida");
            }break;
       }
         
         System.out.print("\n¿Desea continuar? 1.- Si, 2.- No \n");
         resp = Integer.parseInt(br.readLine());
      }while (resp == 1);
      
   }
}

