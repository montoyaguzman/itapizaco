public class Nodo
{
   private int dato;
   Nodo siguiente; 
   Nodo anterior;
   
   void recibeDato (int d)
   {
      dato = d;
   }
   
   void recibeSiguiente(Nodo s)
   {
      siguiente = s;
   }
   
   void recibeAnterior(Nodo a)
   {
      anterior = a;
   }

   public int retornaDato ()
   {
      return dato;
   }
   
   public Nodo retornaSiguiente ()
   {
      return siguiente;
   }
   
   public Nodo retornaAnterior ()
   {
      return anterior;
   }     
}