/*PROGRAMA 6.- /*Programa que resuelve ecuaciones cuadraticas por formula general*/

import java.io.*;

public class Funcion
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));

		String valor;
		int a,b,c,md;
		double d,e,x1,x2;

		System.out.println("Ingrese el termino A: ");
		a=Integer.parseInt(br.readLine());
		System.out.println("Ingrese el termino B");
		b=Integer.parseInt(br.readLine());
		System.out.println("Ingrese termino");
		c=Integer.parseInt(br.readLine());

		d=((Math.pow(b,2))-(4*a*c));
		e=Math.sqrt(d);
		md=(2*a);
		x1=(-b+e)/(md);
		x2=(-b-e)/(md);

		if (d > 0)
		{
			System.out.println("El Descriminante es: "+d);
			System.out.println("La raiz x1 es: "+x1); 
			System.out.println("La raiz x2 es: "+x2);
		}
		if (d==0)
		{
			System.out.println("El Descriminante es: "+d);
			System.out.println("Existe una raiz real");
			System.out.println("La raiz es: "+x1);	
		}		
		if(d<0)
		{
			System.out.println("El Descriminante es: "+d);
			System.out.print("La raiz es negativa, el resultado cae en el conjunto de los numeros imaginarios");
		}

	}
}