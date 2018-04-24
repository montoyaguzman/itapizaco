public class BusquedaBinaria 
{
    public static void  main (String args[]) 
	 {
		// Llenar arreglo
 		int [] edades = new int [35];
 		for (int i = 0; i < edades.length ; i++)
  	   edades[i] = i*i ;

 		// Mostrar arreglo.
 		for (int i = 0; i < edades.length ; i++)
		System.out.println ( "edades["+i+"]: "+  edades[i]);

 		int resultado = BusquedaAlgoritmo.buscar(edades, 9);

 		if (resultado != -1) 
		{
  		   System.out.println ( "Encontrado en: "+  resultado);
 		} 
		else 
		{
  		   System.out.println ( "El dato no se encuentra en el arreglo, o el arreglo no está ordenado."  );
 		}
 
    }
}