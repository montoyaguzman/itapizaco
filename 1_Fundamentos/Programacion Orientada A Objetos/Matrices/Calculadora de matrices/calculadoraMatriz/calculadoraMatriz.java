import java.util.*;
import java.io.*;
class calculadoraMatriz
{
		OperacionesMatriz calculadora= new OperacionesMatriz();
		
	int m1[][];
	int m2[][];
	int result[][];
	int arreglo[];
	int dimension;
	int operacion = 0;
	int respuesta = 0;
	int f; 
   int c;

		
	public void eligeOperacion(int x)
	{
		operacion = x;
	}
	public void realizaOperacion() throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    	switch (operacion)
		{
			case 1: //SUMA
			{
				System.out.print ("Ingrese número de filas para la matriz: ");
				int f=Integer.parseInt(br.readLine());
				System.out.print ("Ingrese número de columnas para las matriz: ");
				int c=Integer.parseInt(br.readLine());
				
				int m1[][] = new int [f][c];
				int m2[][] = new int [f][c];
				int result[][] = new int [f][c];
				
			//_____________________________________LLENANDO LAS MATRICES_______________________________________________________
				
				System.out.println("Introduce los elementos de la matriz 1");
				for (int i=0; i<f; i++) 
				{
					for (int k=0; k<c; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						m1[i][k] = Integer.parseInt(br.readLine());
					}
				}
				calculadora.leeMatriz1(m1);
				
				System.out.println("Introduce los elementos de la matriz 2");
				for (int i=0; i<f; i++) 
				{
					for (int k=0; k<c; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						m2[i][k] = Integer.parseInt(br.readLine());
					}
				}
				calculadora.leeMatriz2(m2);				
				
				//________________________________________REALIZANDO SUMA_____________________________________________________________
						
				calculadora.realizaSuma();
				
				//_______________________________IMPRIMIENDO MATRICES_________________________________________________________________
				result=calculadora.muestraResultado();
				
				System.out.println("MATRIZ 1");
				for(int i=0;i<f;i++)
				{
					for (int j=0; j<c; j++)
					{
						System.out.print(m1[i][j]+ "\t");
					}
					System.out.println();
				}
				
				System.out.println("MATRIZ 2");
				for(int i=0; i<f; i++)
				{
					for (int j=0; j<c; j++)
					{
						System.out.print(m2[i][j]+ "\t");
					}
					System.out.println();
				}
			
				System.out.println("MATRIZ DE RESULTADO: ");		
				for (int i=0; i<f;i++)
				{
					for (int j=0;j<c;j++)
					System.out.print(result[i][j]+ ""+"\t");
					System.out.println("");
				}
			}break;
			
			case 2:  //RESTA
			{
				System.out.print ("Ingrese número de filas para la matriz: ");
				int f=Integer.parseInt(br.readLine());
				System.out.print ("Ingrese número de columnas para las matriz: ");
				int c=Integer.parseInt(br.readLine());
				
				
				int m1[][] = new int [f][c];
				int m2[][] = new int [f][c];
				int result[][] = new int [f][c];
			//_____________________________________LLENANDO LAS MATRICES_______________________________________________________
				
				System.out.println("Introduce los elementos de la matriz 1");
				for (int i=0; i<f; i++) 
				{
					for (int k=0; k<c; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						m1[i][k] = Integer.parseInt(br.readLine());
					}
				}
				calculadora.leeMatriz1(m1);
				
				System.out.println("Introduce los elementos de la matriz 2");
				for (int i=0; i<f; i++) 
				{
					for (int k=0; k<c; k++)
					{
      	         System.out.print("[" + i + "][" + k + "]: ");
						m2[i][k] = Integer.parseInt(br.readLine());
					}
				}
				calculadora.leeMatriz2(m2);				
				
				//________________________________________REALIZANDO RESTA_____________________________________________________________
						
				calculadora.realizaResta();
				
				//_______________________________IMPRIMIENDO MATRICES_________________________________________________________________
				result=calculadora.muestraResultado();
				
				System.out.println("MATRIZ 1");
				for(int i=0;i<f;i++)
				{
					for (int j=0; j<c; j++)
					{
						System.out.print(m1[i][j]+ "\t");
					}
					System.out.println();
				}
				System.out.println("MATRIZ 2");
				for(int i=0; i<f; i++)
				{
					for (int j=0; j<c; j++)
					{
						System.out.print(m2[i][j]+ "\t");
					}
					System.out.println();
				}
			
				System.out.println("MATRIZ DE RESULTADO: ");		
				for (int i=0; i<f;i++)
				{
					for (int j=0;j<c;j++)
					System.out.print(result[i][j]+ ""+"\t");
					System.out.println("");
				}
			}break;
							
			case 3:  //MULTIPLICACÓN
			{		
				int m1[][];
				int m2[][];
				int n; 
				int m;
				int o;
				int p;
								
	//________________________________________LLENANDO MATRICES___________________________________________________
	
				System.out.print("Ingresa el tamaño de la primer matriz:\nNúmero de filas:");
				m = Integer.parseInt(br.readLine());
				
				System.out.print("Número de columnas:");
				n = Integer.parseInt(br.readLine());
				
				m1 = new int[m][n];
				
				System.out.print("Ingresa el tamaño de la segunda matriz:\nNúmero de filas:");
				o = Integer.parseInt(br.readLine());
				System.out.print("Número de columnas:");
				p = Integer.parseInt(br.readLine());
				
				m2 = new int[o][p];
		
			//________________________________________REALIZANDO MULTIPLICACIÓN_________________________________________________	
				
				if(o == n)
				{
					System.out.println("Ingrese los numeros a guardar en la primera matriz:");
					for(int i=0;i<m1.length;i++)
					{
		       		for(int j =0;j<n;j++)
						{
							System.out.print("["+ i +"]["+ j +"] = ");
		           		m1[i][j] = Integer.parseInt(br.readLine());
						}
					}
					calculadora.leeMatriz1(m1);
					
					System.out.println("Ingrese los numeros a guardar en la segunda matriz:");
					for(int i=0;i<m2.length;i++)
					{
		        		for(int j =0;j<p;j++)
						{
							System.out.print("["+ i +"]["+ j +"] = ");
		           		m2[i][j] = Integer.parseInt(br.readLine());
						}
					}
					calculadora.leeMatriz2(m2);	
			//__________________________________________REALIZA MULTIPLICACIÓN_________________________________________________________
							
					calculadora.realizaMultiplicacion();
				
			//______________________________________________________________________________________________________________________		
				// IMPRIMIENDO MATRICES			
					result=calculadora.muestraResultado();
						
						System.out.println("MATRIZ 1");
						for(int i=0;i<m;i++)
						{
							for (int j=0; j<n; j++)
							{
								System.out.print(m1[i][j]+ "\t");
							}
							System.out.println();
						}
						System.out.println("MATRIZ 2");
						for(int i=0; i<o; i++)
						{
							for (int j=0; j<p; j++)
							{
								System.out.print(m2[i][j]+ "\t");
							}
							System.out.println();
						}	
							
							System.out.println("Matriz de resultado:");
							for (int j=0;j<result.length;j++)
							{
								for(int k=0;k<p;k++)
								{
									System.out.print(result[j][k]+"\t");
								}
							System.out.println();
							}
						}
						else
						{
							System.out.println("RECUERDA: \n Solo se pueden multiplicar matrices que cumplan:\n m1[m][n]\n m2[n][k]\n");
						}				
			}break;
			
			case 4: //SUMA DE FILAS
			{
				int m1[][];
	         int sumaTotal;
	         int sumaFilas[];

				System.out.println("Ingrese número de filas de la matriz: ");
         	f = Integer.parseInt(br.readLine());
				System.out.println("Ingrese número de columnas de la matriz: ");
         	c = Integer.parseInt(br.readLine());
      
         	sumaFilas = new int [f];
         	m1 = new int[f][c];		
		//________________________________________LLENANDO LA MATRIZ__________________________________________________________
         		
					for (int i=0; i<f; i++) 
					{
						for (int k=0; k<c; k++)
						{
      		         System.out.print("[" + i + "][" + k + "]: ");
							m1[i][k] = Integer.parseInt(br.readLine());
						}
					}
					calculadora.leeMatriz1(m1);
					
		//_____________________________________REALIZANDO SUMA DE FILAS____________________________________________________
      
				calculadora.sumaFilas();
     
 		//________________________________________IMPRIMIENDO____________________________________________________________
			 
			 	arreglo = calculadora.muestraArreglo();	
			
				System.out.println("MATRIZ 1");
				for(int i=0;i<f;i++)
				{
					for (int j=0; j<c; j++)
					{
						System.out.print(m1[i][j]+ "\t");
					}
					System.out.println();
				}
							
				System.out.println(Arrays.toString(arreglo));			
			}break;
			
			case 5:     //SUMA DE COLUMNAS
			{
	  			int m1[][];
	     		int sumaTotal = 0;
	     		int sumaColumnas[];

      		System.out.println("Ingrese numero de filas de la matriz: ");
        		f = Integer.parseInt(br.readLine());
			
				System.out.println("Ingrese numero de columnas de la matriz: ");
     		   c = Integer.parseInt(br.readLine());
      
    			sumaColumnas = new int[c];

        	 	m1 = new int[f][c];
         		
	//________________________________________LLENANDO LA MATRIZ______________________________________________________
			
     			for (int i=0; i<f; i++) 
				{
					for (int k=0; k<c; k++)
					{
						System.out.print("[" + i + "][" + k + "]: ");
						m1[i][k] = Integer.parseInt(br.readLine());
					}
				}
  				calculadora.leeMatriz1(m1);
     			//suma por columnas
     			//se intercambian los ciclos, la matriz es nxm
				//aqui usamos como si fuese mxn
   	   	//sin embargo, usamos la matriz como normalmente
	
	//________________________________________SUMA COLUMNAS______________________________________________________
      
			
			calculadora.sumaColumnas();
      
   //____________________________________________IMPRIMIENDO______________________________________________________________
			
			arreglo = calculadora.muestraArreglo();
			
			System.out.println("MATRIZ");
			for(int i=0; i<f; i++)
			{
				for (int j=0; j<c; j++)
				{
					System.out.print(m1[i][j]+ "\t");
				}
					System.out.println("\n");   //CONSIDERALO TMPR
			}
         		
      	System.out.println("La suma de las columnas es: \n");
         System.out.println(Arrays.toString(arreglo));
		
		}break;
			
			case 6:
			{
       		System.out.print ("Ingrese dimension para las matrices: ");
				dimension=Integer.parseInt(br.readLine());
				
	     		int m1[][] = new int [dimension][dimension];
		  
		  		for (int i=0; i<dimension; i++) 
				{
					for (int k=0; k<dimension; k++)
					{
      		   	System.out.print("ingresa valor de [" + i + "][" + k + "]: ");
						m1[i][k] = Integer.parseInt(br.readLine());
							
					}
				}
					
				calculadora.leeMatriz1(m1);
				//	calculadora.encuentraDiagonalPrincipal();
				arreglo = calculadora.muestraArreglo();
				System.out.println("Presentacion de la matriz");
					
				for(int i=0;i<dimension;i++)
				{
					for (int j=0; j<dimension; j++)
					{
						System.out.print(m1[i][j]+ "\t");
					}
					System.out.println();
				}
				
				System.out.println("");
					
				System.out.println("Diagonal Principal");
				for (int i = 0; i <dimension; i++)
				{
				
					System.out.print(m1[i][i] + " ");
						
				}
					System.out.println("\n");
		}break;
	 
	 	case 7:
	 	{
	 		System.out.print ("Ingrese dimension para las matrices: ");
			dimension=Integer.parseInt(br.readLine());
				
	   	int m1[][] = new int [dimension][dimension];
			for (int i=0; i<dimension; i++) 
			{
				for (int k=0; k<dimension; k++)
				{
					System.out.print("ingresa valor de [" + i + "][" + k + "]: ");
					m1[i][k] = Integer.parseInt(br.readLine());
				}
			}
					
			calculadora.leeMatriz1(m1);
			//	calculadora.encuentraDiagonalPrincipal();
			arreglo = calculadora.muestraArreglo();
			System.out.println("Presentacion de la matriz");
		
			for(int i=0;i<dimension;i++)
			{
				for (int j=0; j<dimension; j++)
				{
					System.out.print(m1[i][j]+ "\t");
				}
					System.out.println();
			}
					System.out.println("");
					System.out.println("Diagonal Secundaria");
			
				int k = 0;
				for (int i=dimension-1; i>=0; i--)
				{
					System.out.print(m1[i][k] + " ");
					k++;	
				}
				System.out.println("\n");
			}break;
						
			default:
			{
				System.out.println("¡La operacion elegida no esta diponible! \n Intente de nuevo");
			}
		}	
	}
}

		

