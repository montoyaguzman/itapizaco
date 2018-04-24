import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class ConvierteCadenaABinario
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br1 = new BufferedReader (new InputStreamReader (System.in));
      
      String sCadena = "Esto es una cadena de texto";
      
      for (int x = 0; x < sCadena.length(); x++)
      System.out.println(sCadena.charAt(x) + " = " + sCadena.codePointAt(x));
      
   }
}