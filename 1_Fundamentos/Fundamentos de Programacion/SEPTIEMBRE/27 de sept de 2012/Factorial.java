import java.io.*;
 
public class Factorial
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr);
 
		System.out.print("Introduce un numero: ");
		int num = Integer.parseInt(br.readLine());
		int i;
		long r = 1;
		for(i = 1; i <= num; i++)
		{
			r = r * i;
		}
		System.out.println("El factorial es: " + r);
		}
		}