import java.io.*;

public class FilasColumnas
{
	public static void main (String args[]) throws IOException
	{
	
         int matriz1[][];
         //int filas;
         //int columnas;
         int sumaTotal;
         int sumaFilas[];
         int sumaColumnas[];
			int restaTotal;
         int restaFilas[];
         int restaColumnas[];
	 		int dimension;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
      			System.out.println("Ingrese dimension de la matriz: ");
         		dimension = Integer.parseInt(br.readLine());
      
         		sumaFilas = new int[dimension];
         		sumaColumnas = new int[dimension];
         		matriz1 = new int[dimension][dimension];
         		
         		for (int i=0; i<dimension; i++) 
					{
						for (int k=0; k<dimension; k++)
						{
      		         System.out.print("[" + i + "][" + k + "]: ");
							matriz1[i][k] = Integer.parseInt(br.readLine());
						}
					}
      
					sumaTotal = 0;
         		for (int i=0; i<dimension; i++)
 					for (int k=0; k<dimension; k++)
					{
						sumaTotal = sumaTotal + matriz1[i][k];
						sumaFilas[i] = sumaFilas[i] + matriz1[i][k];
					}
      
     				// suma por columnas
     				// se intercambian los ciclos, la matriz es nxm
					// aqui usamos como si fuese mxn
      			// sin embargo, usamos la matriz como normalmente
      
					for (int k=0; k<dimension; k++)
					for (int i=0; i<dimension; i++)
               sumaColumnas[k] = sumaColumnas[k] + matriz1[i][k];
      
     				// imprimir
         		for (int i=0; i<dimension; i++)
         		{
            	for (int k=0; k<dimension; k++)
               	System.out.print(" "+matriz1[i][k]);
            		System.out.println(" = " + sumaFilas[i]);
         		}
      
         		for (int k=0; k<dimension; k++)
            	System.out.print(" "+ sumaColumnas[k]);
         		System.out.println();
         		System.out.println();
      
         		System.out.print("Suma de diagonal principal: ");
         		int sumDiaPrin = 0;
         		for (int k=0; k<dimension; k++) 
					{
						for (int i=0; i<dimension; i++)
						{
							if (i == k)
							{
								sumDiaPrin = sumDiaPrin + matriz1[i][k];
         		      }
						}
         		}
         				System.out.print(sumDiaPrin);
		}
}