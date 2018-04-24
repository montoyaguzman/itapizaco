import java.io.*;
public class CalculadoraMatrices 
{
	public static void main(String Arg[])throws IOException	
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dimension;
		int operacion = 0;
		int respuesta = 0;
		
		do
		{
		System.out.println("----------- MENU DE LA GHEZZY ---------\n"
								+"1. Suma de matrices\n"
								+"2. Resta de matrices\n"
								+"3. Multiplicación de matrices\n"
								+"4. Suma de filas y columnas de una matriz\n"
								+"5. Hallar diagonales de una matriz\n");
		operacion = Integer.parseInt(br.readLine());
			
		switch (operacion)
		{
			case 1:
			{
				System.out.print ("Ingrese dimension para las matrices: ");
				dimension=Integer.parseInt(br.readLine());
				int matriz1[][] = new int [dimension][dimension];
				int matriz2[][] = new int [dimension][dimension];
				int resultado[][] = new int [dimension][dimension];
				
			//_____________________________________LLENANDO LAS MATRICES_______________________________________________________
				
				System.out.println("Introduce los elementos de la matriz 1");
				for (int i=0; i<dimension; i++) 
				{
					for (int k=0; k<dimension; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						matriz1[i][k] = Integer.parseInt(br.readLine());
					}
				}
				
				System.out.println("Introduce los elementos de la matriz 2");
				for (int i=0; i<dimension; i++) 
				{
					for (int k=0; k<dimension; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						matriz2[i][k] = Integer.parseInt(br.readLine());
					}
				}
								
				//________________________________________REALIZANDO SUMA_____________________________________________________________
				
			
				for(int i = 0; i<dimension; i++)
				{
					for(int j = 0; j<dimension; j++)
					{
						resultado[i][j] = matriz1[i][j]+matriz2[i][j];
					}
				}
				//_______________________________IMPRIMIENDO MATRICES_________________________________________________________________
				
				System.out.println("MATRIZ 1");
				for(int i=0;i<dimension;i++)
				{
					for (int j=0; j<dimension; j++)
					{
						System.out.print(matriz1[i][j]+ "\t");
					}
					System.out.println();
				}
				System.out.println("MATRIZ 2");
				for(int i=0; i<dimension; i++)
				{
					for (int j=0; j<dimension; j++)
					{
						System.out.print(matriz2[i][j]+ "\t");
					}
					System.out.println();
				}
			
				System.out.println("MATRIZ DE RESULTADO: ");		
				for (int i=0; i<dimension;i++)
				{
					for (int j=0;j<dimension;j++)
					System.out.print(resultado[i][j]+ ""+"\t");
					System.out.println("");
				}
			}break;
			
			case 2:
			{		
				System.out.print ("Ingrese dimension para las matrices: ");
				dimension=Integer.parseInt(br.readLine());
				int matriz1[][] = new int [dimension][dimension];
				int matriz2[][] = new int [dimension][dimension];
				int resultado[][] = new int [dimension][dimension];
				
			//_____________________________________LLENANDO LAS MATRICES_______________________________________________________
				
				System.out.println("Introduce los elementos de la matriz 1");
				for (int i=0; i<dimension; i++) 
				{
					for (int k=0; k<dimension; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						matriz1[i][k] = Integer.parseInt(br.readLine());
					}
				}
				
				System.out.println("Introduce los elementos de la matriz 2");
				for (int i=0; i<dimension; i++) 
				{
					for (int k=0; k<dimension; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						matriz2[i][k] = Integer.parseInt(br.readLine());
					}
				}
								
				//________________________________________REALIZANDO SUMA_____________________________________________________________
				
			
				for(int i = 0; i<dimension; i++)
				{
					for(int j = 0; j<dimension; j++)
					{
						resultado[i][j] = matriz1[i][j] - matriz2[i][j];
					}
				}
				//_______________________________IMPRIMIENDO MATRICES_________________________________________________________________
				
				System.out.println("MATRIZ 1");
				for(int i=0;i<dimension;i++)
				{
					for (int j=0; j<dimension; j++)
					{
						System.out.print(matriz1[i][j]+ "\t");
					}
					System.out.println();
				}
				System.out.println("MATRIZ 2");
				for(int i=0; i<dimension; i++)
				{
					for (int j=0; j<dimension; j++)
					{
						System.out.print(matriz2[i][j]+ "\t");
					}
					System.out.println();
				}
			
				System.out.println("MATRIZ DE RESULTADO: ");		
				for (int i=0; i<dimension;i++)
				{
					for (int j=0;j<dimension;j++)
					System.out.print(resultado[i][j]+ ""+"\t");
					System.out.println("");
				}
			}break;
			
			
			case 3:
			{
				System.out.print ("Ingrese dimension para las matrices: ");
				dimension=Integer.parseInt(br.readLine());
				int matriz1[][] = new int [dimension][dimension];
				int matriz2[][] = new int [dimension][dimension];
				int resultado[][] = new int [dimension][dimension];
				
			//_____________________________________LLENANDO LAS MATRICES_______________________________________________________
				System.out.println("Introduce los elementos de la matriz 1");
				for (int i=0; i<dimension; i++) 
				{
					for (int k=0; k<dimension; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						matriz1[i][k] = Integer.parseInt(br.readLine());
					}
				}
				
				System.out.println("Introduce los elementos de la matriz 2");
				for (int i=0; i<dimension; i++) 
				{
					for (int k=0; k<dimension; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						matriz2[i][k] = Integer.parseInt(br.readLine());
					}
				}				
				//_______________________________REALIZANDO MULTIPLICACION__________________________________________________
				
				
				int mult = 0;
				int result[][] = new int[matriz1.length][matriz2.length];
		
			    for ( int i = 0; i <dimension; i++)
			    { 
			    	for ( int j = 0; j <dimension; j++)
			    	{ 
			    	for ( int k = 0; k <dimension; k++ )
			    	resultado[i][j] += matriz1[i][k]*matriz2[k][j];
			
			    	} 
			    }
			    
				 
				  
				//_______________________________IMPRIMIENDO MATRICES_________________________________________________________________
				
				System.out.println("MATRIZ 1");
				for(int i=0;i<dimension;i++)
				{
					for (int j=0; j<dimension; j++)
					{
						System.out.print(matriz1[i][j]+ "\t");
					}
					System.out.println();
				}
				System.out.println("MATRIZ 2");
				for(int i=0; i<dimension; i++)
				{
					for (int j=0; j<dimension; j++)
					{
						System.out.print(matriz2[i][j]+ "\t");
					}
					System.out.println();
				}
			
				System.out.println("MATRIZ DE RESULTADO: ");		
				for (int i=0; i<dimension;i++)
				{
					for (int j=0;j<dimension;j++)
					System.out.print(resultado[i][j]+ ""+"\t");
					System.out.println("");
				}
			}break;
			
			
			
			case 4:
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

				
      			System.out.println("Ingrese dimension de la matriz: ");
         		dimension = Integer.parseInt(br.readLine());
      
         		sumaFilas = new int[dimension];
         		sumaColumnas = new int[dimension];
         		matriz1 = new int[dimension][dimension];
         		
					//LLENANDO LA MATRIZ
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
							System.out.println();						
			}break;
			
			case 5:
			{
				int valor;
				System.out.println("Ingrese dimension de su matriz");
				dimension = Integer.parseInt(br.readLine());
				int matriz1[][] = new int [dimension][dimension];
				
				for (int i=0; i<dimension; i++) 
				{
					for (int k=0; k<dimension; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						matriz1[i][k] = Integer.parseInt(br.readLine());
					}
				}
				System.out.println("Presentacion de la matriz");
				for (int i = 0; i <dimension; i++)
				{
					for (int j = 0; j <dimension; j++)
					{
						System.out.print(matriz1[i][j] + "\t");
						if (j == 2) 
						{
							System.out.print("\n");
						}
					}
				}

		System.out.println("");

				System.out.println("Diagonal Principal");
				for (int i = 0; i <dimension; i++)
				{
					for (int j = 0; j <dimension; j++) 
					{
						if (i == j)
						{
							System.out.print(matriz1[i][j] + " ");
						}
					}
				}

				System.out.println("\n");
				System.out.println("Diagonal Secundaria");
				for (int i = 0; i <dimension; i++) 
				{
					for (int j = 0; j <dimension; j++) 
					{	
						if (i == 0 && j == 2) 
						{
							System.out.print(matriz1[i][j] + " ");
						}
							if (i == 1 && j == 1)
							{
								System.out.print(matriz1[i][j] + " ");
							}
								if (i == 2 && j == 0)
								{
									System.out.print(matriz1[i][j] + " ");
								}
					}
				}System.out.println("\n");
			}break;
			
			default:
			{
				System.out.println("¡La operacion elegida no esta diponible! \n Intente de nuevo");
			}
		}
		System.out.println("¿Desea continuar? RESPUESTA 1. SI   2. NO");
		respuesta = Integer.parseInt(br.readLine());

		}while(respuesta==1);	
	}
}
