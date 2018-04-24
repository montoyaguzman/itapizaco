//PROGRAMA 13.- Introducir un numero desde teclado y mostrar su tabla de multiplicar

import java.io.*;

public class TablaMultiplicar
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		
		int a;
		
		System.out.println("¿Que tabla de mutliplicar deseas?");
		a=Integer.parseInt(br.readLine());

		for (int i=1; i<=10; i++)
		{
			System.out.println(a +" x " + i + " = " + i*a);
		}
	}
}