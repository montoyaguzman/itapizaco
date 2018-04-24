import java.io.*;
import javax.swing.*;
import java.util.*;
import java.text.DecimalFormat;

public class Programa3{

   public static void main(String args[]){
   try
   {
      LinkedList lista1 = new LinkedList();
      LinkedList lista2 = new LinkedList();
      
      InputStream archivo1 = new FileInputStream("Plan Added and Modified Size.txt");
      InputStream archivo2 = new FileInputStream("Actual Development Hours.txt");
      DataInputStream leerArchivo1 = new DataInputStream(archivo1);
      DataInputStream leerArchivo2 = new DataInputStream(archivo2);
      
      String cadena1 = "";
      String cadena2 = "";
      double B0, B1, r, y, r2;
      double sumatoria_x = 0;
      double sumatoria_x2 = 0;
      double sumatoria_y = 0;
      double sumatoria_y2 = 0;
      double sumatoria_xy = 0;
      double media_x = 0;
      double media_y = 0;
      double media_x2 = 0;
      double media_y2 = 0;
      int estimacion;
      
      estimacion = (int)Integer.parseInt(JOptionPane.showInputDialog("¿Cual es tu estimado de lineas de codigo?"));
                  
      while (true)
      {
         cadena1 = leerArchivo1.readLine();
         cadena2 = leerArchivo2.readLine();
         
         if(cadena1 == null)
         break;
         lista1.add(cadena1);
         lista2.add(cadena2);
     }
         
     for (int i = 0; i < lista1.size(); i++)
     {
         cadena1 = (String)lista1.get(i);
         cadena2 =(String)lista2.get(i);
         sumatoria_xy+= Double.parseDouble(cadena1) * Double.parseDouble(cadena2);
         sumatoria_x+= Double.parseDouble(cadena1);
         sumatoria_x2+= Double.parseDouble(cadena1) * Double.parseDouble(cadena1);
         sumatoria_y+= Double.parseDouble(cadena2);
         sumatoria_y2+= Double.parseDouble(cadena2) * Double.parseDouble(cadena2);
     }
           
     media_x = sumatoria_x/lista1.size();
     media_y = sumatoria_y/lista1.size();
            
     B1 = (sumatoria_xy-(lista1.size() * media_x * media_y))/(sumatoria_x2-(lista1.size() * (media_x * media_x)) );
     B0 = media_y-(B1*media_x);
     r = (lista1.size() * sumatoria_xy)-(sumatoria_x * sumatoria_y);
     r=r/(Math.sqrt((lista1.size()*sumatoria_x2)-(sumatoria_x*sumatoria_x))*Math.sqrt((lista1.size()*sumatoria_y2)-(sumatoria_y*sumatoria_y)));
     r2=r*r;
     y=B0+B1*estimacion;
          
     DecimalFormat df4 = new DecimalFormat("#.####");
     DecimalFormat df5 = new DecimalFormat("#.######");
     DecimalFormat df3 = new DecimalFormat("#.###");
     DecimalFormat df = new DecimalFormat("#.##"); 
     JOptionPane.showMessageDialog(null,"\nB1 = " + df4.format(B1) + "\nB0 = " + df.format(B0) + "\nr = " + df4.format(r) + "\nr^2 = "+df4.format(r2) + "\nyk = " + df4.format(y));
                       
     archivo1.close();
     archivo2.close();
     leerArchivo1.close(); 
     leerArchivo2.close();            
   }
                
   catch(IOException e)
   {
      System.out.println("Error"+e);
   }
   }
}