import javax.swing.*;
import java.io.*;
import java.util.*;

class Funciones
{
   double conversion, seno, coseno, x;
   double numero; 
   double potencia, resultadoPotencia = 1;     
   int serie = 0, b = 0, c = 1, suma = 0;
   double n;
   int resultadoFactorial;
   boolean bandera = true;
   String cad = "";
        
   public void eligeOpcion(int opcion) throws IOException
	{
		opcion = opcion;
            
      switch (opcion)
		{
			case 1://SENO
			{
            numero = (Double)Double.parseDouble(JOptionPane.showInputDialog("Ingrese angulo(en grados)"));
            calculaSeno(numero);
            JOptionPane.showMessageDialog(null,"sen("+numero+") = "+seno);
            numero=0;
            x=0;
            seno=0;
            resultadoFactorial=1;
         }break;
			case 2://COSENO
			{
            numero = (Double)Double.parseDouble(JOptionPane.showInputDialog("Ingrese angulo(en grados)"));
            calculaCoseno(numero);
            JOptionPane.showMessageDialog(null,"cos("+numero+") = "+coseno);
            numero=0;
            x=0;
            coseno=0;
            resultadoFactorial=1;
         }break;
         case 3://POTENCIA
         {
            numero = (double)Double.parseDouble(JOptionPane.showInputDialog("Indique número a elevar"));
            potencia = (double)Double.parseDouble(JOptionPane.showInputDialog("Indique la potencia"));
            calculaPotencia(numero,potencia);
            JOptionPane.showMessageDialog(null,numero+" ^ "+potencia+" = "+resultadoPotencia);
            resultadoPotencia = 1;
         }break;
         case 4://PRIMO
         {
            numero = (int)Integer.parseInt(JOptionPane.showInputDialog("¿Es primo?"));
            esPrimo(numero);
            if (bandera==true)
            {
               JOptionPane.showMessageDialog(null,"El "+numero+" es primo");
            }
            else if (bandera==false)
            {
               JOptionPane.showMessageDialog(null,"El "+numero+" no es primo");
            }
            bandera=true;
         }break;
         case 5://FIBONACCI
         {
            int n1 = (int)numero;
            n1 = (int)Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos términos de Fibonacci deseas saber? Introduce un número (MAYOR A 1)"));
            calculaFibonacci(n1);
            JOptionPane.showMessageDialog(null, "La serie es :" +cad);
            serie = 0; 
            b = 0; 
            c = 1; 
            suma = 0;
         }break;
         case 6://PERFECTO
         {
            int n1 = (int)numero;
            n1 = (int)Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número para definir si es perfecto"));
            esPerfecto(n1);
            if (bandera==true)
            {
               JOptionPane.showMessageDialog(null,"El "+n1+" es perfecto");
            }
            else if (bandera==false)
            {
               JOptionPane.showMessageDialog(null,"El "+n1+" no es perfecto");
            }
            numero=0;
            n1=0;
            suma=0;
            bandera = true;
         }break;
         case 7://FACTORIAL
         {
            int n1 = (int)numero;
            n1 = (int)Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número para calcular su factorial"));
            calculaFactorial(n1);
            JOptionPane.showMessageDialog(null,n1+"! = "+resultadoFactorial);
            numero=0;
            n1=0;
         }break;

      }
	}

      
   public double calculaSeno(double numero)
   {
      x = numero*(double)(Math.PI/180);
      for (int k = 0; k<=10; k++)
      {
         seno = seno + ((Math.pow(-1,k))/calculaFactorial((2*k)+1)) * (Math.pow(x,((2*k)+1)));
         //System.out.println(coseno); 
      }
         seno = Math.rint(seno*10000)/10000;
         return seno;
   }

  
   public double calculaCoseno(double numero)
   {
      x = numero*(double)(Math.PI/180);
      for (int k = 0; k<=10; k++)
      {
         coseno = coseno + ((Math.pow(-1,k))/calculaFactorial(2*k)) * (Math.pow(x,2*k));
         //System.out.println(coseno); 
      }
         coseno = Math.rint(coseno*10000)/10000;
         return coseno;
   }

      
   public int calculaFactorial(int n1) 
   {
        resultadoFactorial = 1;
        for (int i = 1; i <= n1; i++) {
            resultadoFactorial *= i;
        }
        return resultadoFactorial;
   }
   
   
   public double calculaPotencia(double numero, double potencia)     
   {
      if (potencia==0)
      {
         resultadoPotencia=1;
      }
      else if (potencia==1)
      {
         resultadoPotencia=numero;
      }
      else
      {
         int i = 1;
         while(i <= potencia)
         {
            resultadoPotencia = resultadoPotencia * numero;
            i++;
         }  
      }return resultadoPotencia;
   } 
   
   public boolean esPrimo(double numero)
   {
      int contador1 = 0;
      for(int j = 1; j <= numero; j++)
      {
         if(numero%j == 0)
         {
             contador1++;
         }
      }
 
      if(contador1>2)
      {          
         bandera = false;
         return bandera;
      }
      else 
      {
         bandera = true;
         return bandera;
      }
   }
   
   public String calculaFibonacci(int n1)
   {   
      int serie1[] = new int[n1];
      
      for (int n = 0; n < n1; n++) 
      {
         serie = b + c;
         c = b;
         b = serie;
         System.out.println(serie);
         serie1[n] = serie;
      }         
         cad = Arrays.toString(serie1);
         return cad;
   }
    
   public boolean esPerfecto(int n1)
   {
      /*
      28
      496
      8128
      */
      for (int l = 1; l < n1; l++) 
      {  
         if (n1 % l == 0) 
         {
            suma = suma + l;
         }
      }
      
      if (suma == n1) 
      {  
         bandera = true;
      } 
      else 
      {
            bandera= false;
      }
         return bandera;
   }      
}   
   
   