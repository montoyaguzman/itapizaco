import java.util.*;
import java.io.*;
import javax.swing.*;

public class Cesar
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      char alfa1[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            
      String mensaje;
      char nuevoMensaje;
      int pos = 0;
      int n = 0; //num de elementos
      int a = 1; //separacion de caracteres
      int b = 0; //desplazamiento
      int e = 0; //formula
      int z = 0; //Am + b
      int tama = 0;
      int tope = 0;
      
      System.out.println("¿Que operación desea realizar? \n1.Encriptar\n2.Desencriptar");
      System.out.print("Opcion:");
      int respuesta = Integer.parseInt(br.readLine());
      
      System.out.print("Numero de Elementos del alfabeto: ");
      n = Integer.parseInt(br.readLine());
         
      System.out.print("Desplazamiento: ");
      b = Integer.parseInt(br.readLine());		
         
      System.out.print("Inserte mensaje: ");
      mensaje = br.readLine();
            
      tama = mensaje.length();
         
      char pila[] = new char[tama];
      
      if (respuesta == 1)
      {   
         for (int i = 0; i < tama; i++)
         {
            char aux1 = mensaje.charAt(i);
            for (int j = 0; j<= alfa1.length; j++)
            {
               char aux2; 
               if(aux1 == alfa1[j])
               {
                  aux2 = alfa1[j];
                  pos = j;
                  z = pos + b;
                  e = z % n;
                  
                  for (int k = 0; k <= alfa1.length; k++)
                  {
                     if (e == k)
                     {
                        nuevoMensaje = alfa1[k];
                        pila[tope] = nuevoMensaje;
                        tope++;               
                        //break;
                     }
                 } 
                  break;
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
            for (int j = 0; j<= alfa1.length; j++)
            {
               char aux2; 
               if (aux1 == alfa1[j])
               {
                  aux2 = alfa1[j];
                  pos = j;
                  z = pos - b;
                  e = z % n;
                  
                  if (e < 0)
                  e = e + 27;
  
                  for (int k = 0; k < alfa1.length; k++)
                  {
                     if (e == k)
                     {
                        nuevoMensaje = alfa1[k];
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
      
         }
        //IMPRIME PILA
        System.out.print(Arrays.toString(pila));
    }
    //FIN DE CLASE     
   }
}