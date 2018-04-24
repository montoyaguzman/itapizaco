import javax.swing.JOptionPane;

public class TMPR{

public static void main(String []args) {

int num1,num2,num3,res;

num1=Integer.parseInt(JOptionPane.showInputDialog("DAME EL NUMERO 1"));

num2=Integer.parseInt(JOptionPane.showInputDialog("DAME EL NUMERO 2"));

num3=Integer.parseInt(JOptionPane.showInputDialog("DAME EL NUMERO 3"));

while (num1==num2&&num2==num3&&num1==num3){
JOptionPane.showMessageDialog(null, "ERROR");
break;
}

while (num1>num2&&num1>num3){
JOptionPane.showMessageDialog(null,"EL MAYOR ES: " +num1);
break;
}
while (num1<num2&&num1<num3){
JOptionPane.showMessageDialog(null,"EL MENOR ES: " +num1);
break;
}

while ((num2>num1)&&(num2>num3)){
JOptionPane.showMessageDialog(null, "EL MAYOR ES: " +num2);
break;
}
while ((num2<num1)&&(num2<num3)){
JOptionPane.showMessageDialog(null, "EL MENOR ES: " +num2);
break;
}

while ((num3>num1)&&(num3>num2)){ 
JOptionPane.showMessageDialog(null, "EL MAYOR ES: " +num3);
break;
}
while ((num3<num2)&&(num3<num1)){
JOptionPane.showMessageDialog(null, "EL MENOR ES: " +num3);
break;
}

}
}