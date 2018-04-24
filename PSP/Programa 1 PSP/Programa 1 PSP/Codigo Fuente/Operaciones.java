import java.io.*;

public class Operaciones{

   Nodo inicio = null;
   Nodo fin = null;
   String nombreDelArchivo ="";
   double dato = 0;
   double cont = 0;
   double suma = 0;
   double promedio = 0;
   double varianza = 0;
   double sumaDeVarianza = 0;
   double desviacion = 0;
   
      
   public void leeArchivoDeTexto(String nombreArchivo) throws IOException{
         
			FileReader r = new FileReader(nombreArchivo);
			BufferedReader br = new BufferedReader(r);	
			
			String linea = "";      
			
         while (linea != null)
         {
            
				linea = br.readLine();
            if (linea == null)
            {
               break;
				}
            
            dato = Double.parseDouble(linea.trim());
            insertaOrden(dato);
         }       
   }
   
   public void calculaPromedio(){
   
      Nodo aux = inicio;
   	while (aux != null)
   	{
   		double d = aux.retornaDato();
   		dato = d;
   		aux = aux.retornaSiguiente();
         cont++;
         suma = suma + dato;
   	}         
      //System.out.println(suma);
      //System.out.println(cont); 
      promedio = suma/cont;
   }
   
   public void calculaDesviacionEstandar() throws IOException{ 
    
      calculaPromedio();
      Nodo aux = inicio;
   	while (aux != null)
   	{
   		double d = aux.retornaDato();
   		dato = d;
   		aux = aux.retornaSiguiente();
         //System.out.println(dato);
         varianza = Math.pow(dato-promedio,2);
         //System.out.println(varianza);
         sumaDeVarianza = sumaDeVarianza + varianza;
   	}//System.out.println(sumaDeVarianza);         
      double n = cont - 1;
      desviacion = Math.sqrt(sumaDeVarianza/n);
   }
      
   public void insertaOrden (double dato){
   
   	Nodo nuevo = new Nodo();
   	nuevo.recibeDato(dato);
   	nuevo.recibeAnterior(null);
   	nuevo.recibeSiguiente(null);
	
	   if (inicio == null)
	   {
		   inicio = nuevo;
		   fin = nuevo;
	   }
   	
   	else if (dato < inicio.retornaDato())
   	{
   		nuevo.recibeSiguiente(inicio);
   		inicio.recibeAnterior(nuevo);
         inicio = nuevo;
   	}
   	else if (dato > fin.retornaDato())
   	{
   		nuevo.recibeAnterior(fin);
   		fin.recibeSiguiente(nuevo);
         fin = nuevo;
   	}
   	else
   	{	
   		Nodo n1 = inicio;
   	   Nodo n2 = inicio.retornaSiguiente();
   
   	   while (nuevo.retornaDato() > n2.retornaDato())
         {
            n1 = n1.retornaSiguiente();
   		   n2 = n2.retornaSiguiente();
   	   }
         	nuevo.recibeSiguiente(n2);
         	nuevo.recibeAnterior(n1);
         	n1.recibeSiguiente(nuevo);
         	n2.recibeAnterior(nuevo);
   	}
   } 
   
   void imprimeLista(){
   
   	Nodo aux = inicio;
   	while (aux != null)
   	{
   		double d = aux.retornaDato();
   		System.out.println(d);
   		aux = aux.retornaSiguiente();
   	}
   }
   
   public void muestraResultados(){
   
      System.out.println("Promedio "+Math.rint(promedio*100)/100);
      System.out.println("Desviación estándar: "+Math.rint(desviacion*100)/100);
   }
    
}