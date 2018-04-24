import javax.swing.*;

public class ES
{
   public static void main (String args[])
   { 
      Operaciones o = new Operaciones();
      int numero, continuar = 0;
         do
   	   { 
            numero = o.esNumero("Dame un numero");         
            try
            {      
                  
                  continuar = (int)Integer.parseInt(JOptionPane.showInputDialog("Presione 1 para reiniciar la app o 2 para finalizar"));
      	   }catch(NumberFormatException nfe)
            {
               o.muestraResultado("\nOpci√≥n inv·lida solo debes teclear 1 o 2");
            }
         }while(continuar == 1);
         o.muestraResultado("\nPrograma finalizado");
	}   
}