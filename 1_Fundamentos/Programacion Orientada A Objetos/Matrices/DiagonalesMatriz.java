import java.io.*;

public class DiagonalesMatriz
{
	public static void main (String args []) throws IOException
	{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int dp;
		int di;
		int dimension = 0;
		
		System.out.print ("Ingrese dimension para la matriz: ");
		dimension = Integer.parseInt(br.readLine());
		int matriz[][] = new int [dimension][dimension];
		
		//LLENANDO MATRIZ		
		System.out.println("Introduce los elementos de la matriz");
		for(int i=0;i<dimension;i++)
		{
			for(int j=0;j<dimension;j++)
			matriz[i][j]=Integer.parseInt(br.readLine ());
			//System.out.println("Ingrese [" + i + "][" + j + "]: ");
		}	
		
		//IMPRIMIENDO MATRIZ		
		System.out.println("MATRIZ 1");
		for(int i=0;i<dimension;i++)
		{
		for (int j=0; j<dimension; j++)
		{
			System.out.print(matriz[i][j]+ "\t");
		}
			System.out.println();
		}
		
		//DIAGONALES
		
		
		
		//IMPRIMIENDO DIAGONALES
		
		
	}
}