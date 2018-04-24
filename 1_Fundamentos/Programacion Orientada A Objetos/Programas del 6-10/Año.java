/* Programa 10.- Introducir un año desde teclado y un mes. Indicar que mes es y cuantos dias tiene.
Tomar en cuenta Febrero si es año bisiesto*/

import java.io.*;
public class Año
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
		
		int mes,year;
		
		System.out.print("Deme mes: ");
		mes=Integer.parseInt(br.readLine());
		System.out.print("Deme año: ");
		year=Integer.parseInt(br.readLine());
		
		boolean b;
						
		switch(mes)
		{
			case 1:
			{
				System.out.println("El mes 1 es: Enero");
				System.out.println("Enero tiene 31 dias");
			}break;
			case 2:
			{
				if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
 				{
					b=true;
					System.out.println("El mes 2 es: Febrero");
					System.out.println("Febrero tiene 29  dias");
				}
				else
				{
					System.out.println("El mes 2 es: Febrero");
					System.out.println("Febrero tiene 28 dias");
				}
			}break;
			case 3:
			{
				System.out.println("El mes 3 es: Marzo");
				System.out.println("Marzo tiene 31  dias");
			}break;
			case 4:
			{
				System.out.println("El mes 4 es: Abril");
				System.out.println("Abril tiene 30 dias");
			}break;
			case 5:
			{
				System.out.println("El mes 5 es: Mayo");
				System.out.println("Mayo tiene 31 dias");
			}break;
			case 6:
			{
				System.out.println("El mes 6 es: Junio");
				System.out.println("Junio tiene 31 dias");
			}break;
			case 7:
			{
				System.out.println("El mes 7 es: Julio");
				System.out.println("Julio tiene 30 dias");
			}break;
			case 8:
			{
				System.out.println("El mes 8 es: Agosto");
				System.out.println("Agosto tiene 31 dias");
			}break;
			case 9:
			{
				System.out.println("El mes 9 es: Septiembre");
				System.out.println("Septiembre tiene 31 dias");
			}break;
			case 10:
			{
				System.out.println("El mes 10 es: Octubre");
				System.out.println("Octubre tiene 30 dias");
			}break;
			case 11:
			{
				System.out.println("El mes 11 es: Noviembre");
				System.out.println("Noviembre tiene 31 dias");
			}break;
			case 12:
			{
				System.out.println("El mes 12 es: Diciembre");
				System.out.println("Diciembre tiene 31 dias");
			}break;
			default:
			{
				System.out.println("Mes fuera de rango. \n¡Por favor verifique su número!");
			}
		}
	}
}