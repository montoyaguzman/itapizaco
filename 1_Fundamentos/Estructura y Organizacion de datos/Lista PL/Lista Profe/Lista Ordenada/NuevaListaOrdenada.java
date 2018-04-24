public class NuevaListaOrdenada
{
   Nodo inicio = null;
   Nodo fin = null;
   
   //Nodo c = new Nodo();  
   public void insertaOrden (int dato)
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
   
   void borraDato(int dato)
   {
	   if(dato == inicio.retornaDato())
	   {
		   Nodo aux;
		   aux = inicio;
		   inicio = aux.retornaSiguiente();
		   inicio.recibeAnterior(null);
		   aux.recibeSiguiente(null);
	   }
	   else if (dato == fin.retornaDato())
	   {
   	   Nodo aux;
		   aux = fin;
		   fin = aux.retornaAnterior();
		   fin.recibeSiguiente(null);
		   aux.recibeAnterior(null);
      }
   	else
   	{
   		Nodo aux = inicio;
         Nodo n1 = new Nodo();
         Nodo n2  = new Nodo();
                   
         while (aux != null)
         {	
            if (dato == aux.retornaDato())
            {
               n1 = aux.retornaAnterior();
               n2 = aux.retornaSiguiente();
               n1.recibeSiguiente(n2);
               n2.recibeAnterior(n1);
               break;
            }
            //if (dato != aux.retornaDato()){System.out.println("Elemento no encontrado");break;}
            else
            {  
               if(aux.retornaSiguiente()==null)
               {
                  System.out.println("Elemento no encontrado");
                  break;
               }
               aux = aux.retornaSiguiente();
               
               //System.out.println("Elemento no encontrado");
            }
            
   		}
   	}
      
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
     