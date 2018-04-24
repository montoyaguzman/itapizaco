   import java.util.*;
    class MenuLista {
       public void muestraMenu() {
         byte desicion;
         Scanner teclado = new Scanner(System.in);
         System.out.print("Introduce el tamano: ");
         int tam = teclado.nextInt();
         byte tipoOrden = 1;
         do {
            System.out.print("1)Ascendente \n2)Descendente\nEn que orden quieres guardar los datos: ");
    			tipoOrden = teclado.nextByte();        
				if(tipoOrden>2 || tipoOrden<1){
               System.out.print("Ese No\n\n");
            } 
         }while(tipoOrden>2 || tipoOrden<1);
         Lista funLista = new Lista(tam, tipoOrden);
         do {
            System.out.print("\n1)insertar\n2)Borrar\n3)imprime\n4)Verifica si esta vacia\n5)Verifica si esta llena\n6)Borrar por el Inicio\n7)Borrar Por el final\n8)Salir\nQue quieres hacer: ");
            desicion = teclado.nextByte();
            switch(desicion) {
            
            //agragar elemento
               case(1): 
                  {
                     System.out.print("Introduce el dato: ");
                     int dato = teclado.nextInt();
                     funLista.resibeDato(dato);     
                     funLista.push();
                     funLista.veSiListaVacia();
                     funLista.imprimeLista();
                  }
                  break;
            
            //Borra
               case(2): 
                  {
                     System.out.print("Introduce el dato a borrar: ");
                     int aBorrar = teclado.nextByte();
                     funLista.resibeDatoABorrar(aBorrar);
                     funLista.pop();
                     funLista.imprimeLista();
                  
                  }
                  break;
            		
            		 //Borra El Primero
               case(6): 
                  {
                     funLista.popPrimero();
                     funLista.imprimeLista();
                  
                  }
                  break;
            		
            	//borra por el final	
               case(7): 
                  {
                     funLista.popUltimo();
                     funLista.imprimeLista();
                  
                  }
                  break;
            
            //imprime
               case(3): 
                  {
                     funLista.imprimeLista();
                  }
                  break;
            		
            //Muestra si esta vacia          
               case(4): 
                  {
                     funLista.veSiListaVacia();
                     funLista.muestraSiEstaVacia();
                  }
                  break;
            		
            //Muestra si esta llena    		
               case(5): 
                  {
                     funLista.veSiListaLlena();
                     funLista.muestraSiEstaLlena();
                  }
                  break;
            }
         	
         	
            if(desicion<=0 || desicion>8){
               System.out.println("Ese no");
            }
            
         }while(desicion!=8);
         System.out.println("\n\tAdios");
         
      }
   }
