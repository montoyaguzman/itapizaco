import java.util.*;
import java.io.*;
public class menuMatriz
{ 
	calculadoraMatriz calculadora = new calculadoraMatriz();

//MENU
      public void muestraMenu()throws IOException
		 {
	 
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		int x,operacion = 0,respuesta=0;
		do
		{

		System.out.println("\n\nElija la opción del menú:");
		System.out.println("-______MENU DE LA GHEZZY_____-"+"\n1.Suma de matrices"+"\n2.Resta de matrices"+"\n3.Multiplicación de matrices"+"\n4.Suma de filas "+"\n5.Suma de columnas"+"\n6.Diagonal Principal"+"\n7.Diagonal Secundaria");
		
      x=Integer.parseInt(teclado.readLine());
	
		calculadora.eligeOperacion(x);
		calculadora.realizaOperacion();
			System.out.println("\n ¿Quiere intentarlo de nuevo? \n 1.Si\n2.No");
			respuesta=Integer.parseInt(teclado.readLine());
			}while(respuesta==1);
			//while(confirma.equals("si"));										 
         System.out.print("¡ESO ES TODO OTRO NIVEL  MONTOYA!");															
         									
	}
}	

