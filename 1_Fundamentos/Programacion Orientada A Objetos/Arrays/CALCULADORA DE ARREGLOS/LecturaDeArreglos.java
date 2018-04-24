import java.util.Arrays;
class LecturaDeArreglos
{
	int arreglo1[] = new int [0];
	int arreglo2[] = new int [0]; 
	int resultado[] = new int [0];
	int NumeroABuscar;
	int posicion;
	//int lim = resultado.length;   <<<<--PROYECTO MONTOYITA
	 int lim;

	//__________________________________________METODOS DE LECTURA____________________________________________
	
	public void leeArreglo1(int []a1)
	{
		arreglo1 = a1;
	}
	public void leeArreglo2(int []a2)
	{
		arreglo2 = a2;
	}
	public void leeNumABuscar(int numBus)
	{
		NumeroABuscar = numBus;
	}
		
	//_______________________________________METODOS DE PROCESO___________________________________________________________
	
	public void realizaSuma ()
	{	
		resultado = new int [arreglo1.length];
		for(int i = 0; i<arreglo1.length; i++)
		{	
			resultado[i] = arreglo1[i] + arreglo2[i];
		}
	}
	
	public void realizaResta ()
	{
		resultado = new int [arreglo1.length];
		for(int i = 0; i<arreglo1.length; i++)
		{	
			resultado[i] = arreglo1[i] - arreglo2[i];
		}
	}
	public void realizaMultiplicacion()
	{
		resultado = new int [arreglo1.length];
		for(int i = 0; i<arreglo1.length; i++)
		{	
			resultado[i] = arreglo1[i] * arreglo2[i];
		}
	}
	
	public void realizaOB()
	{
  		int temp;  
   	//System.out.print("\nOrdenamiento Burbuja \nOriginal = " + Arrays.toString(arreglo1));
   	for(int i=1; i<arreglo1.length; i++)
   	{  
   	for (int j=0 ; j < arreglo1.length-1; j++)
		{  
   		if (arreglo1[j] > arreglo1[j+1])
			{		//<-------Compara con el primero que esta adelante  
         	temp = arreglo1[j];  				//<-------Al mayor lo guarda en tem
            arreglo1[j] = arreglo1[j+1];  		//<-------Recorer una posicion al arreglo
            arreglo1[j+1] = temp;   			//<-------Como una pociocion antes era mayor lo recorrio hacia delante ya que se ordena de menor a mayor
			}  
     	}
      }
         //return arreglo1;
   }	
		
	public void BusquedaSecuencial() 
	{
		lim=arreglo1.length;
		//System.out.println("numero limite"+lim);
		posicion=-1;
		for(int i=0; i<lim; i++)
		{ 
		//System.out.println("i"+i); 
			if (NumeroABuscar == arreglo1[i])
			{
				posicion=i;
            //System.out.print("\nencontrado en la posicion: " + posicion );
				break;
			}
				
      }
	}
						
	//_______________________________________METODOS DE SALIDA_____________________________________________________________
	
	public int [] muestraArreglo1()
	{
		return arreglo1;
	}
	public int [] muestraArreglo2()
	{
		return arreglo2;
	}
	public int muestraPosicion()
	{
		return posicion;
	}
	public int [] muestraResultado()
	{
		return resultado;
	}
}