   import java.util.*;
   class PilaV2 {
   
      static byte desicion;
      static Scanner teclado = new Scanner(System.in);
      static byte tope = 0;
      static byte limite;  
         	
         	
      public byte menu() {
         System.out.print("\n1)insertar\n2)Borrar\n3)imprime\n4)estaLleno?\n5)estaVacio?\n6)Salir\nQue quieres hacer: ");
         desicion = teclado.nextByte();
         return desicion;
      }
   
      public boolean estaLleno() {
         if(tope==limite) {
            return true;
         }
         else {
            return false;
         }
      }
      
      public boolean estaVacio() {
         if(tope==0) {
            return true;
         }
         else {
            return false;
         }
      }
   
   
      public static void main(String[] args) {
         PilaV2 funciones = new PilaV2();
         System.out.print("Introduce el tamaño:");
         limite = teclado.nextByte();
         int arreglo[] = new int[limite];
      
         do {
            desicion = funciones.menu();
            switch(desicion) {
            
            
               case 1: 
                  {
                     
                     if(funciones.estaLleno()) {	
                        System.out.print("el arreglo esta llego: ");
                     } 
                     else {
                        System.out.print("Inserta valor de la poscion "+tope+": ");
                        arreglo[tope] = teclado.nextInt();
                        tope++;
                     }
                     System.out.println(Arrays.toString(arreglo)); 
                     
                  }
                  break;
            
            
               case 2: 
                  {
                     if(funciones.estaVacio()) {	
                        System.out.println("no hay nada que borrar ");
                     }
                     else{
                        tope--;
                        arreglo[tope]=0;
                        System.out.println("se a borrado: "+Arrays.toString(arreglo));
                     }
                  }
                  break;
            
            
               case 3: 
                  {
                  
                     if(desicion==3){
                        System.out.println("Arreglo: "+Arrays.toString(arreglo));
                     }
                  
                  }
                  break;
                  
            
               case 4: 
                  {
                  
                     if(funciones.estaLleno()){
                        System.out.println("si, si esta lleno");
                     }
                     else {
                        System.out.println("no, no esta lleno");
                     }
                  
                  }
                  break;
            
            
               case 5: 
                  {
                  
                     if(funciones.estaVacio()){
                        System.out.println("si, si esta Vacio");
                     }
                     else {
                        System.out.println("no, no esta Vacio");
                     }
                  
                  }
                  break;
            		
            }
            
            if(desicion<=0 || desicion>6){
               System.out.println("ese no");
            }
            
         }while(desicion!=6);
         System.out.println("adios");
         
      }
   }