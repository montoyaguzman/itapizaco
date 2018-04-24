import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.regex.*;

public class Operaciones{

   BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
   
   int nlineas = 0;
   int lineasEnBlanco = 0;
   int numeroDeClases = 0;
   int numeroDeObjetos = 0;
   int numeroDeMetodos = 0;
   String nombrePrograma = "";
   
   public void leePrograma() throws IOException{
   
      System.out.print("Indique el nombre del programa: ");
      nombrePrograma = br.readLine(); 
      
      if (nombrePrograma.endsWith("java"))
      {
         FileReader r = new FileReader(nombrePrograma);
         BufferedReader br = new BufferedReader(r);	
      		
      		//System.out.println(br.readLine());
      		
         String linea = "";
      		
         while (linea != null)
         {
               
            linea = br.readLine();
                                                
            if (linea == null)
            break;
                  
            if (linea.matches(".*class [A-Z].*")) 
            {
               numeroDeClases++;
            }
                  
            if (linea.matches(".*new.*")) 
            {
               numeroDeObjetos++;
            }
                 
            if ((linea.trim()).matches("")) 
            {
               lineasEnBlanco++;
            }
                        
            if (linea.matches(".*\\([a-zA-Z0-9,_ \\[\\]]*\\)[a-zA-Z0-9.:;,_ \\(\\)]*"+"\\{")) 
            {
               numeroDeMetodos++;
            }
            
            nlineas++;
             
         }
         nlineas = nlineas - lineasEnBlanco;
         System.out.println("DATOS DEL PROGRAMA\nNúmero de lineas: "+nlineas+"\nNúmero de clases: "+numeroDeClases+"\nNúmero de objetos: "+numeroDeObjetos+"\nNúmero de metodos: "+numeroDeMetodos);
      }
      else{System.out.print("Tu archivo no es un programa");}
   }
}