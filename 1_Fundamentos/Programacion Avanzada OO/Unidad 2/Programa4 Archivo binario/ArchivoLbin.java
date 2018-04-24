import java.io.*;

class ArchivoLbin{
   public static void main (String ar[])
   {
      try{
         InputStream fis = new FileInputStream("Salida.dat");
         DataInputStream fi = new DataInputStream(fis);
         
         for (int j=1; j<=5; j++){
            String cad=fi.readLine();
            int e=fi.readInt();
            double p=fi.readDouble();
            ES.escribe(cad+" tiene: "+e+" años y mide: "+p);
         }
         fi.close();   
      }catch (IOException e){
         System.out.println("Error "+e);
      }    
   }
}