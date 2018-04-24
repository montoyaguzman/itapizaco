import java. io.*;
public class MenuListaOrdenada{

   public void Menu () throws IOException{
   
      Operaciones realiza = new Operaciones();

      int opcion; 
      int respuesta;
      double dato = 01;   
      String nombreDelArchivo = "";
      
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
      
      System.out.println("***______MENU Media/Desviacion Estandar______\n***");

      do 
      {
         System.out.println("1.- Leer un archivo \n"
                           +"2.- Imprimir Lista\n"
                           +"3.- Obtener Promedio y Desviación estandar\n"
                           +"4.- Mostrar resultados\n");
                     
         System.out.print("Tecle Opcion: ");
         opcion = Integer.parseInt(br.readLine());

         switch (opcion)
         {
            case 1: 
            {
               System.out.print("\n¿Como se llama tu archivo?\n: ");
               nombreDelArchivo = br.readLine();
               realiza.leeArchivoDeTexto(nombreDelArchivo);           
            }break;
            case 2: 
            {
               realiza.imprimeLista();
            }break;
            case 3:
            {
               realiza.calculaDesviacionEstandar();
            }break;
            case 4:
            {
               realiza.muestraResultados();
            }break; 
            default:
            {
               System.out.print("Opcion no válida, intenta de nuevo");
            }break;
       }
         
         System.out.print("\n¿Desea continuar? 1.- Si, 2.- No \n");
         respuesta = Integer.parseInt(br.readLine());
      }while (respuesta == 1);
   }
}