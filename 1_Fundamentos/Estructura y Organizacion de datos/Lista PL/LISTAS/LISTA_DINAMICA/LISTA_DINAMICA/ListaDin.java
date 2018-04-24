   import java.util.Scanner;
    class ListaDin
   {
   
      int x,  d, valor;
   
       class Nodo
      {
         int dato;  //Dato
         Nodo sig; // apuntador
      }
      
      private Nodo raiz, p, q,r, s;
   
      public void raiz()
      {
         raiz = p = q = r = null;
      }
      
      Nodo nuevo;
      
      public void p()
      {
         p = raiz;
      }
    //Inserccion de un nodo
       public void  inserta()
      {
         int m;
         Scanner leer = new Scanner (System.in);
         do
         {
            if (raiz == null)
            {
               nuevo = new Nodo();
               System.out.print("Introduzca el valor para el nuevo dato ");
               x = leer.nextInt();
               nuevo.dato= x;
               nuevo.sig= null;
               raiz = nuevo;
               p=raiz;
            }
            else //nuevonodo
            {
               nuevo = new Nodo();
               System.out.print("Introduzca los demas datos ");
               x= leer.nextInt();
               nuevo.dato=x;
               nuevo.sig=null;
               p.sig=nuevo;
               p=nuevo;			
            }
            System.out.println("Desea introducir otro valor 1.-Si, 2.No");
            m=leer.nextInt();
         } while (m==1);
      }
   
   //Visualiza el GRAFO
       public void visualizar()
      {
         q=raiz;
         while (q!=null)
         {
            System.out.println("Los nodos son: " + q.dato);
            q=q.sig;
         }
      }
   
   //Ordenar un Nodo
       public void ordenar()
      {
         int aux, o;
         Scanner leer = new Scanner (System.in);
         q=raiz;
         while (q.sig !=null)
         {
            r=raiz;
            s=r.sig;
            while(s!=null)
            {
               if (r.dato > s.dato)
               {
                  aux=r.dato;
                  r.dato=s.dato;
                  s.dato=aux;
               }
               r=r.sig;
               s=s.sig;
            }
            q=q.sig;
         }
      }
      
   	//Reinsertar un nodo
       public void reinsertar()
      {
         int numins;
         Scanner l=new Scanner(System.in);
         System.out.print("inserte un numero: ");
         numins=l.nextInt();
         if(numins < raiz.dato) // inserta al inicio
         {
            nuevo = new Nodo();
            nuevo.dato = numins;
            nuevo.sig = raiz;
            raiz = nuevo;
         }
         else 
            if (numins > p.dato) // inserta al final
            {
               nuevo = new Nodo();
               nuevo.dato = numins;
               p.sig= nuevo;
               nuevo.sig=null;
               p=nuevo;
            }
            else 
               if(numins > raiz.dato && numins < p.dato) // inserta en medio
               {
                  r=s=raiz;
                  while (numins > r.dato)
                     r=r.sig;
                  while (s.sig!=r)
                     s=s.sig;
                  nuevo = new Nodo();
                  nuevo.dato = numins;
                  s.sig = nuevo;
                  nuevo.sig =r;
               }
      }	
   
   //Eliminar 
       public void eliminar()
      {
         int numelim;
         Scanner l= new Scanner (System.in);
         System.out.println("Que numero desea eliminar: ");
         numelim=l.nextInt();
         if(numelim == p.dato)// elimia el ultimo dato
         {
            r=s=raiz;
				
            while (s.sig!=p)
               s=s.sig;
            p=s;
            nuevo=p;
            p.sig=null;   
         }
         else 
            r= raiz;
         if(r!=null)
         {			
		      if(numelim==r.dato)//Borrado al principio
            {
               r= s= raiz;
               raiz= raiz.sig;
               System.out.print( "Eliminando numero "+r.dato);
               System.out.println( "Numero eliminado!");
               r.sig= null;
               r= raiz;
            }	
         }
      }
   }