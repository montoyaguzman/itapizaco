import java.io.*;
import java.util.*;

public class Prueba1
{
   public static void main (String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      int resp,tama;
      
      //System.out.print("Ingresa cadena: ");
      //String cadena = br.readLine();
      
      //tama = cadena.length();
      
      //int pila[] = new int[tama];
      
      //do
      //{
         System.out.print("Introduzca caracter: ");
         char a = br.readLine().charAt(0);
         
   
         if (Character.isDigit(a)==true)
         {
            System.out.print("\nEso es un numero\n");
         }
         else
         {
            System.out.print("\nEso no es un numero");      
         }
      //System.out.print("\n¿Desea continuar?\n1.- Si\t2.-No\nOpcion: ");
      //resp = Integer.parseInt(br.readLine());
      
      //}while(resp == 1);
      //if (resp == 2){System.out.print("\nFIN DEL PROGRAMA");}
      //System.out.print("\nTamaño pila: "+tama);
      //System.out.print("\nTamaño de la cadena: "+cadena.length());
      //System.out.println(cadena.charAt(0));      
   }
}




//http://www.aulambra.com/programacion/java/ejemplos-de-codigo-java/manejo-de-cadenas-string/
// TOKENIZER http://lineadecodigo.com/java/extraer-contenido-separado-por-delimitadores-con-java/
//http://lineadecodigo.com/java/validar-si-un-dato-es-numerico-con-patrones-en-java/