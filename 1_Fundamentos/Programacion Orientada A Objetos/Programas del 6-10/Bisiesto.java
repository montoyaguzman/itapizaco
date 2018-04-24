// Programa 9.- Introducir un año desde teclado en indicar si es año bisiesto o no.
import java.io.*;
public class Bisiesto
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		int year;
		
		System.out.println("Dame un año: ");
		year = Integer.parseInt(br.readLine());
		
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
		{
 			System.out.println("El año es bisiesto");
		}
		else
		{
 			System.out.println("El año no es bisiesto");
		}
		
	}
}