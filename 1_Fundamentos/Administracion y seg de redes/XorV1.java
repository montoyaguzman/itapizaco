import java.util.*;
import java.io.*;
import javax.swing.*;

public class XorV1
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br1 = new BufferedReader (new InputStreamReader (System.in));
      
      String nombreDelArchivo = "";
      String verificaRenglon = "";
 
      
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
		   break;
		   System.out.print(verificaRenglon);
      }	       
   }
}