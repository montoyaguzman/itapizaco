import java.io.*;
class OperandoArreglos
{
	public void operaArrays()throws IOException
	{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		CapMuArreglos ele = new CapMuArreglos();
		
		//
		System.out.println("Los elementos del Array 1 son:\n");
		for (int i=0; i<5; i++)
		{
			System.out.println("array1["+i+"]="+ele.array1[i]);
		}
		
		//
		System.out.println("\nLos elementos del Array 2 son:\n");
      for(int i=0; i<10; i++) 
		{
			ele.leeArreglo2();
         System.out.println("array2["+i+"]="+ele.array2[i]);
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