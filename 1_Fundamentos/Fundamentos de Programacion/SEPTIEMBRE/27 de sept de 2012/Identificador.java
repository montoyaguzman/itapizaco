import javax.swing.JOptionPane;

public class Identificador{

public static void main(String []args) {

int num1,num2,res;

num1=Integer.parseInt(JOptionPane.showInputDialog("DAME EL NUMERO 1"));

num2=Integer.parseInt(JOptionPane.showInputDialog("DAME EL NUMERO 2"));


if(num1==num2){
JOptionPane.showMessageDialog(null,"SON NUMEROS IGUALES: "+num1+' '+'y'+' '+num2);
}
else
if(num1>num2){
JOptionPane.showMessageDialog(null,"EL MAYOR es: "+ num1);
JOptionPane.showMessageDialog(null, "EL MENOR es: "+num2);
}
else
if (num1<num2){
JOptionPane.showMessageDialog(null,"EL MENOR es: "+ num1);
JOptionPane.showMessageDialog(null, "EL MAYOR es: "+num2);
}
}
}