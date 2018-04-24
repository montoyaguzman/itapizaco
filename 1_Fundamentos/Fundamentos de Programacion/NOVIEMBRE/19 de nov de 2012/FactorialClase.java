import javax.swing.*;
 
public class FactorialClase{
public static void main(String []args){


int num=0;
String respuesta="si";

while (respuesta.equals("si")){


String Numero=JOptionPane.showInputDialog("Dame un numero");
double num = Double.parseDouble(Numero);		

				
for(i = 1; i <= num; i++){
JOptionPane.showMessageDialog(null, "El factorial es: " +factorial(num,i));


respuesta=JOptionPane.showInputDialog("Deseas continuar (si/no)?");}

JOptionPane.showMessageDialog(null, "\t\tChao!!!");}

public class static double factorial(double r, double i){
return r * i;}

}
}








