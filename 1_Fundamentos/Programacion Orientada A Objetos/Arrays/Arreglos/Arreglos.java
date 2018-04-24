import java.io.*;
public class Arreglos
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	
		int array1[]={0,1,2,3,4};
		
		System.out.println("Los elementos del Array 1 son:\n");
		for (int i=0; i<5; i++)
		{
			System.out.println("array1["+i+"]="+array1[i]);
		}
		System.out.println("\nLos elementos del Array 2 son:\n");
		
		int array2[] = new int[10];
		for(int i=0;i<10;i++)
		{
			//System.out.println("Ingrese el elemento "+(i+1)+" de la lista");
			array2[i]=i*2;//Integer.parseInt(br.readLine());
			System.out.println("array2["+i+"]="+array2[i]);
		}
		
		for(int i=0;i<10;i++)
		{
			array2[i]=(i*2);
		}
		
		System.out.println("\nSeleccione tamaño del array");
		int tama=Integer.parseInt(br.readLine());
		float []array3= new float[tama];
		
		for(int i=0;i<tama;i++)
		{
			System.out.println("Ingrese el elemento "+(i+1)+" de la lista");
			array3[i]=Float.parseFloat(br.readLine());
		}
		System.out.println("Los elementos del Array 3 son:\n");
			
		for(int i=0;i<10;i++)
		{
			System.out.println("array3["+i+"]="+array3[i]);
		}	
	}
}