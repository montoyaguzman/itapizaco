import java.util.*;
import java.io.*;
import javax.swing.*;

public class ContadorDeLetras
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      char alfabeto[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      int incrementos[] = new int[25];
      
      String mensaje;
      int tope = 0;
      int tamañoDelMensaje;
      char guardaLetras[];
      int posicionAumentar = 0;
      
      System.out.print("Inserte mensaje: ");
      mensaje = br.readLine();
      mensaje = mensaje.replaceAll(" ","");
      mensaje = mensaje.toUpperCase();
        
      tamañoDelMensaje = mensaje.length();
      
      guardaLetras = new char[tamañoDelMensaje];
      
         
      for (int i = 0; i < tamañoDelMensaje; i++)
      {
         char letra = mensaje.charAt(i);
         for (int j = 0; j<25; j++)
         {
            if (letra == alfabeto[j])
            {
               posicionAumentar = j;
               //System.out.println(j);
               incrementos[posicionAumentar]+=1;
               break;
            }
         }
         
         //if(letra ==)
         guardaLetras[tope] = letra;
         tope++;                         
      }
     
      /*System.out.print("CADENA\n");			
      for(int l = 0; l <= tope-1; l++)
      {
   	   System.out.println("Letra["+l+"]= "+guardaLetras[l]);
	   }
      */
      System.out.print(Arrays.toString(guardaLetras)+"\n");
      
      System.out.print("Alfabeto----->"+Arrays.toString(alfabeto)+"\n");
      System.out.print("Repeticiones: "+Arrays.toString(incrementos)+"\n");     
   }
}