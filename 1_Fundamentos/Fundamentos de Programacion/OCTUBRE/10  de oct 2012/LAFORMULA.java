import javax.swing.JOptionPane;

public class LAFORMULA {
public static void main (String []args){

         int grade;
          grade=Integer.parseInt(JOptionPane.showInputDialog("DAME TU CALIFICACION"));
            int Grade=92;
          switch(grade){

   case ((grade<=100)&&(grade>=91)):
    JOptionPane.showMessageDialog(null,"Excelente!");
     break;

case 90:
    JOptionPane.showMessageDialog(null,"Eso es todo");
    break;

case 80:
    JOptionPane.showMessageDialog(null,"Estudia mas duro");
     break;

 case 70:
    JOptionPane.showMessageDialog(null,"Estas chavo!");
    break;
default:
    JOptionPane.showMessageDialog(null,"Reprobaste");

    }
  }
}

