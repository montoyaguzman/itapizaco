import java.io.*;
public class Numeros
{
   public static void main (String a[]) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader (System.in)); 
      
      int num, contPo = 0, contNe = 0, suma = 0;
      double totalNum;
      double promedio;
		
      do
		{
   		System.out.println("Deme números");
   		num = Integer.parseInt(br.readLine());
         
         if(num > 0)
         {
   		   contPo++;
         }
         else if (num < 0)
         {
            contNe++;
         }
         
         suma = suma + num;
         totalNum = contPo + contNe;
         promedio = suma / totalNum;
         
   		}while(num != 0);
         
   		System.out.println("Programa finalizado\n");
         System.out.println("La suma de la serie es: "+suma);
   		System.out.println("Números positivos: "+contPo);
         System.out.println("Números negativos: "+contNe);
         System.out.println("El promedio es: "+promedio);
   }
}