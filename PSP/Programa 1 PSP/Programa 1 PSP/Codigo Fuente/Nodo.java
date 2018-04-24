public class Nodo{

   double dato;
   Nodo siguiente; 
   Nodo anterior;
   
   public void recibeDato (double d){
      dato = d;
   }
   
   public void recibeSiguiente(Nodo s){
      siguiente = s;
   }
   
   public void recibeAnterior(Nodo a){
      anterior = a;
   }
  
   public double retornaDato (){
      return dato;
   }
   
   public Nodo retornaSiguiente (){
      return siguiente;
   }
   
   public Nodo retornaAnterior (){
      return anterior;
   }     
}