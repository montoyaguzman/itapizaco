class Metodos
{
   //ATRIBUTOS
	double arreglo[] = new double [0];
   double arregloCua[] = new double [0];
   double suma[] = new double [0];
   double mult[] = new double [0];
   
   //ENTRADA
 
   public void leeArreglo(double a[])
   {
      arreglo = a;
   }
   
   //PROCESO
   
   public void elevaAlCuadrado()
   {
      for (int i = 0; i < arreglo.length; i++)
		{
			arregloCua[i] = Math.pow(arreglo[i],2);
		}
   }
   
   public void SumaArreglo()
   {
      for(int i = 0; i < arreglo.length; i++)
		{	
			suma[i] = arreglo[i] + arregloCua[i];
		}
   }
   
   public void MultArreglo()
   {
      for(int i = 0; i < arreglo.length; i++)
		{	
			mult[i] = arreglo[i] * arregloCua[i];
		}
   }
   
   //SALIDA
   
   public double [] muestraCua()
	{
		return arregloCua;
	}
   
   public double [] muestraSuma()
	{
		return suma;
	}
   
   public double [] muestraMult()
	{
		return mult;
	}
}