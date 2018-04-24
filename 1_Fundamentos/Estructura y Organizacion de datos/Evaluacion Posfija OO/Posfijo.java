import java.io.*;
import java.util.*;

public class Posfijo
{
   MetodosPosfijo c = new MetodosPosfijo();
   
	public void entraCadena () throws IOException
	{
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int tama;
      
      System.out.print("**_______CALCULADORA POSFIJA_______**\n\n");
      
      System.out.print("Ingresa cadena: ");
      String cadena = br.readLine();

      c.leeCadena(cadena);
      
      tama = cadena.length();
       
      c.leeTamaño(tama);
      c.creaPila();
      
      c.evaluaPosfijo();
      c.muestraPila();      
   }
} 
