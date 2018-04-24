import java.io.*;
public class CalculadoraFinal 
{
	public static void main(String Arg[])throws IOException	
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dimension;
		int filas;
		int columnas;
		int operacion = 0;
		int respuesta = 0;
		
		do
		{
		System.out.println("----------- MENU DE LA GHEZZY ---------\n"
								+"1. Suma de matrices\n"
								+"2. Resta de matrices\n"
								+"3. Multiplicación de matrices\n"
								+"4. Suma de filas\n" 
								+"5. Suma de columnas\n"
								+"6. Diagonal Principal\n"
								+"7. Diagonal Inversa\n");
								
		operacion = Integer.parseInt(br.readLine());
			
		switch (operacion)
		{
			case 1:
			{
				System.out.print ("Ingrese numero de filas para las matrices: ");
				filas = Integer.parseInt(br.readLine());
				System.out.print ("Ingrese numero de columnas para las matrices: ");
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
								
				//________________________________________REALIZANDO SUMA_____________________________________________________________
				
			
				for(int i = 0; i<filas; i++)
				{
					for(int j = 0; j<columnas; j++)
					{
						resultado[i][j] = matriz1[i][j] + matriz2[i][j];
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
				for (int i=0; i<filas;i++)
				{
					for (int j=0;j<columnas;j++)
					System.out.print(resultado[i][j]+ ""+"\t");
					System.out.println("");
				}
			}break;
			
			case 2:
			{
				System.out.print ("Ingrese numero de filas para las matrices: ");
				filas = Integer.parseInt(br.readLine());
				System.out.print ("Ingrese numero de columnas para las matrices: ");
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
								
				//________________________________________REALIZANDO RESTA________________________________________________________
				
			
				for(int i = 0; i<filas; i++)
				{
					for(int j = 0; j<columnas; j++)
					{
						resultado[i][j] = matriz1[i][j]- matriz2[i][j];
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
				for (int i=0; i<filas;i++)
				{
					for (int j=0;j<columnas;j++)
					System.out.print(resultado[i][j]+ ""+"\t");
					System.out.println("");
				}
			}break;
			
			case 3:
			{		
				int matriz1[][];
				int matriz2[][];
				int resultado[][];
				int n; 
				int m;
				int o;
				int p;
				//char q ='q';
				
				System.out.print("Ingresa el tamaño de la primer matriz:\nNúmero de filas:");
				m = Integer.parseInt(br.readLine());
				
				System.out.print("Número de columnas:");
				n = Integer.parseInt(br.readLine());
				
				matriz1 = new int[m][n];
				
				System.out.print("Ingresa el tamaño de la segunda matriz:\nNúmero de filas:");
				o = Integer.parseInt(br.readLine());
				System.out.print("Número de columnas:");
				p = Integer.parseInt(br.readLine());
				
				matriz2 = new int[o][p];
		
					
						if(o == n)
						{
							System.out.println("Ingrese los numeros a guardar en la primera matriz:");
							for(int i=0;i<matriz1.length;i++)
							{
		            		for(int j =0;j<n;j++)
								{
									System.out.print("["+ i +"]["+ j +"] = ");
		               		matriz1[i][j] = Integer.parseInt(br.readLine());
								}
							}
							System.out.println("Ingrese los numeros a guardar en la segunda matriz:");
							for(int i=0;i<matriz2.length;i++)
							{
		            		for(int j =0;j<p;j++)
								{
									System.out.print("["+ i +"]["+ j +"] = ");
		               		matriz2[i][j] = Integer.parseInt(br.readLine());
								}
							}
						
							resultado = new int[m][p];
							for(int k=0;k<matriz1.length;k++)
		   				{ 
		    					for (int j=0;j<p;j++)
		    					{ 
		    						for ( int i=0;i<n;i++ )
									{
		    							resultado[k][j] += matriz1[k][i] * matriz2[i][j];
					 				} 
								}
							}
							
						System.out.println("MATRIZ 1");
						for(int i=0;i<m;i++)
						{
							for (int j=0; j<n; j++)
							{
								System.out.print(matriz1[i][j]+ "\t");
							}
							System.out.println();
						}
						System.out.println("MATRIZ 2");
						for(int i=0; i<o; i++)
						{
							for (int j=0; j<p; j++)
							{
								System.out.print(matriz2[i][j]+ "\t");
							}
							System.out.println();
						}	
							
							System.out.println("Matriz de resultado:");
							for (int j=0;j<resultado.length;j++)
							{
								for(int k=0;k<p;k++)
								{
									System.out.print(resultado[j][k]+"\t");
								}
							System.out.println();
							}
						}
						else
						{
							System.out.println("RECUERDA: \n Solo se pueden multiplicar matrices que cumplan:\n m1[m][n]\n m2[n][k]\n");
						}
						
			}break;
			

			

			case 4:
			{
				int m1[][];
	         //int filas;
	         //int columnas;
	         int sumaTotal;
	         int sumaFilas[];
	         int sumaColumnas[];
		

				
      			System.out.println("Ingrese numero de filas de la matriz");
         		filas = Integer.parseInt(br.readLine());
					
						System.out.println("Ingrese numero de columnas de la matriz");
         		columnas = Integer.parseInt(br.readLine());     
         		sumaFilas = new int[filas];
         		m1 = new int[filas][columnas];
         		
					//LLENANDO LA MATRIZ
         		for (int i=0; i<filas; i++) 
					{
						for (int k=0; k<columnas; k++)
						{
      		         System.out.print("[" + i + "][" + k + "]: ");
							m1[i][k] = Integer.parseInt(br.readLine());
						}
					}

      
					sumaTotal = 0;
         		for (int i=0; i<filas; i++)
 					for (int k=0; k<columnas; k++)
					{
						sumaTotal = sumaTotal + m1[i][k];
						sumaFilas[i] = sumaFilas[i] + m1[i][k];
					}
					// imprimir
					System.out.print ("La suma de filas es ");
         		for (int i=0; i<filas; i++)
         		{
            	for (int k=0; k<columnas; k++)
               	System.out.print(" "+m1[i][k]);
            		System.out.println(" = " + sumaFilas[i]);
         		}
			
			}break;
			
			
			case 5:
			{
				
	   		int m1[][];

	         int sumaTotal = 0;
	         int sumaFilas[];
	         int sumaColumnas[];
	
      			System.out.println("Ingrese numero de filas de la matriz: ");
         		filas = Integer.parseInt(br.readLine());
			
			System.out.println("Ingrese numero de columnas de la matriz: ");
         		columnas = Integer.parseInt(br.readLine());
      
    
         		sumaColumnas = new int[columnas];

         		m1 = new int[filas][columnas];
         		
					//LLENANDO LA MATRIZ
         		for (int i=0; i<filas; i++) 
					{
						for (int k=0; k<columnas; k++)
						{
      		         System.out.print("[" + i + "][" + k + "]: ");
							m1[i][k] = Integer.parseInt(br.readLine());
						}
					}
  
     				// suma por columnas
     				// se intercambian los ciclos, la matriz es nxm
					// aqui usamos como si fuese mxn
      			// sin embargo, usamos la matriz como normalmente
      
					for (int k=0; k<columnas; k++)
					for (int i=0; i<filas; i++)
               sumaColumnas[k] = sumaColumnas[k] + m1[i][k];
      
     				// imprimir
					System.out.println("MATRIZ");
				for(int i=0; i<filas; i++)
				{
					for (int j=0; j<columnas; j++)
					{
						System.out.print(m1[i][j]+ "\t");
					}
					System.out.println("\n");   //CONSIDERALO TMPR
				}
         		
      			System.out.println("La suma de las columnas es: \n");
         		for (int k=0; k<columnas; k++)
            	System.out.print( sumaColumnas[k]+ "\t");
         		System.out.println();
         		System.out.println();    
				
								
			}break;
			
			case 6:
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
			}break;
			
			case 7:
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
			
			
			}
			
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
