//programa 16: Calcular el fibonacci.//

import java.io.*;

public class Fibonacci
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

		int actual=0;
		int penultimo=0;
		int ultimo=1;
		int grado=0;
		
		System.out.print("Ingrese el grado de la serie de Fibonacci: ");
		grado=Integer.parseInt(leer.readLine());
		
		if(grado==1)
		{
			System.out.println(" "+penultimo);
		}
		else
		{
			if(grado==2)
			{
				System.out.println(" "+penultimo+" "+ultimo);
			}
			else
			{
				if(grado>=3)
				{
					System.out.print(" "+penultimo+" "+ultimo);
					for(int i=3;i<=grado;i++)
					{
						actual=penultimo+ultimo;
						penultimo=ultimo;
						ultimo=actual;
						System.out.print(" "+actual);
					}
				}
				else
				{
					System.out.println("El grado debe ser mayor a cero");
				}
				System.out.println();
			}
		}
	}
}


