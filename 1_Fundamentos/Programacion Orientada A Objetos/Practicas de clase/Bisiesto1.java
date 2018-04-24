//Introducir un año desde teclado e indicar si el año es bisiesto no es bisieto

import java.io.*;
public class Bisiesto1
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		int year;
		
		System.out.println("Deme un año: ");
		year=Integer.parseInt(br.readLine());
		
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
 		{
			System.out.println("El año es bisiesto");
		}	
			else
 			System.out.println("El año no es bisiesto");
	}
}