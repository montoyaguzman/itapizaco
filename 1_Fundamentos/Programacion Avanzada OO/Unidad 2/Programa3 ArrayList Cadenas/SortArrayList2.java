import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SortArrayList2{
   
   private static ArrayList<Persona> personas = new ArrayList<>();
   
   public static void main (String args[]){
   
   //Guardar datos en el AL de Objetos de la clase personas
   personas.add(new Persona("Pepe",28));
   personas.add(new Persona("Juan",32));
   personas.add(new Persona("Paco",40));
   personas.add(new Persona("Lola",20));
   personas.add(new Persona("Jose",28));
   personas.add(new Persona("Dani",24));
   personas.add(new Persona("Andi",36));
   personas.add(new Persona("Susi",24));
   
   //Imprime el ArrayList desordenado por edad de la clase persona
   printArrayListPersona("ArrayList desordenada\n");
   
   //Ordena el ArrayList de menor a mayor por edad y lo imprime
   Collections.sort(personas, 
      new Comparator<Persona>(){
         @Override
         public int compare(Persona p1, Persona p2){
            return new Integer(p1.getEdad()).compareTo(new Integer(p2.getEdad()));
         }
      });
   printArrayListPersona("Array List ordenado por edad de menor a mayor:\n");         
   
   //Ordena el ArrayList de mayor a menor por edad y lo imprime
   Collections.sort(personas,
      new Comparator<Persona>(){
         @Override
         public int compare(Persona p1, Persona p2){
         //Aqui esta el truco, ahora compara p2 con p1 y no al reves como antes
         return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));
         
         }
      });
    printArrayListPersona("Array List ordenado por edad de mayor a menor:\n");          
  }
  
  private static void printArrayListPersona(String ca){
   Iterator<Persona> itrArrayList = personas.iterator();
   String cad=ca;
   int posicion=1;
   while (itrArrayList.hasNext()){
      cad+="\nPosicion("+posicion+") = "+itrArrayList.next().toString();
      posicion++;
   }
   ES.escribe(cad);   
   }
}   
   


