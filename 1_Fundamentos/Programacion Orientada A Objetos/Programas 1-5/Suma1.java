//Programa 3.- Programa que realize la suma de dos numeros.

import java.io.*;
public class Suma1
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		int b;
		int suma;
		
		System.out.print("Dame a: ");
		a=Integer.parseInt(br.readLine());
		System.out.print("Dame b: ");
		b=Integer.parseInt(br.readLine());
		
		suma=a+b;
					
		System.out.print("La suma de "+a+" y "+b+" es "+suma);
	} 
}