import javax.swing.*;
import java.io.*;
import java.util.*;

class Operaciones
{
   double diaNacimiento,mesNacimiento,anioNacimiento, diasVividos = 0;
   double diasDelAnio = 365.242189;
   //double diasDelAnio = 365.25;
   double diasCicloFisico, diasCicloEmocional,diasCicloIntelectual;
   Calendar fecha = Calendar.getInstance();    
   double diaActual = fecha.get(Calendar.DAY_OF_MONTH)+1; 
   double mesActual = fecha.get(Calendar.MONTH) + 1;
   double anioActual = fecha.get(Calendar.YEAR);  
        
   public void calculaDiasVividos(double diaNacimiento, double mesNacimiento, double anioNacimiento) throws IOException
	{   
      diasVividos = ((anioActual-anioNacimiento)*diasDelAnio) + ((diaActual-diaNacimiento)+((mesActual-mesNacimiento)*(diasDelAnio/2)));
      System.out.print(diasVividos);
      diasVividos = Math.rint(diasVividos*1)/1;
      //System.out.print("\n"+diasVividos);
      calculaCicloFisico(diasVividos);
      calculaCicloEmocional(diasVividos);
      calculaCicloIntelectual(diasVividos);
      
      JOptionPane.showMessageDialog(null,"LA FECHA DE HOY \n\nDIA: "+diaActual+" MES: "+mesActual+" AÑO:"+anioActual);
      JOptionPane.showMessageDialog(null,"Dias vividos: "+diasVividos+"\nCiclo fisico: "+diasCicloFisico+"\nCiclo emocional: "+diasCicloEmocional+"\nCiclo intelectual: "+diasCicloIntelectual);
      
      /*diasVividos = 0;
      diasCicloFisico = 0;      
      diasCicloEmocional = 0;
      diasCicloIntelectual = 0;*/
   }
   
   public double calculaCicloFisico(double diasVividos)
   {
      double a1;
      a1 = (2*Math.PI*diasVividos)/23;
      diasCicloFisico = (Math.sin(a1));
      return diasCicloFisico;
   }
   
   public double calculaCicloEmocional(double diasVividos)
   {
      double b1;
      b1 = (2*Math.PI*diasVividos)/28;
      diasCicloEmocional = (Math.sin(b1));
      return diasCicloEmocional;
   }
   
   public double calculaCicloIntelectual(double diasVividos)
   {
      double c1;
      c1 = (2*Math.PI*diasVividos)/33;
      diasCicloIntelectual = (Math.sin(c1));
      return diasCicloIntelectual;
   }
   
}		