/* Programa 7.- Insetar desde teclado la edad de una persona e indicar si la persona es un bebe, un niño, 
un adolescente, un adulto o una persona de la tercera edad.*/

import java.io.*;
public class Edad
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		
		System.out.print("¿Cúal es tu edad? \n");
		edad=Integer.parseInt(br.readLine());
		
		if (edad>=0&&edad<2)
		{			
			System.out.print("Eres un bebé");
		}
		if (edad>=2&&edad<9)
		{
			System.out.print("Eres un niño");
		}		
		if (edad>=9&&edad<18)
		{	
			System.out.print("Eres un adolescente");
		}
		if (edad>=18&&edad<60)
		{
			System.out.print("Eres un adulto");
		}
		if (edad>=60&&edad<110)
		{	
			System.out.print("Eres un persona mayor");
		}
	}
}