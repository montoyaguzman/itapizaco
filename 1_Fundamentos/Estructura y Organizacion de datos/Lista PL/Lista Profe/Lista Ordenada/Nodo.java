public class Nodo
{
   int dato;
   Nodo siguiente; 
   Nodo anterior;
   
   public void recibeDato (int d){dato = d;}
   public void recibeSiguiente(Nodo s){siguiente = s;}
   public void recibeAnterior(Nodo a){anterior = a;}
   public int retornaDato (){return dato;}
   public Nodo retornaSiguiente (){return siguiente;}
   public Nodo retornaAnterior (){return anterior;}     
}