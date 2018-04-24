// Programa 9.- Introducir un a�o desde teclado en indicar si es a�o bisiesto o no.
import java.io.*;
public class Bisiesto
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		int year;
		
		System.out.println("Dame un a�o: ");
		year = Integer.parseInt(br.readLine());
		
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
		{
 			System.out.println("El a�o es bisiesto");
		}
		else
		{
 			System.out.println("El a�o no es bisiesto");
		}
		
	}
}