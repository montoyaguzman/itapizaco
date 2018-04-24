/*FORMULA
Encriptar --> En(x) = x + n % 27
Desencriptar --> Dn(x) = x - n % 27 
*/
import java.util.*;
import java.io.*;
import javax.swing.*;

public class CesarFinal
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      char alfabeto[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            
      String mensaje;
      char nuevoMensaje;
      int pos = 0;
      int numeroDeElementos = 27;
      int a = 1; //separacion de caracteres
      int desplazamiento = 0; 
      int e = 0; //formula
      int z = 0; //Am + b
      int tama = 0;
      int tope = 0;
      
      System.out.println("¿Que operación desea realizar? \n1.Encriptar\n2.Desencriptar");
      System.out.print("Opcion:");
      int respuesta = Integer.parseInt(br.readLine()); 
      
      System.out.print("Desplazamiento: ");
      desplazamiento = Integer.parseInt(br.readLine());		
         
      System.out.print("Inserte mensaje: ");
      mensaje = br.readLine();
      mensaje = mensaje.toUpperCase();
            
      tama = mensaje.length();
         
      char pila[] = new char[tama];
      
      if (respuesta == 1)
      {   
         for (int i = 0; i < tama; i++)
         {
            char aux1 = mensaje.charAt(i);
               
            if (Character.isWhitespace(aux1))//(aux1.equals(' '))
            {
               pila[tope] = '-';
               tope++;
            }
            else
            {
               for (int j = 0; j<= alfabeto.length; j++)
               {
                  char aux2; 
                  
                  if(aux1 == alfabeto[j])
                  {
                     aux2 = alfabeto[j];
                     pos = j;
                     z = pos + desplazamiento;
                     e = z % numeroDeElementos;
                           
                     for (int k = 0; k <= alfabeto.length; k++)
                     {
                        if (e == k)
                        {
                           nuevoMensaje = alfabeto[k];
                           pila[tope] = nuevoMensaje;
                           tope++;               
                           //break;
                        }
                    } 
                     break;
                  }
               }   
            }
        }
        //IMPRIME PILA
        System.out.print(Arrays.toString(pila));
      }      
      else//DESENCRIPTAR
      {
         for (int i = 0; i < tama; i++)
         {
            char aux1 = mensaje.charAt(i);   
            if (Character.isWhitespace(aux1))//(aux1.equals(' '))
            {
               pila[tope] = '-';
               tope++;
            }
            else
            {
               //REVISAR LLAVES_____________________________________
               for (int j = 0; j<= alfabeto.length; j++)
               {
	               char aux2; 
                    if (aux1 == alfabeto[j])
                    {
                       aux2 = alfabeto[j];
                       pos = j;
                       z = pos - desplazamiento;
                       e = z % numeroDeElementos;
                 
                   if (e < 0)
                   e = e + 27;
   
                   for (int k = 0; k <= alfabeto.length; k++)
                   {
                   	if (e == k)
                   	{
	                      nuevoMensaje = alfabeto[k];
        	                //System.out.println(nuevoMensaje);
                	       pila[tope] = nuevoMensaje;
                     	 tope++;               
                         //break;
                     }
                  } 
                  break;
                 //System.out.println(e);
              }
            }  
               //REVISAR LLAVES_____________________________________            
            }
            
         }System.out.print(Arrays.toString(pila));
      }

//CIERRE DEL METODO MAIN Y LA CLASE
   }
}