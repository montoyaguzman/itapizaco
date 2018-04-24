import java.io.*;
import java.util.Arrays;
class ArregloCuadrado 
{
	public static void main (String a[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in)); 
      
      double num = 0;
      double num1 = 0;
      
      System.out.print("Indique tamaño del arreglo: ");
      int tama = Integer.parseInt(br.readLine());

		double arreglo1[] = new double[tama];
		double arreglo2[] = new double[tama];
		double suma [] = new double [tama];
		double mult [] = new double [tama];
      
		//LLENANDO EL ARREGLO
      
	   for (int i = 0; i < arreglo1.length; i++)
		{
			System.out.print("a[" + i + "]: ");
			arreglo1[i] = Double.parseDouble(br.readLine());
		}
      
      // EL MENOR DEL ARREGLO
      for(int i = 0; i < arreglo1.length; i++)
      {
         if(arreglo1[i] < num)
         {
            num = arreglo1[i];
         }
      }
      
      // EL MAYOR DEL ARREGLO
      for(int i = 0; i < arreglo1.length; i++)
      {
         if(arreglo1[i] > num1)
         {
            num1 = arreglo1[i];
         }
      }
		
		//ELEVAR ARREGLO AL CUADRADO
		for (int i = 0; i < arreglo1.length;i++)
		{
			arreglo2[i] = Math.pow(arreglo1[i],2);
		}
		
		//Suma de arreglos
		for(int i = 0; i < arreglo1.length; i++)
		{	
			suma[i] = arreglo1[i] + arreglo2[i];
		}
		
		//Multiplicacion de arreglos
		for(int i = 0; i < arreglo1.length; i++)
		{	
			mult[i] = arreglo1[i] * arreglo2[i];
		}
			
		//SALIDA
		System.out.println("\nArreglo original\n"+Arrays.toString(arreglo1));
      System.out.print("\nEl numero menor en el arreglo es: "+num);
      System.out.print("\nEl numero mayor en el arreglo es: "+num1);
		System.out.println("\n\nArreglo al cuadrado\n"+Arrays.toString(arreglo2));
      System.out.println("\nArreglo Suma\n"+Arrays.toString(suma));
      System.out.println("\nArreglo Multiplicación\n"+Arrays.toString(mult));
	}
}