import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class PruebaXor
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br1 = new BufferedReader (new InputStreamReader (System.in));
    
      
      char a = 'A';
      char b = 'B';
      int binario1 = 0;
      int binario2 = 0;
      int caracterObtenido; 
           
      /*System.out.print("Primer caracter: ");
      a = charAt(br1.readLine());
      
      System.out.print("Segundo caracter: ");
      b = br1.readLine();*/
      
      binario1 = (int)a;//Integer.parseInt(String.valueOf(a));                 
      binario2 = (int)b;
                
      caracterObtenido = binario1 ^ binario2;                
      
      System.out.println(binario1); 
      System.out.println(binario2);
      System.out.println(caracterObtenido);
      
//LAVES DEL MAIN Y DE LA CLASE
   }
}