import javax.swing.JOptionPane;

public class MayorMenor{

public static void main(String[ ] args) {

int num1,num2,res;

num1=Integer.parseInt(JOptionPane.showInputDialog("DAME EL NUMERO 1"));

num2=Integer.parseInt(JOptionPane.showInputDialog("DAME EL NUMERO 2"));

if(num1>num2)

JOptionPane.showMessageDialog(null,"EL NUMERO MAYOR ES:"+num1);
else
JOptionPane.showMessageDialog(null,"EL NUMERO MAYOR ES:"+num2);


if (num1<num2)
JOptionPane.showMessageDialog(null, "EL NUMERO MENOR ES:"+num1);
else
JOptionPane.showMessageDialog(null, "EL NUMERO MENOR ES:"+num2);

}
}