import java.io.*;

public class Formulario
{
	public static void main (String args[]) throws IOException
	{
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		double b,h,l,area;
		String figura,Triangulo;
		String Respuesta = "";
		
		do
		{
		System.out.println("--------> MEN� <--------\n\n" 
				            + "Triangulo \n"
								+ "Cuadrado \n" 
								+ "Rectangulo \n"
								+ "Rombo \n");
		System.out.print("�De qu� figura desea calcular el �rea?\nFigura: ");
		figura = br.readLine();						
		
		
		
		
		
		
		switch (figura)
		{
		
			case "Triangulo":
			{
				System.out.println("Indicar base del Tri�ngulo");
				b = Double.parseDouble(br.readLine());
				System.out.println("Indicar la altura del Tri�ngulo");
				h = Double.parseDouble(br.readLine());
				
				area = b*h;
				System.out.println("El area es del Triangulo es: "+area);
		
			}break;
			
			case "Cuadrado":
			{
				System.out.println("Indicar dimensi�n de los lados");
				l = Double.parseDouble(br.readLine());
				
				area = l*l;
				System.out.println("El area es del Cuadrado es: "+area);
		
			}break;
			
			case "Rectangulo":
			{
				System.out.println("Indicar base del Rectangulo");
				b = Double.parseDouble(br.readLine());
				System.out.println("Indicar la altura del Rect�ngulo");
				h = Double.parseDouble(br.readLine());
				
				area = b*h;
				System.out.println("El area es del Rect�ngulo es: "+area);
		
			}break;
			
			case "Rombo":
			{
				double Dmayor = 0,Dmenor = 0;
				System.out.println("Indicar Diagonal Mayor");
				Dmayor = Double.parseDouble(br.readLine());
				System.out.println("Indicar Diagonal Menor");
				Dmenor = Double.parseDouble(br.readLine());
				
				area = (Dmayor*Dmenor)/2;
				System.out.println("El area es del Rombo es: "+area);
		
			}break;
			
			case "Paralelogramo":
			{
				System.out.println("Indicar base del Paralelogramo");
				b = Double.parseDouble(br.readLine());
				System.out.println("Indicar la altura del Paralelogramo");
				h = Double.parseDouble(br.readLine());
				
				area = b*h;
				System.out.println("El area es del Paralelogramo es: "+area);
		
			}break;
			
			case "Trapecio":
			{
				System.out.println("Indicar lado menor del Trapecio");
				double LMenor = Double.parseDouble(br.readLine());
				System.out.println("Indicar lado mayor del Trapecio");
				double LMayor = Double.parseDouble(br.readLine());
				System.out.print("Indicar la altura del Trapecio");
				h = Double.parseDouble(br.readLine());
				
				area = ((LMenor*LMayor)/2)*h;
				System.out.println("El area es del Rect�ngulo es: "+area);
		
			}break;
			
			case "Paralelograma 2":
			{
				System.out.println("Indicar lado 1 del paralelogramo");
				double LMenor = Double.parseDouble(br.readLine());
				System.out.println("Indicar lado mayor del Trapecio");
				double LMayor = Double.parseDouble(br.readLine());
				System.out.print("Indicar la altura del Trapecio");
				h = Double.parseDouble(br.readLine());
				
				area = ((LMenor*LMayor)/2)*h;
				System.out.println("El area es del Rect�ngulo es: "+area);
		
			}break;

				
		}
		System.out.println("�Desea continuar?");	
		Respuesta = br.readLine();
		}while (Respuesta.equals("Si")); 	
		
	}
}