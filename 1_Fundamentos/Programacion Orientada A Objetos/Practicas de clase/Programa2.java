/*Introducvir desde teclado una hora del dia e indicar si es de madrugada, mañana tarde o noche
ademas si la hora es mayor de 23 o menos de cero que envie un letreo que diga hora fuera rango*/

import java.io.*;
public class Programa2
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int hora;
		
		System.out.print("Deme una hora: ");
		hora=Integer.parseInt(br.readLine());		
		
		if (hora>=0&&hora<=6)
		{
			System.out.print("Es de madrugada");
		}		
				if(hora>6&&hora<=12)
				{
					System.out.print("Es de mañana");
				}
					if(hora>12&&hora<=19)
					{
						System.out.print("Es tarde");
					}	
						if(hora>19&&hora<=23)
						{
							System.out.print("Es noche");
						}
							if (hora<0&&hora>24)
							{
								System.out.print("Hora fuera de rango");
							}
	}
}								
		
		
		
		
		