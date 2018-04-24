import java.util.Arrays;
import java.io.*;
public class CalculadoraArray
{
	LecturaDeArreglos calculadoraA = new LecturaDeArreglos();
	
	int a1 [];
	int a2 [];
	int result[];
	int NumeroABuscar;
	int operacion;
	int posicion;
	//int respuesta = 0;
	
	public void eligeOperacion(int x)
	{
		operacion = x;
	}
	public void realizaOperacion() throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		//do
		//{
		
		switch(operacion)
		{
			 	
			case 1:
			{
				System.out.println("\nSeleccione tamaño para los Arreglos");
				int tama=Integer.parseInt(br.readLine());
				int []a1= new int[tama];
				System.out.println("\nAhora llena el Arreglo 1");
				for(int i=0; i<tama; i++)
				{
					System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
					a1[i]=Integer.parseInt(br.readLine());
				}
				calculadoraA.leeArreglo1(a1);
				//System.out.println("\nSeleccione tamaño del Array 2");
				//tama1=Integer.parseInt(br.readLine());
				System.out.println("\nAhora llena el Arreglo 2");
				int []a2= new int[tama];
		
				for(int i=0; i<tama; i++)
				{
					System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
					a2[i]=Integer.parseInt(br.readLine());
				}
				calculadoraA.leeArreglo2(a2);
				
				calculadoraA.realizaSuma();
				
				result = calculadoraA.muestraResultado();
				System.out.println("Los elementos del Array 1 son: "+Arrays.toString(a1));	
				System.out.println("Los elementos del Array 2 son: "+Arrays.toString(a2));
				System.out.println("Arreglo de resultado: "+Arrays.toString(result));	
			 }break;
			
			case 2:
			{
				System.out.println("\nSeleccione tamaño para los Arreglos");
				int tama=Integer.parseInt(br.readLine());
				int []a1= new int[tama];
				System.out.println("\nAhora llena el Arreglo 1");
				for(int i=0; i<tama; i++)
				{
					System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
					a1[i]=Integer.parseInt(br.readLine());
				}
				calculadoraA.leeArreglo1(a1);
				//System.out.println("\nSeleccione tamaño del Array 2");
				//tama1=Integer.parseInt(br.readLine());
				int []a2= new int[tama];
				System.out.println("\nAhora llena el Arreglo 2");		
				for(int i=0; i<tama; i++)
				{
					System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
					a2[i]=Integer.parseInt(br.readLine());
				}
				calculadoraA.leeArreglo2(a2);
				
				calculadoraA.realizaResta();
				
				result = calculadoraA.muestraResultado();
				System.out.println("Los elementos del Array 1 son: "+Arrays.toString(a1));	
				System.out.println("Los elementos del Array 2 son: "+Arrays.toString(a2));
				System.out.println("Arreglo de resultado: "+Arrays.toString(result));
			}break;
			 	
			case 3:
			{
				System.out.println("\nSeleccione tamaño para los Arreglos");
				int tama=Integer.parseInt(br.readLine());
				int []a1= new int[tama];
				System.out.println("\nAhora llena el Arreglo 1");
				for(int i=0; i<tama; i++)
				{
					System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
					a1[i]=Integer.parseInt(br.readLine());
				}
				calculadoraA.leeArreglo1(a1);
				//System.out.println("\nSeleccione tamaño del Array 2");
				//int tama1=Integer.parseInt(br.readLine());
				System.out.println("\nAhora llena el Arreglo 2");
				int []a2= new int[tama];
				
				for(int i=0; i<tama; i++)
				{
					System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
					a2[i]=Integer.parseInt(br.readLine());
				}
				calculadoraA.leeArreglo2(a2);
				
				calculadoraA.realizaMultiplicacion();
				
				result = calculadoraA.muestraResultado();
				System.out.println("Los elementos del Array 1 son: "+Arrays.toString(a1));	
				System.out.println("Los elementos del Array 2 son: "+Arrays.toString(a2));
				System.out.println("Arreglo de resultado: "+Arrays.toString(result));
			}break;
			
//________________________________________________________________________________________________________________________
			
			 case 4: 
               {
						System.out.println("\nSeleccione tamaño del Array 1");
						int tama=Integer.parseInt(br.readLine());
						int []a1= new int[tama];
						System.out.println("\nAhora llena el Arreglo 1");
						for(int i=0; i<tama; i++)
						{
							System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
							a1[i] = Integer.parseInt(br.readLine());
						}
							System.out.println("Los elementos del Array 1 son: "+Arrays.toString(a1));
							calculadoraA.leeArreglo1(a1);
							
							calculadoraA.realizaOB();
							result = calculadoraA.muestraResultado();	
							System.out.println("Array ordenado : "+Arrays.toString(a1));
								
					}break;
            
            case 5: 
            {
					//PROYECTO MONTOYITA
               System.out.println("\nSeleccione tamaño del Array 1");
					int tama=Integer.parseInt(br.readLine());
					int []a1= new int[tama];
		
					for(int i=0; i<tama; i++)
					{
						System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
						a1[i] = Integer.parseInt(br.readLine());
					}
						calculadoraA.leeArreglo1(a1);
						
						System.out.println("¿Què elemento desea buscar?");
						NumeroABuscar = Integer.parseInt(br.readLine());
						calculadoraA.leeNumABuscar(NumeroABuscar);
						System.out.print("\n\nBusqueda Secuencial\nNumero que se desea buscar: " + NumeroABuscar+"\n");
						
						calculadoraA.BusquedaSecuencial();
						
						posicion = calculadoraA.muestraPosicion();

						System.out.println("El Arreglo es : "+Arrays.toString(a1));
						if(posicion>=0)
							System.out.println("Elemento encontrado en la posicion a["+posicion+"]");
						else
							System.out.println("Elemento NO encontradO");
	     				}	
						
				
					//int lim = result.length;				
				/*	System.out.println("\nSeleccione tamaño del Array 1");
					int tama=Integer.parseInt(br.readLine());
					int []a1= new int[tama];
		
					for(int i=0; i<tama; i++)
					{
						System.out.println("Ingrese el elemento a["+(i)+"] de la lista");
						a1[i] = Integer.parseInt(br.readLine());
					}
					
					System.out.println("¿Qué número desea buscar?");
					NumeroABuscar = Integer.parseInt(br.readLine());
               
					System.out.println("Número buscado:" + NumeroABuscar);
					for(int i=0; i<a1.length; i++)
					{ 
						if (NumeroABuscar == a1[i])
						{
							int posicion = i;
     						System.out.println("ubicado en la posicion: " + posicion );
							break;
						}
                  	else 
							{
								if (i==a1.length-1)
								{
									System.out.println("No se encontro ese número");
                        }
                     }
               }*/
				break;
//________________________________________________________________________________________________________________________

			default:
			{
				System.out.println("ELEGI OTRA OPCION, ESA OPCION NO ESTA DSIPONIBLE!");
			}
		}
			/*System.out.println("¿Desea continuar? RESPUESTA 1. SI   2. NO");
			respuesta=Integer.parseInt(br.readLine());
		}while(respuesta==1);*/
	}

	public void imprimeArreglo(int r[])
	{
		System.out.println(Arrays.toString(r));
	}
	public void imprimePosicion(int p)
	{
		System.out.println(posicion);
	}
}