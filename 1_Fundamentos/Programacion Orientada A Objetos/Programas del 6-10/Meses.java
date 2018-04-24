// Programa 8.- Indicar un numero desde teclado, de 1-12 e indicar a que mes le corresponde.
import java.io.*;
public class Meses 
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));	
		
		int mes;
		System.out.print("Dame un mes: ");
		mes =Integer.parseInt(br.readLine());

   	switch(mes)
		{
			case 1:
			{
			System.out.println("El mes 1 es: Enero");
			}break;
			case 2:
			{
			System.out.println("El mes 2 es: Febrero");
			}break;
			case 3:
			{
			System.out.println("El mes 3 es: Marzo");
			}break;
			case 4:
			{
			System.out.println("El mes 4 es: Abril");
			}break;
			case 5:
			{
			System.out.println("El mes 5 es: Mayo");
			}break;
			case 6:
			{
			System.out.println("El mes 6 es: Junio");
			}break;
			case 7:
			{
			System.out.println("El mes 7 es: Julio");
			}break;
			case 8:
			{
			System.out.println("El mes 8 es: Agosto");
			}break;
			case 9:
			{
			System.out.println("El mes 9 es: Septiembre");
			}break;
			case 10:
			{
			System.out.println("El mes 10 es: Octubre");
			}break;
			case 11:
			{
			System.out.println("El mes 11 es: Noviembre");
			}break;
			case 12:
			{
			System.out.println("El mes 12 es: Diciembre");
			}break;
			default:
			{
			System.out.println("Mes fuera de rango");
			}
		}
	}
}