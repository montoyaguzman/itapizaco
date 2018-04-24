import java.io.*;
import javax.swing.*;
import java.util.*;
import java.text.DecimalFormat;

public class Programa4{

   public static void main(String args[]){
   
   try
   { 
      LinkedList lista1 = new LinkedList();
      LinkedList lista2 = new LinkedList();
      LinkedList resultado = new LinkedList();
      
      InputStream archivo1 = new FileInputStream("lineas de codigo.txt");
      InputStream archivo2 = new FileInputStream("numero de metodos.txt");
      DataInputStream leeArchivo1 = new DataInputStream(archivo1);
      DataInputStream leeArchivo2 = new DataInputStream(archivo2);
          
      String cadena1 = "";
      String cadena2 = "";
      double suma = 0;
      int numeroDeElementos;
          
      while (true)
      {
         cadena1 = leeArchivo1.readLine();
         cadena2 = leeArchivo2.readLine();
         
         if(cadena1 == null)
         break;
            
         lista1.add(cadena1);
         lista2.add(cadena2);
      }
          
      
      for (numeroDeElementos = 0; numeroDeElementos < lista1.size(); numeroDeElementos++)
      {
         double elementos1 = Double.parseDouble((String)lista1.get(numeroDeElementos));
         double elementos2 = Double.parseDouble((String)lista2.get(numeroDeElementos));
         double division = elementos1 / elementos2;
         double ln = Math.log(division);
         resultado.add(ln);
         suma = suma + ln;
      }
      
      double media = suma / lista1.size();
      double resultado1=0;
      double resta;
      double elevar;
            
      for (int contador = 0; contador < lista1.size(); contador++)
      {
         resta = (double)resultado.get(contador)-media;
         elevar = Math.pow(resta,2);
         resultado1 = resultado1 + elevar;
      }
            
      double varianza = (resultado1/(lista1.size()-1));
      double lnMenosMedia =0;
      double sumatorialnMedia =0;

      for (int contador = 0; contador < lista1.size(); contador++)
      {
         lnMenosMedia = Math.pow((double)resultado.get(contador) - media,2);
         sumatorialnMedia = sumatorialnMedia + lnMenosMedia;
      }
            
         double desviacionEstandar = Math.sqrt(varianza);
         double vs = media - (2*desviacionEstandar);
         vs = Math.exp(vs);
         double s = media - desviacionEstandar;
         s = Math.exp(s);
         double m = media;
         m = Math.exp(m);
         double l = media + desviacionEstandar;
         l = Math.exp(l);
         double vl = media+(2*desviacionEstandar);
         vl = Math.exp(vl);
         
         DecimalFormat df = new DecimalFormat("#.####");
         JOptionPane.showMessageDialog(null,"VS= "+df.format(vs)+"\n" +"S= "+df.format(s)+"\n" +"M= "+df.format(m)+"\n" +"L= " + df.format(l)+"\n" +"VL= "+df.format(vl));

             
         archivo1.close();
         archivo2.close();
         leeArchivo1.close(); 
         leeArchivo2.close();            
    }                
    catch(IOException e)
    {
      System.out.println("Error"+e);
    }
   }
}