//Hacer un menù para las cuatro operaciones bàsicas

import java.io.*;

public class MenuArtimetico2
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
		float suma,resta,product,quotient,a,b;
		int operacion;
		int resp=0;
		do
		{
		
		System.out.println("¿Que operación necesita usted? ");
		operacion=Integer.parseInt(br.readLine());
		System.out.println("Introduzca primer nùmero: ");
		a=Float.parseFloat(br.readLine());
		System.out.println("Introduzca segundo numero: ");
		b=Float.parseFloat(br.readLine());
		
	
			switch(operacion)
			{
				case 1:
				{
					suma=a+b;
					System.out.println(a+"+"+b+" = "+suma);
				}break;
				case 2:
				{
					resta=a-b;
					System.out.println(a+" - "+b+" = "+resta);
				}break;
				case 3:
				{
					product=a*b;
					System.out.println(a+" x "+b+" = "+product);
				}break;
				case 4:
				{
					quotient=a/b;
					System.out.println(a+" / "+b+" = "+quotient);
				}break;
				
			}
							
					System.out.println("¿Desea continuar ejecutando? RESPUESTA 1.-SI 2.-NO");
					resp=Integer.parseInt(br.readLine());
		}while (resp==1);				
	}
}
