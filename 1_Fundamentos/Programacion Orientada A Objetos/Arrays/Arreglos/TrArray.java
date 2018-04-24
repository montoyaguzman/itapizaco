import java.io.*;
public class TrArray
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Indique tamaño del array");
		int tama=Integer.parseInt(br.readLine());
		
		float []b = new float[tama];
		
		for(int i=0;i<tama;i++)
		{
			System.out.println("Agregue el elemento "+(i+1)+" de la lista");
			b[i]=Float.parseFloat(br.readLine());
		}

			System.out.println("Los elementos son:");
			
		for(int j=0;j<10;j++)
		{
			System.out.println("b["+j+"]= "+b[j]);
		}
		
	}
}