import javax.swing.JOptionPane;

public class Enrique{

public static void main (String []args){

int edad;

String Respuesta=JOptionPane.showInputDialog("Dame tu nombre");
String a =(Respuesta);

String Respuesta1=JOptionPane.showInputDialog(null,"¿En que año naciste?");
int b =Integer.parseInt(Respuesta1);


String Respuesta2=JOptionPane.showInputDialog(null, "¿De que año quieres saber tu edad?");
int c =Integer.parseInt(Respuesta2);


edad=c-b;

JOptionPane.showMessageDialog(null,"El usuario \t" + a + "\t tiene de edad: \t" + edad);



}
}



