public class NuevaLista
{

   Nodo inicio = null;
   Nodo fin = null;
   
	void insertaInicio(int dato)
	{
		Nodo nuevo = new Nodo();
		nuevo.recibeDato(dato);
		nuevo.recibeAnterior(null);
		nuevo.recibeSiguiente(null);

		if (inicio == null)
		{
			inicio = nuevo;
			fin = nuevo;
		}
		else
		{
			nuevo.recibeSiguiente(inicio);
			inicio.recibeAnterior(nuevo);
			inicio = nuevo;
		}
		
	}
	void insertaFinal(int dato)
	{
		Nodo nuevo = new Nodo();
		nuevo.recibeDato(dato);
		nuevo.recibeAnterior(null);
		nuevo.recibeSiguiente(null);

		if (inicio == null)
		{
			inicio = nuevo;
			fin = nuevo;
		}
		else
		{
			nuevo.recibeAnterior(fin);
			fin.recibeSiguiente(nuevo);
			fin = nuevo;
		}
	}

	void borraInicio()
	{
		Nodo aux;
		aux = inicio;
		inicio = aux.retornaSiguiente();
		inicio.recibeAnterior(null);
		aux.recibeSiguiente(null);
	}
   
   void borraFin()
	{
		Nodo aux;
		aux = fin;
		fin = aux.retornaAnterior();
		fin.recibeSiguiente(null);
		aux.recibeAnterior(null);
	}
   
   void imprimeListaAscendente()
   {
   	Nodo aux = inicio;

   	while (aux != null)
   	{
   		int d = aux.retornaDato();
   		System.out.println(d);
   		aux = aux.retornaSiguiente();
   	}
   }


   void imprimeListaDescendente()
   {
   	
   	Nodo aux = fin;
   
   	while (aux != null)
   	{
   		int d = aux.retornaDato();
   		System.out.println(d);
   		aux = aux.retornaAnterior();
   	}
   }
   	
}