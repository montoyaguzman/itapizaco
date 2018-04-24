import java.io.*;
import java.util.*;

class Operaciones
{
   double diaNacimiento,mesNacimiento,anioNacimiento, diasVividos = 0;
   double diasDelAnio = 365.25;
   //double diasDelAnio = 365.242189;
   //double diasCicloFisico, diasCicloEmocional,diasCicloIntelectual;
   double pi = Math.PI;
   
   Calendar fecha = Calendar.getInstance();    
   double diaActual = fecha.get(Calendar.DAY_OF_MONTH); 
   double mesActual = fecha.get(Calendar.MONTH)+1;
   double anioActual = fecha.get(Calendar.YEAR);  
                
   public double calculaDiasVividos(double diaNacimiento, double mesNacimiento, double anioNacimiento) throws IOException
	{   
      //System.out.println("dia: "+diaNacimiento+"mes: "+mesNacimiento+"anio: "+anioNacimiento);
      //System.out.println("dia: "+diaActual+"mes: "+mesActual+"anio: "+anioActual);
      diasVividos = ((anioActual-anioNacimiento)*diasDelAnio) + ((diaActual-diaNacimiento)+((mesActual-mesNacimiento)*(diasDelAnio/2)));
      diasVividos = Math.rint(diasVividos*1)/1;
      System.out.println("dias vividos: "+diasVividos);
      return diasVividos;
   }   
}		


