import javax.swing.*;

class Operaciones
{     
   public int esNumero(String numeroIngresado)
   {
      int numero = 0;
      int numeroCuadrado;   
   
      try
      {
         numero = (int)Integer.parseInt(JOptionPane.showInputDialog(numeroIngresado));
         numeroCuadrado = numero * numero;
         muestraResultado("El cuadrado de "+numero+" es "+numeroCuadrado);
               
      }catch(NumberFormatException nfe)
      {
         String mensajeError = "Tu numero no esta bien escrito. Debes ingresar el valor numerico, por ejemplo: 1,2,3 etc. ¡VUELVE A INTENTARLO!";
         muestraResultado(mensajeError);
      }
      return numero;        
   }
   
   public void muestraResultado(String resultado)
   {
      JOptionPane.showMessageDialog(null,resultado);
   }
}