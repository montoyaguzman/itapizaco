import java.io.*;
public class Tablas10
{
	public static void main (String [] args)
	{

		int i,j;
		System.out.println("Estas son las tablas de multiplicar");

		for(i=1;i<=10;i++)
		{
			System.out.println("\nLa tabla del " +i+ " es : "); 
			for(j=1;j<=10;j++)
			{
				System.out.println(" "+i+"x"+j+"="+(i*j));
			}
		}
		 
	}
}