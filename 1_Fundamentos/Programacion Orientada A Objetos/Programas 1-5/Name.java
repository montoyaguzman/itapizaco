/*Programa 5.- Se pedira el nombre de una persona separada por nombre, apellido paterno y apellido materno.
Posteriormente se mostrara el nombre completo en pantalla*/
import java.io.*;
public class Name
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String nombre,ap,am;
		
			System.out.print("Dame tu nombre: ");
			nombre=br.readLine();
			System.out.print("Dame tu apellido paterno: ");
			ap=br.readLine();
			System.out.print("Dame tu apellido materno: ");
			am=br.readLine();
			
			System.out.print("Tu nombre completo es: "+nombre+" "+ap+" "+am+".");
	}
}		 