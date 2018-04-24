import javax.swing.*;

class ES{

   public static String leeC(String nom)
   {
      nom = JOptionPane.showInputDialog(null,"Indique un nombre");
      return nom;
   }
   
   public static int leeI(int edad)
   {
      edad = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"Indique edad"));
      return edad;
   }
   
   public static double leeD(double est)
   {
      est = (double)Double.parseDouble(JOptionPane.showInputDialog(null,"Indique estatura"));
      return est;
   }
   
   public static void escribe(String resultado)
   {
      JOptionPane.showMessageDialog(null,resultado);
   }

}