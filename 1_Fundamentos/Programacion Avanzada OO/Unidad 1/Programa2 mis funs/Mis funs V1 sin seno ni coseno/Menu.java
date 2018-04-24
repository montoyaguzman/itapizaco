import javax.swing.*;
import java.io.*;

public class Menu
{ 
   Funciones operador = new Funciones();
   
   public void muestraMenu()throws IOException
   {	 
      int opcionElegida = 0, continuar = 0;
      do
   	{ 
         opcionElegida = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"\n______CALCULADORA MONTY_____\n¿Qué magnitud desea calcular?\n"+"\n1. Seno de un ángulo (grados)"+"\n2. Coseno de un ángulo (grados)"+"\n3. Potencia "+"\n4. Primo"+"\n5. Fibonacci"+"\n6. Número perfecto"+"\n7. Factorial\n\n"));        
         operador.eligeOpcion(opcionElegida);
         try
         {                      
            continuar = (int)Integer.parseInt(JOptionPane.showInputDialog("Presione 1 para reiniciar la app o 2 para finalizar"));
      	}
         catch(NumberFormatException nfe)
         {
            JOptionPane.showMessageDialog(null,"\nOpción invalida solo debes teclear 1 o 2");
         }
      }while(continuar == 1);
         JOptionPane.showMessageDialog(null,"\nPrograma finalizado");
   }
}	