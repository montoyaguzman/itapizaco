
/*Hacer un programa que pida desde teclado los datos de una persona que son nombres, apellidos, direccion completa, 
edad, telefono, mostrar la informacion obtenida mostrada en pantalla una linea de texto por cada dato solicitado. 
Poe ejemplo, Nombre: Jes�s, en el siguiente rengl�n 
Apelldios: Hern�ndez Lopez*/
import java.io.*;
public class Unit2
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nombre,apellidos,dir,edad,phone,col,muni,estado,codigo;
		
		System.out.println("Escriba su nombre: ");
		nombre=br.readLine();
		System.out.println("Deme sus apellidos: ");
		apellidos=br.readLine();
		System.out.println("�Cu�l es su direcci�n?: ");
		dir=br.readLine();
		System.out.println("�Cu�ntos a�os tiene?");
		edad=br.readLine();
		System.out.println("�Cu�l es su numero de telefono?");
		phone=br.readLine();
		System.out.println("�En qu� colonia vive?");
		col=br.readLine();
		System.out.println("�Y su Municipio?");
		muni=br.readLine();
		System.out.println("�Y su estado?");
		estado=br.readLine();
		System.out.println("Ingrese su c�digo postal");
		codigo=br.readLine();
			
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Direcci�n: "+dir+" Col. "+col+" "+muni+","+estado+" C.P. "+codigo);
		System.out.println("Edad: "+edad);
		System.out.println("Telefono: "+phone);
		
	}
}