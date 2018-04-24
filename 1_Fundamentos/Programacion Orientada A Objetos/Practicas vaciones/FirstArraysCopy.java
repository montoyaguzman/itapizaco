import java.util.Arrays;
public class FirstArraysCopy
{
	public static void main (String args[])
	{
		int ArrayOrigen[] = {30,45,67,12,34,56,78,79,10};
		int ArrayDestino[] = new int [10];
		int ArrayRespuesta[] = new int [9];
		int minimo;
		
		System.out.println("Los elementos del Array Origen son: "+Arrays.toString(ArrayOrigen));
			
		System.arraycopy(ArrayOrigen,0,ArrayDestino,0,9);
		System.out.println("Los elementos del Array Detino son: "+Arrays.toString(ArrayDestino));	
		
		for (int i=0; i<ArrayOrigen.length; i++)
		{
			for (int j=0; j<ArrayDestino.length-1; j++)
			{
			if (ArrayDestino[j]>ArrayDestino[j+1])
			{
				minimo = ArrayDestino[j];
				ArrayDestino[j] = ArrayDestino[j+1];  		
  				ArrayDestino[j+1] = minimo;   
  				
			}
			}
			//intercambiar(lista[i],lista[minimo]);
			System.out.println("Los elementos del Array ordenados son: "+Arrays.toString(ArrayDestino));	

		}
	}
}
