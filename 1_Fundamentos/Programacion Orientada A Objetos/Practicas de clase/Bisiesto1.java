//Introducir un a�o desde teclado e indicar si el a�o es bisiesto no es bisieto

import java.io.*;
public class Bisiesto1
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		int year;
		
		System.out.println("Deme un a�o: ");
		year=Integer.parseInt(br.readLine());
		
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
 		{
			System.out.println("El a�o es bisiesto");
		}	
			else
 			System.out.println("El a�o no es bisiesto");
	}
}