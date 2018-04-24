import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class XorFinal
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br1 = new BufferedReader (new InputStreamReader (System.in));
      
      
      String nombreDelArchivo = "";
      String clave = "";
      String verificaRenglon = "";
      char arregloDeCaracteres[];
      String texto = "";
      char characteresDelMensaje;
      int tamañoDelMensaje = 0;
      int tamañoDeLaClave = 0;
      int tope = 0;
      int binario1 = 0; 
      int binario2 = 0;
      char caracteresDeLaClave = ' ';
      int caracterObtenido = 0;
      String almacena = "";
      String nombreDelArchivoDestino = "";
      String tempo = "";
      
      
      
      System.out.print("Nombre del archivo: ");
      nombreDelArchivo = br1.readLine();
      
      System.out.print("Clave: ");
      clave = br1.readLine();
      tamañoDeLaClave = clave.length();
      
      System.out.print("Nombre del archivo de destino: ");
      nombreDelArchivoDestino = br1.readLine();
               
      FileReader r = new FileReader(nombreDelArchivo);
	   BufferedReader br = new BufferedReader(r);
      
      File f = new File (nombreDelArchivoDestino);	
		FileWriter w = new FileWriter(f);
			        BufferedWriter bw = new BufferedWriter(w);
         		  PrintWriter wr = new PrintWriter(bw);
         		     
        
      while (verificaRenglon != null)
		{
			verificaRenglon = br.readLine();
         if (verificaRenglon == null)
		   break;
		   
         texto = verificaRenglon; 
         tamañoDelMensaje = texto.length();
         arregloDeCaracteres = new char[tamañoDelMensaje];
         
         for (int i = 0; i < tamañoDelMensaje; i++)
         {
            char caracteresDelMensaje = texto.charAt(i);
            
            //
            for (int j = 0; j < tamañoDeLaClave; j++)
            {    
                 
                binario1 = (int)caracteresDelMensaje;                 
                binario2 = (int)caracteresDeLaClave;
                caracterObtenido = binario1 ^ binario2;        
                 
                //System.out.println(caracterObtenido);
                 almacena = String.valueOf(caracterObtenido);
                 String almacena2 = "";
                 almacena2 = almacena + almacena2;
                 //System.out.println(almacena2);
                 
                 
                wr.write(almacena2);
              	 //wr.append(almacena2);
            	  
                 
                       
               //if (j > tamañoDeLaClave){ j = 0; }         
            }
         }//LLAVE DEL FOR
            
      }//LAVE DEL WHILE  

wr.close();
            	  bw.close();
//LAVES DEL MAIN Y DE LA CLASE      
   }
}