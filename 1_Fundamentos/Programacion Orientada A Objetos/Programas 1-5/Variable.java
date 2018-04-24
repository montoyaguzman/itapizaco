//Programa 2.-Programa que introduzca una variable desde teclado y la muestre en pantalla.
import java.io.*;
public class Variable
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		
		int a;
		System.out.print("Dame elk valor de a: ");
		a=Integer.parseInt(br.readLine());
		System.out.print("El valor de a es: "+a);
	}
}