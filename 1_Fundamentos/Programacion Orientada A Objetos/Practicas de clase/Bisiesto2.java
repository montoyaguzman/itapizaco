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
		
		System.out.println("Dame un a�o: ");
		year=Integer.parseInt(br.readLine());
	
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
		
			System.out.println("El a�o es bisiesto");
	
		else
			System.out.println("El a�o no es bisiesto");
			System.out.println("�Desea continuar? RESPUESTA: 1.SI 2.NO");
			resp=Integer.parseInt(br.readLine());


			}while(resp==1);
	}
}