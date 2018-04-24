
/*Hacer un programa que pida desde teclado los datos de una persona que son nombres, apellidos, direccion completa, 
edad, telefono, mostrar la informacion obtenida mostrada en pantalla una linea de texto por cada dato solicitado. 
Poe ejemplo, Nombre: Jesús, en el siguiente renglòn 
Apelldios: Hernández Lopez*/
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
		System.out.println("¿Cuàl es su direcciòn?: ");
		dir=br.readLine();
		System.out.println("¿Cuàntos años tiene?");
		edad=br.readLine();
		System.out.println("¿Cuàl es su numero de telefono?");
		phone=br.readLine();
		System.out.println("¿En què colonia vive?");
		col=br.readLine();
		System.out.println("¿Y su Municipio?");
		muni=br.readLine();
		System.out.println("¿Y su estado?");
		estado=br.readLine();
		System.out.println("Ingrese su còdigo postal");
		codigo=br.readLine();
			
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Direcciòn: "+dir+" Col. "+col+" "+muni+","+estado+" C.P. "+codigo);
		System.out.println("Edad: "+edad);
		System.out.println("Telefono: "+phone);
		
	}
}