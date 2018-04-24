import java.util.*;
import java.io.*;
class MenuArreglos
//SOLO PARA ELEGIR OPCION
{
	CalculadoraArray c = new CalculadoraArray();
	public void muestraMenu()throws IOException
	{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int x,operacion = 0,respuesta=0;
		do
		{
			System.out.println("----------Menú----------");
		
			System.out.println("1.- Suma de arreglos \n" 
								+"2.- Resta de arreglos \n" 
								+"3.- Multiplicacion De Arreglos \n"
								+"4.- Ordenamiento Burbuja\n" 
								+"5.- Búsqueda secuencial");
			x=Integer.parseInt(br.readLine());
		
			c.eligeOperacion(x);
			c.realizaOperacion();
			System.out.println("¿Desea continuar? RESPUESTA 1. SI   2. NO");
			respuesta=Integer.parseInt(br.readLine());
			}while(respuesta==1);
		
			//System.out.println("Los elementos del Array 1 son: "+Arrays.toString(arreglo1));	
			//System.out.println("Los elementos del Array 2 son: "+Arrays.toString(arreglo2));
	}

}	
