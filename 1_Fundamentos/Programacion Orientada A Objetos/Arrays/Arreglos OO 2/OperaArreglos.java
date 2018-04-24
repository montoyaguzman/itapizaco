import java.io.*;
class OperaArreglos
{
	public void operaArrays()throws IOException
	{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		ArreglosOp ele = new ArreglosOp();
		
		//ARRAY 1
		System.out.println("\nSeleccione tamaño del array");
		int tama=Integer.parseInt(br.readLine());
		float []array1= new float[tama];
		
		for(int i=0;i<tama;i++)
		{
			System.out.println("Ingrese el elemento "+(i+1)+" de la lista");
			array1[i]=Float.parseFloat(br.readLine());
		}
		System.out.println("Los elementos del Array 3 son:\n");
			
		for(int i=0;i<10;i++)
		{
			System.out.println("array3["+i+"]="+array1[i]);
		}	
		/*System.out.println("\nLos elementos del Array 2 son:\n");
      for(int i=0; i<10; i++) 
		{
			ele.leeArreglo2();
         System.out.println("array2["+i+"]="+ele.array2[i]);
      }*/
		
	

	}
}