/*Problema 10.- Introducir un a�o desde teclado y un mes, indicar que mes es y cuantos dias tiene. Tomar
en cuenta Febrero si es a�o bisiesto*/

import java.util.Scanner;
   
public class A�o1 
{
	public static void main (String []args)
	{
         Scanner teclado = new Scanner(System.in);		
			
         System.out.print("Dame a�o: ");
         int a�o = teclado.nextInt();
         int NumMes;
         do 
         {
         	System.out.print("Dame mes; ");		 
         	NumMes = teclado.nextInt();
         }
         
				while (NumMes > 12 || NumMes <= 0 );		
         	NumMes--; //NumMes = NumMes - 1;(es lo mismo)  o NumMes--;(igual funciona)

         	System.out.print("El a�o " + a�o);
         	int pos = 0;
				int loes = (int)(a�o%4);
         	int excep100 = (int)(a�o%100);
				int excep400 = (int)(a�o%400);
   
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