// Programa 14.- Programa que muestre las 10 tablas de multiplicar.
public class Tablas
{ 
	public static void main (String [] args) 
	{ 
		int a=1; 
		int b=0; 
		int c=0; 
		System.out.println("Las tablas de multiplicar son: " ) ;

		while (a<=10)
		{ 
			System.out.println("\nLa tabla del " +a+ " es : ") ; 
			b=1; 

			while (b<=10)
			{ 
				c=(a*b); 
				System.out.println(a+ "X" +b+ "=" +c); 
				b++; 
			} 
				a++; 
		} 
	} 
}