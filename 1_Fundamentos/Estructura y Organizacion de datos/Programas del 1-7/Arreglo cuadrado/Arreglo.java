import java.io.*;
import java.util.*;

class Arreglo
{
   Metodos c = new Metodos();
   
   public void llenarArreglo() throws IOException
   {
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
      
      System.out.print("Indique tamaño del arreglo: ");
      int tama = Integer.parseInt(br.readLine());
      
      double a1[] = new double [tama];
      double arregloCua[] = new double [tama];
      double suma[] = new double [tama];
      double mult[] = new double [tama];
				
      System.out.println("\nAhora llena el Arreglo");
	   for(int i = 0; i < tama; i++)
		{
		   System.out.print("Ingrese a["+(i)+"]: ");
			a1[i]=Integer.parseInt(br.readLine());
		}
      
		c.leeArreglo(a1);
      c.elevaAlCuadrado();
      c.SumaArreglo();
      c.MultArreglo();

	   arregloCua = c.muestraCua();
      suma = c.muestraSuma();
      mult = c.muestraMult();
				
      System.out.println("Los elementos del Array 1 son: "+Arrays.toString(a1));	
	   System.out.println("Los elementos del Array 2 son: "+Arrays.toString(arregloCua));
	   System.out.println("Arreglo de resultado: "+Arrays.toString(suma));
      System.out.println("Arreglo de resultado: "+Arrays.toString(mult));		
   }
}