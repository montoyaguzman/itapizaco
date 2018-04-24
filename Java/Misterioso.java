import java.io.*;
public class Misterioso
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		
		int a = 2437;
      int b =875;
      
      int x=0;	
      int y=0;
      
      x=a;
      y=b;
      
      int suma = 0;
      int contador=0;
      
      while(x!=y){
         if(x>y){
            suma = x - y;
            contador++;
         }
         else if(x<y){
            suma = y - x;
            contador++;
         }
         if(contador==5){
            break;
         }
         System.out.println(suma);
      }
      
               System.out.println(suma);
      
   }
}