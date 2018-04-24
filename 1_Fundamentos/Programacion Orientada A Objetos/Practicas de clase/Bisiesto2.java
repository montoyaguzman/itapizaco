// Problema 1.- EXAMEN

import java.io.*;
public class Bisiesto2
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		int year,resp=0;
		do
		{
		
		System.out.println("Dame un año: ");
		year=Integer.parseInt(br.readLine());
	
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
		
			System.out.println("El año es bisiesto");
	
		else
			System.out.println("El año no es bisiesto");
			System.out.println("¿Desea continuar? RESPUESTA: 1.SI 2.NO");
			resp=Integer.parseInt(br.readLine());


			}while(resp==1);
	}
}