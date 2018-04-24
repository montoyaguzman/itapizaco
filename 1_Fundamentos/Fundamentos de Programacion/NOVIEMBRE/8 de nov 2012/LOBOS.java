import javax.swing.*; 
public class LOBOS{
public static void main(String[] args) {

int num=0;
String respuesta="si";
while (respuesta.equals("si")){
String Respuesta=JOptionPane.showInputDialog("Que tabla de multiplicar desea");
num=Integer.parseInt(Respuesta);
for(int i=0; i<=10; i++){
    System.out.println(num +" x " + i + " = " + producto(num,i));}

respuesta=JOptionPane.showInputDialog("Deseas continuar (si/no)?");}
JOptionPane.showMessageDialog(null, "\t\tChao!!");}

public static int producto (int a, int b){
return a*b;}

}