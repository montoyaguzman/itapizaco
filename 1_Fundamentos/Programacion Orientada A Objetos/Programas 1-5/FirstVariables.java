/*Programa 4.-Se pediran las siguientes variables desde teclado, a de tipo entero,
b de tipo flotante, c de tipo double y d de tipo caracter o cadena, posteriormente
mostrar esta variables en pantalla*/
import java.io.*;
public class FirstVariables
{
	public static void main (String []args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		float b;
		double c;
		String d;
		
			System.out.print("Dame variable de tipo entero: ");
			a=Integer.parseInt(br.readLine());
			System.out.print("Dame variable de tipo float: ");
			b=Float.parseFloat(br.readLine());
			System.out.print("Dame variable de tipo double: ");
			c=Double.parseDouble(br.readLine());
			System.out.print("Dame variable de tipo String: ");
		   d=br.readLine();

			System.out.println("Tu variable "+a+" es de tipo de entero");
			System.out.println("Tu variable "+b+" es de tipo de float");
			System.out.println("Tu variable "+c+" es de tipo de double");
			System.out.println("Tu variable "+d+" es de tipo de string");
	}	
}	