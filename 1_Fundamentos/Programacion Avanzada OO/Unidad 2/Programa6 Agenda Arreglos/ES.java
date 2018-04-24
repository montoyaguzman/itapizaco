class ES{
  
  static void escribe (String cad){
      javax.swing.JOptionPane.showMessageDialog(null, cad);
  }


  int leeI(String cad){
      int n;
      n=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(cad));
      return n;
  }
   
  String leeC(String cad){
      String n;
      n=javax.swing.JOptionPane.showInputDialog(cad);
      return n;
  }
}