import javax.swing.JOptionPane;

public class Nazza{

public static void main (String []args){

int edad;
String resp= "si";
//String resp1="no";

while(resp.equals("si")){


String Respuesta=JOptionPane.showInputDialog("Dame tu nombre");
String a =(Respuesta);

String Respuesta1=JOptionPane.showInputDialog(null,"�En que a�o naciste?");
int b =Integer.parseInt(Respuesta1);

String Respuesta2=JOptionPane.showInputDialog(null, "�De que a�o quieres saber tu edad?");
int c =Integer.parseInt(Respuesta2);

edad=c-b;

JOptionPane.showMessageDialog(null,"El usuario \t" + a + "\t tiene de edad: \t" + edad);

resp=JOptionPane.showInputDialog(null, "�Quieres seguir ejecutando el programa?(si/no)");}

JOptionPane.showMessageDialog(null, "�Ya termine!");}

}





