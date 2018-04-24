import javax.swing.JOptionPane;

public class TablaMultiplicar1{
public static void main (String []args){

int num=0;
String respuesta="si";


while (respuesta.equals("si")){

String Respuesta=JOptionPane.showInputDialog(null, "¿Que tabla de mutliplicar deseas?");
num=Integer.parseInt(Respuesta);


for (int i=0; i<=10; i++){

JOptionPane.showMessageDialog(null, num +" x " + i + " = " + producto(num,i));}
//System.out.println(num +" x " + i + " = " + producto(num,i));}


respuesta=JOptionPane.showInputDialog("Deseas continuar (si/no)?");}

JOptionPane.showMessageDialog(null, "\t\tChao!!!");}

public static int producto (int a, int b){

return a*b;}
}
