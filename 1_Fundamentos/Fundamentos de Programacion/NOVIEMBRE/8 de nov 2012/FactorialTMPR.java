import javax.swing.*;
 
public class FactorialTMPR{
public static void main(String []args){

String Numero=JOptionPane.showInputDialog("Dame un numero");
double num = Double.parseDouble(Numero);		

double i;
double r= 1;
		
	
				
for(i = 1; i <= num; i++){

r = r * i;
}

JOptionPane.showMessageDialog(null, "El factorial es: " + r);
}
}