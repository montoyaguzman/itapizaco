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
		System.out.println("--------> MENÚ <--------\n\n" 
				            + "Triangulo \n"
								+ "Cuadrado \n" 
								+ "Rectangulo \n"
								+ "Rombo \n");
		System.out.print("¿De qué figura desea calcular el área?\nFigura: ");
		figura = br.readLine();						
		
		
		
		
		
		
		switch (figura)
		{
		
			case "Triangulo":
			{
				System.out.println("Indicar base del Triángulo");
				b = Double.parseDouble(br.readLine());
				System.out.println("Indicar la altura del Triángulo");
				h = Double.parseDouble(br.readLine());
				
				area = b*h;
				System.out.println("El area es del Triangulo es: "+area);
		
			}break;
			
			case "Cuadrado":
			{
				System.out.println("Indicar dimensión de los lados");
				l = Double.parseDouble(br.readLine());
				
				area = l*l;
				System.out.println("El area es del Cuadrado es: "+area);
		
			}break;
			
			case "Rectangulo":
			{
				System.out.println("Indicar base del Rectangulo");
				b = Double.parseDouble(br.readLine());
				System.out.println("Indicar la altura del Rectángulo");
				h = Double.parseDouble(br.readLine());
				
				area = b*h;
				System.out.println("El area es del Rectángulo es: "+area);
		
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
				System.out.println("El area es del Rectángulo es: "+area);
		
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
				System.out.println("El area es del Rectángulo es: "+area);
		
			}break;

				
		}
		System.out.println("¿Desea continuar?");	
		Respuesta = br.readLine();
		}while (Respuesta.equals("Si")); 	
		
	}
}