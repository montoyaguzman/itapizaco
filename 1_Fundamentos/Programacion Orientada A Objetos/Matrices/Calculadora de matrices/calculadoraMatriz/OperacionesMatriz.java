import java.util.*;
public class OperacionesMatriz
{

	int matriz1[][];
	int matriz2[][]; 
	int resultado[][];
	int arregloR[];

	//METODOS DE ENTRADAS
	
	public void leeMatriz1(int m1[][]) 
	{
		matriz1 = m1;
	}
	public void leeMatriz2(int m2[][])
	{
		matriz2 = m2;
	}
		
	//METODOS DE PROCESO
	
	public void realizaSuma ()
	{	
		int f=matriz1.length;
		int c=matriz1[0].length;
		resultado = new int [f][c];
		for(int i = 0; i<f; i++)
		{
			for (int j=0; j<c; j++)
			{	
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
	}
	
	public void realizaResta ()
	{
		int f=matriz1.length;
		int c=matriz1[0].length;
		resultado = new int [f][c];
		
		for(int i = 0; i<f; i++)
		{
			for(int j = 0; j<c; j++)
			{
				resultado[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}
	}
		
	public void realizaMultiplicacion()
	{
		int m = matriz1.length;
		int n = matriz1[0].length;
		int p = matriz2[0].length;
			
		resultado = new int[m][p];
		for(int k=0; k<m; k++)
		{ 
			for (int j=0; j<p; j++)
		  	{ 
		    	for ( int i=0; i<n; i++ )
				{
		    		resultado[k][j] += matriz1[k][i] * matriz2[i][j];
				} 
			}		
		}
	}
	
	public void sumaFilas()
	{
		int f = matriz1.length;
		int c = matriz1[0].length;
		arregloR = new int [f];
		
		int sumaTotal = 0;
      for (int i=0; i<f; i++)
 		for (int k=0; k<c; k++)
		{
			sumaTotal = sumaTotal + matriz1[i][k];
			arregloR[i] = arregloR[i] + matriz1[i][k];
		}

	}
	
	public void sumaColumnas()
	{
		
		int f = matriz1.length;
		int c = matriz1[0].length;
		arregloR = new int [c];

		for(int j=0; j<c; j++)
		{
			int suma=0;
			for(int i=0; i<f; i++)
			{
				suma=suma+matriz1[i][j];
			}
			arregloR[j]=suma;
		}
	}
	
	public void encuentraDiagonalPrincipal()
	{ 
	
		int f=matriz1.length;
		int c=matriz1[0].length;
		resultado = new int [f][f];
		
		for (int i=0; i<f; i++) 
		{
			for (int j = 0; j <c; j++) 
					{
						if (i == j)
						{
						resultado[i][j] = matriz1[f][c] + matriz2[f][c];
						}
					}
		}
	}
		
	public void encuentraDiagonalSecundaria()
	{
		int f=matriz1.length;
		int c=matriz1[0].length;
		resultado = new int [f][c];

		for (int i=f-1; i>=0; i--) 
		{
			for (int k=0; k<f; k++)
			{ 
   	 		if (f-1-i == k) 
				{
					resultado[i][k] = matriz1[f][c]-matriz2[f][c];
				}
			}
		}
	}			
	
	//METODOS DE SALIDA
	
	public int [][] muestraMatriz1()
	{
		return matriz1;
	}
	public int [][] muestraMatriz2()
	{
		return matriz2;
	}
	public int [][] muestraResultado()
	{
		return resultado;
	}
	public int [] muestraArreglo()
	{
		return arregloR;
	}
}