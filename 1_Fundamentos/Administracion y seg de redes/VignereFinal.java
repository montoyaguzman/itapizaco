/*FORMULA
Encriptar --> E(Xi) = (Xi - ki) mod L
Desencriptar --> D(Ci) = (Ci - Ki) mod L
L=tamaño del alfabeto
*/
import java.util.*;
import java.io.*;
import javax.swing.*;

public class VignereFinal
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      char alfabeto[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            
      String mensaje;
      String clave;
      char nuevoMensaje = ' ';
      int p1 = 0;
      int p2 = 0;
      int y = 0;
      int tamaDelMensaje = 0;
      int tamaDeLaClave = 0;
      int tope = 0;
      //int contador = 0;
      int k = 0;
      int respuesta;   
      
     // do
      //{
         System.out.print("________ **CODIGO VIGNERE** ________\n\n");
         System.out.println("¿Que operación desea realizar? \n1.Encriptar\n2.Desencriptar");
         System.out.print("Opcion:");
         respuesta = Integer.parseInt(br.readLine());
       
         if(respuesta == 1)   
         {
            System.out.print("Inserte mensaje: ");
            mensaje = br.readLine();
            
            System.out.print("Inserte clave: ");
            clave = br.readLine();
                  
            tamaDelMensaje = mensaje.length();
            tamaDeLaClave = clave.length();
               
            char pila[] = new char[tamaDelMensaje];
            
           for (int i = 0; i < tamaDelMensaje; i++)
           {
              char aux1 = mensaje.charAt(i);
              for (int j = 0; j < alfabeto.length; j++)
              {            
                  if(aux1 == alfabeto[j])
                  {
                    p1 = j;
                    //System.out.print(p1+" "); //pos1
                    
                    //
                    //for (int k = 0; k < mensaje.length(); k++)
                    if(k >= tamaDeLaClave)
                    //{
                        k = 0;
                    //}              
                    while(k < mensaje.length())
                    {
                        char aux3 = clave.charAt(k);
                        for (int l = 0; l <= alfabeto.length; l++)
                        {
                                       
                           if (aux3 == alfabeto[l])
                           {
                              p2 = l;
                              //System.out.print(p2+" ");
                              y = (p1 + p2) % 27;
                             
                              for (int m = 0; m < alfabeto.length; m++)
                              {
                                 if (y == m)
                                 {
                                    nuevoMensaje = alfabeto[m];
                                    pila[tope] = nuevoMensaje;
                                    tope++;
                                    break; 
                                 }
                              } 
                              break;
                           }
                        }
                        k++; 
                        break; //VA O NO VA
                    }
                   break; 
                   }
              }
           }
              
           System.out.println();                   
           //System.out.print(Arrays.toString(pila)+"\n");
            for (int am=0; am<pila.length; am++)
            //AGREGAR CONTADOR DE ESPACIOS EN BLANCO Y ELIMINAR
            {
               System.out.println(pila[am]);
            }
      }
      else if (respuesta == 2)
      {
         //   
         System.out.print("Inserte mensaje: ");
            mensaje = br.readLine();
            
            System.out.print("Inserte clave: ");
            clave = br.readLine();
                  
            tamaDelMensaje = mensaje.length();
            tamaDeLaClave = clave.length();
               
            char pila[] = new char[tamaDelMensaje];
            
           for (int i = 0; i < tamaDelMensaje; i++)
           {
              char aux1 = mensaje.charAt(i);
              for (int j = 0; j < alfabeto.length; j++)
              {            
                  if(aux1 == alfabeto[j])
                  {
                    p1 = j;
                    //System.out.print(p1+" "); //pos1
                    
                    //
                    //for (int k = 0; k < mensaje.length(); k++)
                    if(k >= tamaDeLaClave)
                    //{
                        k = 0;
                    //}              
                    while(k < mensaje.length())
                    {
                        char aux3 = clave.charAt(k);
                        for (int l = 0; l <= alfabeto.length; l++)
                        {
                                       
                           if (aux3 == alfabeto[l])
                           {
                              p2 = l;
                              //System.out.print(p2+" ");
                              y = (p1 - p2) % 27;
                             
                              if (y < 0)
                              y = y + 27;
                              
                              for (int m = 0; m <= alfabeto.length; m++)
                              {
                                 if (y == m)
                                 {
                                    nuevoMensaje = alfabeto[m];
                                    pila[tope] = nuevoMensaje;
                                    tope++;
                                    break; 
                                 }
                              } 
                              break;
                           }
                        }
                        k++; 
                        break; //VA O NO VA
                    }
                   break; 
                   }
              }
           }
              
           System.out.println();                   
           System.out.print(Arrays.toString(pila)+"\n");
         //   
      }
      
      //System.out.println("\n¿Quiere intentarlo de nuevo? \n1.Si\n2.No");
      //System.out.print("Opcion:");
		//respuesta = Integer.parseInt(br.readLine());     
   //}while(respuesta == 1);
    //FIN DE CLASE         
   }
}