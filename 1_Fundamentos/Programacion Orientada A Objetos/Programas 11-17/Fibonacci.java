//Programa 16.- Sucesi�n de Fibonacci

import java.io.*;
public class Fibonacci
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int a=0,b=1,n,i;
		
		System.out.println("�Hasta que t�rmino desea calcular la sucesi�n?");
		n=Integer.parseInt(br.readLine());
			
		for(i=0; i<n; i++,b+=a,a=b-a)
		{
			System.out.print(" "+a);
		}
		if (n==0)
		{		
			System.out.print("�Error!, Debe introducir un numero mayor a 0 ");
		}
	}
}