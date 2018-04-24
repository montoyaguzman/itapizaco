import java.io.*;
class Primos 
{
   public static void main(String[] a) throws IOException 
   {
   
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("Dame n: ");
      int n = Integer.parseInt(br.readLine());
         
      int cont = 0;
	   int comp = 0;
	   boolean bandera = false;
         
     for(int i = 3; i <= n; i++) 
     {
			System.out.print(i+": ");
            
          for(int j = 1; j <= i; j++) 
          {
             comp++;
			    
             if(i % j == 0) 
             {
                  cont++;
             }
             if(cont > 2)
             {
						System.out.print("No es numero Primo");
                  break;
             }
             else if(cont >= 2 && i == j)
             {
               System.out.print("Es numero Primo");
				   bandera = false;
             }
         }
				System.out.print(", se hicieron " + comp + " evaluaciones \n\n");
            cont =0;
				comp = 0;
      }
   }
}