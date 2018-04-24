class ES {
   static void escribe (String cad)
   {
   
      javax.swing.JOptionPane.showMessageDialog(null, cad);
   }


   static int leeI(String cad)
   {
      int n;
      n=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(cad));
      return n;
   }
   
   static String leeC (String cad)
   {
      String n;
      n=javax.swing.JOptionPane.showInputDialog(cad);
      return n;
   }
   
   static Double leeD (String cad)
   {
      double n;
      n=Double.parseDouble(javax.swing.JOptionPane.showInputDialog(cad));
      return n;
   }
}