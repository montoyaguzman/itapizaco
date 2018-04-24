import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

//http://garciac-gaby.blogspot.mx/2011/06/algoritmo-de-encriptacion-xor.html
//http://electronicayciencia.blogspot.mx/2010/05/criptoanalisis-del-cifrado-xor-simple.html

public class XorV3
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br1 = new BufferedReader (new InputStreamReader (System.in));
      
      String nombreDelArchivo = "";
      String clave = "";
      String verificaRenglon = "";
      char arregloDeCaracteres[];
      String texto = "";
      char characteres;
      //int a = 0;
      int tamañoDelMensaje = 0;
      int tope = 0;
      int binario = 0; 
      
      
      System.out.print("Nombre del archivo: ");
      nombreDelArchivo = br1.readLine();
      
      System.out.print("Clave: ");
      clave = br1.readLine();
               
      FileReader r = new FileReader(nombreDelArchivo);
	   BufferedReader br = new BufferedReader(r);	
		  
      while (verificaRenglon != null)
		{
			verificaRenglon = br.readLine();
         if (verificaRenglon == null)
		   break;
		   
         texto = verificaRenglon; 
         tamañoDelMensaje = texto.length();
         arregloDeCaracteres = new char[tamañoDelMensaje];
        
//        arregloDeCaracteres = texto.toCharArray();
        
//        for (int n = 0; n<tamañoDelMensaje; n++)
  //      {char caracteres = (char)(arregloDeCaracteres[n] ^ clave);}
        
         for (int i = 0; i <tamañoDelMensaje; i++)
         {
            //String letra="abcdes";
            //byte[] bina= letra.getBytes();
      
            char caracteres = texto.charAt(i);
            binario = texto.charAt(i);
            
            if (Character.isLetter(caracteres)) 
            {
               binario = Integer.toBinaryString(caracteres);
               //System.out.println(caracters);
               
            }
            
            else if (c1 == ' ')
            {
               //a++;
               //System.out.println(a);
            }
         }
         
         //System.out.print(Arrays.toString(caracteres)+"\n");
         
      }
   }
}