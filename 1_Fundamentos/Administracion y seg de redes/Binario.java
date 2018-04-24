public class Binario
{
   public static void main (String args[])
   {
      String cadena = "oso";
      String auxiliarCadena;
      int binario;
      int tamañoDeLaCadena = 0;
            
      tamañoDeLaCadena = cadena.length(); 
      
      for (int i = 0; i < tamañoDeLaCadena; i++)
      {
         binario = cadena.charAt(i);
         auxiliarCadena = Integer.toBinaryString(binario);
         
         System.out.println("EL CARACTER '"+cadena.charAt(i)+"' CONVERTIDO A BINARIO ES "+binario);
      }
   }
}