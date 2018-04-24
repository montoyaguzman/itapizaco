import java.io.*;
public class MultiplicaMatriz 
{
	public static void main (String args[]) throws IOException	
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int filas,columnas;

		System.out.print ("Ingrese filas de la matrices: ");
		filas = Integer.parseInt(br.readLine());
		System.out.print ("Ingrese columnas de las matrices: ");
		columnas = Integer.parseInt(br.readLine());
		
		int matriz1[][] = new int [filas][columnas];
		int matriz2[][] = new int [filas][columnas];
		int resultado[][] = new int [filas][columnas];
				
		//_____________________________________LLENANDO LAS MATRICES_______________________________________________________
		
		System.out.println("Introduce los elementos de la matriz 1");
		for (int i=0; i<filas; i++) 
		{
			for (int k=0; k<columnas; k++)
			{
				System.out.print("[" + i + "][" + k + "]: ");
				matriz1[i][k] = Integer.parseInt(br.readLine());
			}
		}
				
			System.out.println("Introduce los elementos de la matriz 2");
			for (int i=0; i<filas; i++) 
			{
				for (int k=0; k<columnas; k++)
				{
					System.out.print("[" + i + "][" + k + "]: ");
					matriz2[i][k] = Integer.parseInt(br.readLine());
					}
				}				
				//_______________________________REALIZANDO MULTIPLICACION__________________________________________________
				
				
				int mult = 0;
				int result[][] = new int[matriz1.length][matriz2.length];
		
			    for ( int i = 0; i <filas; i++)
			    { 
			    	for ( int j = 0; j <columnas; j++)
			    	{ 
			    	for ( int k = 0; k <columnas; k++ )
			    	resultado[i][j] += matriz1[i][k]*matriz2[k][j];
			
			    	} 
			    }
			    
				 
				  
				//_______________________________IMPRIMIENDO MATRICES_________________________________________________________________
				
				System.out.println("MATRIZ 1");
				for(int i=0;i<filas;i++)
				{
					for (int j=0; j<columnas; j++)
					{
						System.out.print(matriz1[i][j]+ "\t");
					}
					System.out.println();
				}
				System.out.println("MATRIZ 2");
				for(int i=0; i<filas; i++)
				{
					for (int j=0; j<columnas; j++)
					{
						System.out.print(matriz2[i][j]+ "\t");
					}
					System.out.println();
				}
			
				System.out.println("MATRIZ DE RESULTADO: ");		
				for (int i=0; i<filas; i++)
				{
					for (int j=0; j<columnas; j++)
					System.out.print(resultado[i][j]+ ""+"\t");
					System.out.println("");
				}
	}
}