   import java.util.Arrays;
   import java.io.*;
   class Lista {
      private int tam;
      private int tope, pos, aBorrar, tipoOrden;
      private int lista[];
      private int listaClon[];
      private boolean listaVacia;
      private boolean listaLlena;
      private int dato, orden;
   //    private String colaSt;
   
   //______________________________________CONSTRUCTORES____________________________________
   
      public Lista(int tam, byte tipoOrden) {
         this.tam = tam;					//NOS AHORRAMOS UN METODO 
         this.tipoOrden = tipoOrden;	//NOS AHORRAMOS UN METODO
         tope = 0;
         listaLlena=false;
         listaVacia=true;
         lista = new int[tam];			//NOS AHORRAMOS UN METODO
         listaClon = new int[tam];   //PARA EL RECORREDO HACIA DELANTE
      
      }
   //______________________________________CONSTRUCTORES___________________________________*/
   	
   //______________________________________ENTRADA____________________________________
           
      public void resibeDato(int dato) {
         this.dato = dato;
      } 
   	
      public void resibeDatoABorrar(int aBorrarIn) {
         aBorrar = aBorrarIn;
      }
   	
      
   //______________________________________ENTRADA___________________________________*/
   
   //______________________________________PROCESO____________________________________
      public void veSiListaLlena() {
         if (tope == tam ) {
            listaLlena = true;
         } 
         else {
            listaLlena = false;
         }
      }
   
      public void veSiListaVacia() {
         if (tope == 0) {
            listaVacia = true;
         } 
         else {
            listaVacia = false;
         }
      }
   
      public void push() {
      	veSiListaLlena();			//NO HAY NESESIDAD DEL THIS.METODO();
         if(listaLlena==false){
            if(tipoOrden==1) {
            //ENPIEZA ORDEN ACENDENTE
               if(tope==0){
                  lista[tope]=dato;		
               }
               //SI EL INTRO ES MAYOR LO GUARDA EN ULTIMO POSICION 
               else if (dato>=lista[tope-1]){
                  lista[tope]=dato;
               }
               //CUANDO EL VALOR ES MENOR :o-------------
               else if(dato<lista[tope-1]) {
                  if(dato<=lista[0]){           //POR SI EL VALOR ES INTO ES MENOR AL PRIMERO
                     pos=0;
                  } 
                  else {
                     for(int i=0; i<tope; i++) {
                        if(dato>=lista[i]) {    //PODRIA SER BINARIA
                           pos=i+1;
                        }
                     }
                  }
                  this.recorreArregloHaciaDelante();
               }
            }
            else {
            //ENPIEZA ORDE ANCENDENTE
               pos=0;
            //PARA EL PRIMER DATO A INTRODUCIR
               if(tope==0){
                  lista[tope]=dato;		
               }
               //PARA GUARDAR UN EL VALOR MINIMO EN LA ULTIMO POSICION
               else if (dato<lista[tope-1]){
                  lista[tope]=dato;
               }
               //CUANDO EL DATO ES MAYOR :o-------------
               else if(dato>=lista[tope-1]) {
               
               //SE BUSCA EL VALOR MAYOR Y RETORNA LA POSICION
                  for(int i=lista.length-1; i<=0; i--){
                     if(i==lista[i]){
                        pos=i+1;
                     }
                  }
                  int numMenor = lista[pos];	//SE GUARDA EL NUMERO MENOR DEL ARREGLO 
                  if(numMenor>dato){					// 
                     for(int i=0; i<tope; i++) {
                        if(lista[pos]>dato) {
                           pos++;
                        }      
                     }
                  //EVITAR ERRORES DE POSICIOJNES MENORES A CERO
                     if(pos<0) {       			
                        pos=0;     			
                     }
                  }
                  
               	this.recorreArregloHaciaDelante();
               }
               
            }
            tope++;
         	System.out.print("\n\tDato introducido");
         }
         else {
            System.out.print("\n\tLista llena no se puede introducir mas");
         }
      }
      
      private void recorreArregloHaciaDelante() {
      
         for(int i=pos; i<lista.length-1; i++) {
            listaClon[i+1]=lista[i];   
         }
         for(int j=pos; j<lista.length; j++) {
            lista[j]=listaClon[j];
         }
         lista[pos]=dato;
      	pos=0;
      }
   	
   	
        
      public void pop() {
      this.veSiListaVacia();
         if(listaVacia==false){
            pos = -1;
            for(int i=0; i<tope; i++) {
               if(aBorrar==lista[i]) {
                  pos = i;
               } 
               else if (i==tope-1 && pos==-1) {
                  System.out.print("\n\tDato no encontrado");
               }
            }
            if(pos>-1) {
               for(int i=pos; i<lista.length-1; i++) {
                  lista[i] = lista[i+1];
               }
               lista[lista.length-1]=0;
               System.out.print("\n\tdato borrado");
               tope--;
            } 
         }
      }
   
   //************************
      public void popPrimero() {
      this.veSiListaVacia();
         if(listaVacia==false){
            for(int i=0; i<lista.length-1; i++) {
               lista[i] = lista[i+1];
            }
            lista[lista.length-1]=0;
            System.out.print("\n\tPrimer dato borrado");
            tope--;
            
         }
      }
   	
      public void popUltimo() {
      this.veSiListaVacia();
         if(listaVacia==false){
            lista[lista.length-1]=0;
            System.out.print("\n\tUltimo dato borrado");
            tope--;
         }
      } 
   	
   	
   //*************************
   
      public void imprimeLista() {
      this.veSiListaVacia();
         String listaSt="\n\tLista: {";      
         if(listaVacia==false) { 
              
            for(int i=0; i<tope; i++) {
               listaSt = listaSt+lista[i];
               if(i!=tope-1) {
                  listaSt = listaSt+", ";
               }
            	
            }
            listaSt = listaSt+"}\n";
            System.out.print(listaSt);
         
            //System.out.print(Arrays.toString(lista));
         } 
         else {
            System.out.print("\n\tLa lista esta Vacia a2\n");
            listaSt = "";
         }
      }
   	
      public void muestraSiEstaVacia() {
         if(listaVacia==false) {
            System.out.print("\n\tLa lista no esta vacia\n");
         }
         else {
            System.out.print("\n\tLa lista esta vacia a3\n");
         }
      }
      
      public void muestraSiEstaLlena() {
         if(listaLlena==false) {
            System.out.print("\n\tLa lista no esta llena\n");
         }
         else {
            System.out.print("\n\tLa lista esta llena\n");
         }
      }
   	
   	
   	
   
   //__________________________________PROCESO__________________________________*/
   
   /*__________________________________SALIDA____________________________________
   
      public String returnaPilaSt() {
         return pilaSt;
      }
   
   //__________________________________SALIDA__________________________________*/
   
   }