import javax.swing.*;
import java.io.*;
import java.util.*;

class Operaciones
{
   double diaNacimiento,mesNacimiento,anioNacimiento, diasVividos = 0;
   //double diasDelAnio = 365.242189;
   double diasDelAnio = 365.25;
   double diasCicloFisico, diasCicloEmocional,diasCicloIntelectual;
   double pi = Math.PI;
   
   //OBTENER FECHA
   Calendar fecha = Calendar.getInstance();    
   double diaActual = fecha.get(Calendar.DAY_OF_MONTH); 
   double mesActual = fecha.get(Calendar.MONTH)+1;
   double anioActual = fecha.get(Calendar.YEAR);  
                
   public double calculaDiasVividos(double diaNacimiento, double mesNacimiento, double anioNacimiento) throws IOException
	{   
      diasVividos = ((anioActual-anioNacimiento)*diasDelAnio) + ((diaActual-diaNacimiento)+((mesActual-mesNacimiento)*(diasDelAnio/2)));
      diasVividos = Math.rint(diasVividos*1)/1;
      System.out.print(diasVividos);
      return diasVividos;
      /*calculaCicloFisico(diasVividos);
      calculaCicloEmocional(diasVividos);
      calculaCicloIntelectual(diasVividos);
      /*int diaActual1=(int)diaActual;
      int mesActual1=(int)mesActual;
      int anioActual1=(int)anioActual;
      JOptionPane.showMessageDialog(null,"LA FECHA DE HOY \n\nDIA: "+diaActual1+" MES: "+mesActual1+" AÑO:"+anioActual1);
      JOptionPane.showMessageDialog(null,"Dias vividos: "+diasVividos+"\nCiclo fisico: "+diasCicloFisico+"\nCiclo emocional: "+diasCicloEmocional+"\nCiclo intelectual: "+diasCicloIntelectual);
      
      diasVividos = 0;
      diasCicloFisico = 0;      
      diasCicloEmocional = 0;
      diasCicloIntelectual = 0;
      */
   //}   
   /*
   public double calculaCicloFisico(double diasVividos)
   {
      
      double a1;
      diasVividos=diasVividos%23;
      a1 = (2*pi*diasVividos)/23;
      diasCicloFisico = (Math.sin(a1));
      return diasCicloFisico;
      
      
      /*  
      double a1;
      double diasCicloFisico1 = 0;
      int dv = (int)(diasVividos);
      for (int z=dv-50; z<=dv+50; z+=1)
      {
         
         diasCicloFisico = (Math.sin((2*pi*z)/23)); 
         System.out.println("dia "+z+" = "+diasCicloFisico);
         /*if(z==dv)
         diasCicloFisico1 = diasCicloFisico; 
         
      }   
         return diasCicloFisico1;*/
   
   //}
   /*
   public double calculaCicloEmocional(double diasVividos)
   {
      double b1;
      diasVividos=diasVividos%28;
      b1 = (2*Math.PI*diasVividos)/28;
      diasCicloEmocional = (Math.sin(b1));
      return diasCicloEmocional;
   }
   
   public double calculaCicloIntelectual(double diasVividos)
   {
      double c1;
      diasVividos=diasVividos%33;
      c1 = (2*Math.PI*diasVividos)/33;
      diasCicloIntelectual = (Math.sin(c1));
      return diasCicloIntelectual;
   */
   }
   
}		