import java.io.*;

class ArchivoEbin{
   
   public static void main (String ar[])
   {
      String nom="";
      int edad=0;
      double est=0.0;
      
      try
      {  
         DataOutputStream fo = new DataOutputStream (new FileOutputStream("Salida.dat"));
         
         //do{
         for (int i = 1; i<=5; i++)
         {
            nom = ES.leeC(nom);
            edad = ES.leeI(edad);
            est = ES.leeD(est);
            
            System.out.print(nom);
            
            fo.writeBytes(nom+"\n");
            fo.writeInt(edad);
            fo.writeDouble(est);
         }
         
         fo.close();
      }catch(IOException e){
         System.out.print("Error "+e);
      }
   }   
            
}