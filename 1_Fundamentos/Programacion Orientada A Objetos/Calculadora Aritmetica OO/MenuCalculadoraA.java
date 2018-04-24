import java.io.*;
class MenuCalculadoraA
{
	public void muestraMenu()throws IOException
	{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int x;
		System.out.println("¿QUÉ OPERACION DESEA REALIZAR?");
		System.out.println("1.-SUMA \n 2.-RESTA \n 3.-MULTIPLICACION \n 4.-DIVISION \n");
		x=Integer.parseInt(br.readLine());
		
		CalculadoraA cebollera = new CalculadoraA();
			
		cebollera.eligeOperacion(x);   
		cebollera.realizaOperacion(); 
		cebollera.imprimeResult();
	}
}
