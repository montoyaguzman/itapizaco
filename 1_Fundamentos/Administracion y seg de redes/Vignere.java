import java.util.*;
import java.io.*;
import javax.swing.*;

public class Vignere
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      char alfa1[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            
      String mensaje;
      String clave;
      char nuevoMensaje = ' ';
      int p1 = 0;
      int p2 = 0;
      int y = 0;
      int tama = 0;
      int n = 0;
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
                  
            tama = mensaje.length();
            n = clave.length();
               
            char pila[] = new char[tama];
            
           for (int i = 0; i < tama; i++)
           {
              char aux1 = mensaje.charAt(i);
              for (int j = 0; j < alfa1.length; j++)
              {            
                  if(aux1 == alfa1[j])
                  {
                    p1 = j;
                    //System.out.print(p1+" "); //pos1
                    
                    //
                    //for (int k = 0; k < mensaje.length(); k++)
                    if(k >= n)
                    //{
                        k = 0;
                    //}              
                    while(k < mensaje.length())
                    {
                        char aux3 = clave.charAt(k);
                        for (int l = 0; l <= alfa1.length; l++)
                        {
                                       
                           if (aux3 == alfa1[l])
                           {
                              p2 = l;
                              //System.out.print(p2+" ");
                              y = (p1 + p2) % 27;
                             
                              for (int m = 0; m <= alfa1.length; m++)
                              {
                                 if (y == m)
                                 {
                                    nuevoMensaje = alfa1[m];
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
      }
      else if (respuesta == 2)
      {
         //   
         System.out.print("Inserte mensaje: ");
            mensaje = br.readLine();
            
            System.out.print("Inserte clave: ");
            clave = br.readLine();
                  
            tama = mensaje.length();
            n = clave.length();
               
            char pila[] = new char[tama];
            
           for (int i = 0; i < tama; i++)
           {
              char aux1 = mensaje.charAt(i);
              for (int j = 0; j < alfa1.length; j++)
              {            
                  if(aux1 == alfa1[j])
                  {
                    p1 = j;
                    //System.out.print(p1+" "); //pos1
                    
                    //
                    //for (int k = 0; k < mensaje.length(); k++)
                    if(k >= n)
                    //{
                        k = 0;
                    //}              
                    while(k < mensaje.length())
                    {
                        char aux3 = clave.charAt(k);
                        for (int l = 0; l <= alfa1.length; l++)
                        {
                                       
                           if (aux3 == alfa1[l])
                           {
                              p2 = l;
                              //System.out.print(p2+" ");
                              y = (p1 - p2) % 27;
                             
                              if (y < 0)
                              y = y + 27;
                              
                              for (int m = 0; m <= alfa1.length; m++)
                              {
                                 if (y == m)
                                 {
                                    nuevoMensaje = alfa1[m];
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