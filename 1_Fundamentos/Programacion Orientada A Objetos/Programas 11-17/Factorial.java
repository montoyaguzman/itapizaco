// Programa 15.- DIse�ar un programa que calcule el fcactorial de un numero.
import java.io.*;
 
public class Factorial
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
	
 		int num,i;
		long r=1;
		
		System.out.print("Deme un n�mero: ");
		num=Integer.parseInt(br.readLine());
		
		for(i = 1; i <= num; i++)
		{
			r = r * i;
		}
			System.out.println("El factorial es: " + r);
	}
}