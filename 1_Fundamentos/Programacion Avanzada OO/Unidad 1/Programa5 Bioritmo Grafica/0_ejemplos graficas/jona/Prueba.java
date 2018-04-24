import javax.swing.*;
import java.util.*;

public class Prueba {
   public static void main(String h[])
   {  
      int a=0,m=0,d=0;
      //int n=Biorritmo.diasVida(2016,9,12,a,m,d);
      
      Calendar fecha = Calendar.getInstance();    
      int anio = fecha.get(Calendar.YEAR);
      int mes = fecha.get(Calendar.MONTH) + 1;
      int dia = fecha.get(Calendar.DAY_OF_MONTH)+1;
      a = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"AÑO (0000)"));
      m = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"MES (00)"));
      d = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"___INDIQUE SU FECHA DE NACIMIENTO___\n DIA (00)"));        
      
      int n=Biorritmo.diasVida(anio,mes,dia,a,m,d);
         
      double f=Biorritmo.fisico(n); 
      double e=Biorritmo.emocional(n);
      double i=Biorritmo.intelectual(n);
      
      JOptionPane.showMessageDialog(null,
           "Tienes  "+n+" dias de vida\n"
           +"\nCiclo fisico: "+f
           +"\nCiclo emocional: "+e
           +"\nCiclo intelectual: "+i);
   
   }
}
   
   