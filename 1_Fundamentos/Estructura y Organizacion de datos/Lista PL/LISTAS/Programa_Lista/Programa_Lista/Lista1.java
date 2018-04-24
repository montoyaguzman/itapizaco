import java.util.Scanner;
import java.io.*;
class Lista1
{
   int lista[]= new int [10];
   int i,n,tope,pos;

// insertar y ordenar
   public void insertar()throws IOException
   {
      BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Tamaño de los datos???");
      n = Integer.parseInt(z.readLine());
   
      for(i=0; i<n; i++)
      {
         System.out.printf("Valor de casilla %d:",i);
         lista[i]= Integer.parseInt(z.readLine());
      }
   }
   	
      // comparacion

   public void ordenar()throws IOException
   {        
                            
      BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
      for(i=0;i<n-1;i++)
      { 
         int min=i;
      
         for(int j=i+1;j<n;j++)
         {
            if(lista[j]<lista[min])
            {
               min=j;
            }
         }
         if(i!=min)
         {
            int aux =lista[i];
            lista[i]=lista[min];
            lista[min] = aux;
         }
      }
   
      System.out.println("Datos ordenados :");
      for(int i=0; i<n;i++){
         System.out.println("casilla ["+i+"]"+" = "+lista[i]);
      }
   }
//eliminacion de los datos

   public void eliminar()throws IOException
   {                                       
      BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
      tope = n-1;
      
      System.out.println("¿Deseas eliminar un valor? 1=SI/2 =NO");
      int resp = Integer.parseInt(z.readLine());
      System.out.println("¿Valor a eliminar?");
      int numeli=Integer.parseInt(z.readLine()); 
   
   
      while (resp==1)
      {  
         for (int i=0; i<n; i++)
            if(numeli==lista[i])
            {
               pos=i;
               break;
            }
      
         for (i=pos; i<n-1; i++)
         {
            lista[i]=lista[i+1];
         }
        
         lista[n]=-1;
         n--;
      
         for (int i = 0; i < n; i++)
         {
            System.out.print("Casilla  "+lista[i]+"\n");
         }
      
         n=n-1;
      		
         System.out.println("¿Desea eliminar otro valor? 1=SI/2=NO");
         resp = Integer.parseInt(z.readLine());
      	   	
      }
   
   }


// visualizar los datos
  
   public void visualizar()throws IOException
   {
      for(i=0; i<tope; i++)
      {
         System.out.printf("Casilla  [%d] valor asig: %d \n",i,lista[i]);
      }
   }

}