import java. io.*;
public class MenuNuevaLista
{
   public void Menu () throws IOException
   {
      NuevaLista c = new NuevaLista();

      int opcion; 
      int resp;
      int d;   
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
      
      System.out.println("***_________MENU LISTA LIGADA_________\n***");

      do 
      {
         System.out.println("1.-Insertar por Inicio \n"
                           +"2.- Inserta por el Final\n"
                           +"3.- Imprime Ascendente\n"
                           +"4.- Imprime Desendente\n"
                           +"5.- Borra Inicio\n"
                           +"6.- Borra Final\n"
                           );
                     
         System.out.print("Tecle Opcion: ");
         opcion = Integer.parseInt(br.readLine());

         switch (opcion)
         {
            case 1: 
            {
               System.out.print("\nIntroduce dato: ");
               d = Integer.parseInt(br.readLine());
               c.insertaInicio(d);
            }break;
            case 2: 
            {
               System.out.print("\nIntroduce dato: ");
               d = Integer.parseInt(br.readLine());
               c.insertaFinal(d);
            }break;
            case 3: 
            {
               c.imprimeListaDescendente();
            }break;
            case 4:
            {
               c.imprimeListaAscendente();
            }break;
            case 5: 
            {
               c.borraInicio();
            }break;
            case 6:
            {
               c.borraFin();
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

