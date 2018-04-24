   import java.util.Scanner;
	import java.io.*;
   public class MLista
   {
       public void listam()throws IOException
      {
         Lista1 cl= new Lista1();
         int x, y;
      
         Scanner opc= new Scanner (System.in);
      
         do{
            System.out.println("Que desea realizar:");
            System.out.println("1_Insertar valor");
            System.out.println("2_Ordenar valores");
            System.out.println("3_Eliminar valores");
            System.out.println("4_Visualizar valores\n");
            x= opc.nextInt();
         
            switch (x)
            {
               case 1: cl.insertar();
                  break; 
               case 2: cl.ordenar();
                  break;
               case 3: cl.eliminar();
                  break;
               case 4: cl.visualizar();
                  break; 
            
               default: System.out.println ("Numero no valido!!!");
            }
            System.out.println("Desea retornar a opciones: si=4");
            System.out.println("Desea salir si=5");
            y=opc.nextInt(); 
         }
         
         while (y==4);
      	
      }
   }