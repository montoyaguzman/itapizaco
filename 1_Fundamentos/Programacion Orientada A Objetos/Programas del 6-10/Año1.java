/*Problema 10.- Introducir un año desde teclado y un mes, indicar que mes es y cuantos dias tiene. Tomar
en cuenta Febrero si es año bisiesto*/

import java.util.Scanner;
   
public class Año1 
{
	public static void main (String []args)
	{
         Scanner teclado = new Scanner(System.in);		
			
         System.out.print("Dame año: ");
         int año = teclado.nextInt();
         int NumMes;
         do 
         {
         	System.out.print("Dame mes; ");		 
         	NumMes = teclado.nextInt();
         }
         
				while (NumMes > 12 || NumMes <= 0 );		
         	NumMes--; //NumMes = NumMes - 1;(es lo mismo)  o NumMes--;(igual funciona)

         	System.out.print("El año " + año);
         	int pos = 0;
				int loes = (int)(año%4);
         	int excep100 = (int)(año%100);
				int excep400 = (int)(año%400);
   
	      	if ((loes==0) && (excep100!=0 || excep400==0))
				{
         	   System.out.print(" es bisiesto,");
         	} 
      
         		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
           			    			   "Julio", "Agosto", "Septiembre", "Octubre", "Novimbre", "Diciembre"};													
         		System.out.print(" en el mes " + (++NumMes) + " el cual es "); 
         		NumMes--;
         		System.out.print(meses[NumMes]);
			
       			NumMes++;
         		int []Dias = {28, 30, 31, 29};
         	
					if ((NumMes==4) || (NumMes==6) || (NumMes==9) || (NumMes==11))
					{ 
        		    	pos = 1; 
         		}
         
         			else if ((NumMes==1) || (NumMes==3) || (NumMes==5) || (NumMes==7) || (NumMes==8) || (NumMes==10) || (NumMes==12))
						{
            			pos = 2;
         			}
      
         				System.out.print(" tiene " + Dias[pos] + " Dias" );
      
	}
}