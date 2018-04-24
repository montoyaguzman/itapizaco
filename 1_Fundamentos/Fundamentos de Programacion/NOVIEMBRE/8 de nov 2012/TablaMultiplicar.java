import javax.swing.*;
public class TablaMultiplicar{
public static void main (String []args){

int num=0;
String respuesta="si";
while (respuesta.equals("si")){
String Respuesta=JOptionPane.showInputDialog(null, "¿Que tabla de multiplicar deseas?");
num=Integer.parseInt(Respuesta);

for (int i=0; i<=10; i++){
System.out.println(num +" x " + i + " = " + producto(num,i));}

respuesta=JOptionPane.showInputDialog("Do you continue (si/no)?");}

JOptionPane.showMessageDialog(null, "\t\t Bye!");}

public static int producto (int a, int b){

return a*b;}
}

































