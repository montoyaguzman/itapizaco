import java.io.*;
public class Teclado
{
	public int leeEntero()
	{
		boolean bandera=false;
		int dato=0;
		
		while(!bandera)
		{
			try
			{
				BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
				dato=Integer.parseInt(br.readLine());
				bandera=true;
			}
			
				catch(Exception dato)
				{
					System.out.print("El número que usted introdujo no es un entero");
					bandera=false;
				}
			}
			return dato;
	}
}