import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class XorV2
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br1 = new BufferedReader (new InputStreamReader (System.in));
      
      String nombreDelArchivo = "";
      String verificaRenglon = "";
      char caracteres[];
      String c = "";
      int a = 0;
   
      
      int tamañoDelMensaje = 0;
      int tope = 0; 
      
      System.out.print("Nombre del archivo: ");
      nombreDelArchivo = br1.readLine();
     //System.out.print("Clave de encriptición: ");
     //clave = br1.readLine();
      
      
      FileReader r = new FileReader(nombreDelArchivo);
	   BufferedReader br = new BufferedReader(r);	
		
      
      while (verificaRenglon != null)
		{
			verificaRenglon = br.readLine();
         if (verificaRenglon == null)
		   //{
         break;
		   //}
         //System.out.print(verificaRenglon);
     	   c = verificaRenglon;
//         System.out.print(c);
         
         tamañoDelMensaje = c.length();
         caracteres = new char[tamañoDelMensaje];
         //if (c instanceof String)
         //System.out.println("si");
       //  System.out.println(c);
         for (int i = 0; i <tamañoDelMensaje; i++)
         {
            //c = c.replaceAll(" ","");
            char c1 = c.charAt(i);
            //if (Character.isletter(c1))
            if (Character.isLetter(c1)) 
            //(c.isLetter(char) == true)
            //if ((int(c1)>=65) && (int(c1)<=90) || (int(c1)>=91) && (int(c1)<=122))
            {
               System.out.println(c1);
            }
            else if (c1 == ' ')
            {
            a++;
            System.out.print(a);
            }
            //caracteres[tope] = c1;
            //tope++;
           
         }
         //System.out.print(Arrays.toString(caracteres)+"\n");
         
      }
   }
}