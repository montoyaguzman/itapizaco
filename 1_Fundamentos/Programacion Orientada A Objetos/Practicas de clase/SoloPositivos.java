// Introducir una serie de numeros y parar cuando se intrduzca unmero negativo, al final indicar cuantos numero entraron
import java.io.*;
public class SoloPositivos
{
	public static void  main (String []args) throws IOException
	{

		int numero,cont=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
		
		System.out.println("Deme números");
		numero=Integer.parseInt(br.readLine());
		cont++;
		}while(numero>=0);
		//if(numero<0)
		System.out.println("Programa finalizado");
		System.out.println("Introduciste "+cont+" números");
		
	}
}